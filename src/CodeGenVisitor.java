import java.util.ArrayList;

public class CodeGenVisitor extends  TJBBaseVisitor<ArrayList<String>> {
    private Singleton singleton = Singleton.getInstance();

    private final ArrayList<String> variables = new ArrayList<>();
    //Variables here...

    public CodeGenVisitor() {
        //Empty constructor, nothing needed.
    }

    @Override
    public ArrayList<String> visitCodeLine(TJBParser.CodeLineContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (TJBParser.ExpressionContext expression: ctx.expression()) {
            code.addAll(visit(expression));
        }

        code.add(0, "\t.limit\tstack\t25");
        code.add(1, "\t.limit\tlocals\t" + (variables.size() + 1) + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsn(TJBParser.NumAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        //Due to the typechecker we're always sure this variable is new and we do not have to check if it already exists.
        String numID = ctx.name.getText();
        variables.add(numID);
        int indexOffset = variables.size();

        code.addAll(visit(ctx.calculation()));

        //FIXME: HERE I HAVE TO KNOW IF IT'S AN INTEGER OR A DOUBLE!!!
        code.add("\tistore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsn(TJBParser.StrAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String strID = ctx.name.getText();
        variables.add(strID);
        int indexOffset = variables.size();

        code.add("\tldc\t" + ctx.value.getText());
        code.add("\tastore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitArrAsn(TJBParser.ArrAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String arrID = ctx.name.getText();
        variables.add(arrID);
        int indexOffset = variables.size();

        //TODO - Yoran: Figure out how arrays work and are made in Jasmin!

        return code;
    }

    @Override
    public ArrayList<String> visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String strID = ctx.name.getText();

        String copyStrID = ctx.value.getText();
        int copyOffset = variables.indexOf(copyStrID) + 1;

        variables.add(strID);
        int indexOffset = variables.size();

        //Get the value from the requested string's local slot.
        code.add("\taload\t" + copyOffset);
        //Store it on this new variable's local slot.
        code.add("\tastore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String arrID = ctx.name.getText();

        String copyArrID = ctx.value.getText();
        int copyOffset = variables.indexOf(copyArrID) + 1;

        variables.add(arrID);
        int indexOffset = variables.size();

        //TODO - Yoran: Figure out how arrays work and are made in Jasmin!

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String numID = ctx.name.getText();
        int indexOffset = variables.indexOf(numID) + 1;

        code.addAll(visit(ctx.calculation()));

        //FIXME: HERE I HAVE TO KNOW IF IT'S AN INTEGER OR A DOUBLE!!!
        code.add("\tistore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String strID = ctx.name.getText();
        int indexOffset = variables.indexOf(strID) + 1;

        code.add("\tldc\t" + ctx.value.getText());
        code.add("\tastore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String strID = ctx.name.getText();
        int indexOffset = variables.indexOf(strID) + 1;

        String copyStrID = ctx.value.getText();
        int copyIndexOffset = variables.indexOf(copyStrID) + 1;

        code.add("\taload\t" + copyIndexOffset);
        code.add("\tastore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String arrID = ctx.name.getText();
        int indexOffset = variables.indexOf(arrID) + 1;

        String copyArrID = ctx.value.getText();
        int copyIndexOffset = variables.indexOf(copyArrID) + 1;

        //TODO - Yoran: Figure out how arrays work and are made in Jasmin!

        return code;
    }

    @Override
    public ArrayList<String> visitExParentheses(TJBParser.ExParenthesesContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.calculation()));

        return code;
    }

    @Override
    public ArrayList<String> visitExNegate(TJBParser.ExNegateContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.calculation()));

        //FIXME: Maybe this has to be done as well? IF USING THIS, WE ALSO HAVE TO KNOW IF THE CALCULATION IS INT OR DBL
        //Multiply by -1 to turn the calculation from positive to negative or the other way around.
//        code.add("\tldc\t-1");
//        code.add("\timul");

        return code;
    }

    @Override
    public ArrayList<String> visitExAddOp(TJBParser.ExAddOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));

        code.add(ctx.op.getText().equals("+") ? "\tiadd\n" : "\tisub\n");

        return code;
    }

    @Override
    public ArrayList<String> visitExModOp(TJBParser.ExModOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));

        //FIXME: I HAVE TO KNOW IF IT'S A DOUBLE OR AN INT HERE
        code.add("\tirem\n");

        return code;
    }

    @Override
    public ArrayList<String> visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String varID = ctx.val.getText();
        int indexOffset = variables.indexOf(varID) + 1;

        if (indexOffset == 0) {
            //Var doesn't exist.
            //FIXME: Throw an exception or return 0?
        } else {
            Type valueType = singleton.getSymbolTable().getSymTable().get(varID);

            if (valueType.equals(Type.INT) || valueType.equals(Type.BOOLEAN)) {
                code.add("\tiload\t" + indexOffset);
            } else if (valueType.equals(Type.DOUBLE)) {
                code.add("\tdload\t" + indexOffset);
            } else if (valueType.equals(Type.STRING) || valueType.equals(Type.ARRAY)) {
                code.add("\taload\t" + indexOffset);
            } else {
                //For some reason we know the var exists but the SymbolTable does not, so assume it's right.
                //FIXME: Throw an exception or return 0?
            }
        }

        return code;
    }

    @Override
    public ArrayList<String> visitExDblLiteral(TJBParser.ExDblLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tldc\t" + ctx.DBL().getText());

        return code;
    }

    @Override
    public ArrayList<String> visitExNegLiteral(TJBParser.ExNegLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tldc\t" + ctx.NIN().getText());

        return code;
    }

    @Override
    public ArrayList<String> visitExIntLiteral(TJBParser.ExIntLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tldc\t" + ctx.INT().getText());

        return code;
    }

    @Override
    public ArrayList<String> visitBoolParentheses(TJBParser.BoolParenthesesContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.bool));

        return code;
    }

    @Override
    public ArrayList<String> visitBoolNeg(TJBParser.BoolNegContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.bool));
        //FIXME? Do something to make the result negative here?

        return code;
    }

    @Override
    public ArrayList<String> visitBoolComp(TJBParser.BoolCompContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));

        String comparisonToken = ctx.comp.getText();

        //TODO - Yoran: Figure out comparisons.
        if (comparisonToken.equals("<")) {
            code.add("");
        } else if (comparisonToken.equals("<=")) {
            code.add("");
        } else if (comparisonToken.equals("=")) {
            code.add("");
        } else if (comparisonToken.equals("!=")) {
            code.add("");
        } else if (comparisonToken.equals(">")) {
            code.add("");
        } else if (comparisonToken.equals(">=")) {
            code.add("");
        } else if (comparisonToken.equals("||")) {
            code.add("");
        } else if (comparisonToken.equals("And")) {
            code.add("");
        } else if (comparisonToken.equals("&&")) {
            code.add("");
        } else if (comparisonToken.equals("Or")) {
            code.add("");
        }

        return code;
    }

    @Override
    public ArrayList<String> visitCommentLine(TJBParser.CommentLineContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\t;\t" + ctx.STR().getText());

        return code;
    }

    @Override
    public ArrayList<String> visitDisplay(TJBParser.DisplayContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (TJBParser.DisplayOptionsContext displayOptions: ctx.displayOptions()) {
            code.addAll(visit(displayOptions));
        }

        return code;
    }

    @Override
    public ArrayList<String> visitDispSTR(TJBParser.DispSTRContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + ctx.STR().getText());
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        return code;
    }

    @Override
    public ArrayList<String> visitDispSTRID(TJBParser.DispSTRIDContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");

        String strID = ctx.name.getText();
        int indexOffset = variables.indexOf(strID) + 1;

        code.add("\taload\t" + indexOffset);
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        return code;
    }

    @Override
    public ArrayList<String> visitDispCalc(TJBParser.DispCalcContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.addAll(visit(ctx.calculation()));
        //FIXME: I HAVE TO KNOW IF THE RETURNING VALUE IS AN INT OR A DOUBLE HERE!
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(I)V\n");

        return code;
    }

    @Override
    public ArrayList<String> visitDispArray(TJBParser.DispArrayContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String arrID = ctx.name.getText();
        int indexOffset = variables.indexOf(arrID) + 1;

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");

        code.add("\taload\t" + indexOffset);

        //FIXME - Yoran: CHECK IF THIS IS CORRECT FOR ARRAYS!
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava.lang.reflect.Array;)V\n");

        return code;
    }

    //TODO STILL TO ADD:
    // - If statements;
    // - For loops;
    // - While loops;

    //visit methods here.
}
