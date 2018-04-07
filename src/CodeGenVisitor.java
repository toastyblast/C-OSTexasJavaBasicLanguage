import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.security.Signature;
import java.util.ArrayList;
import java.util.List;

public class CodeGenVisitor extends TJBBaseVisitor<ArrayList<String>> {
    private Singleton singleton = Singleton.getInstance();

    private final ArrayList<String> variables = new ArrayList<>();
    private int forSequence = 0;
    private int whileSequence = 0;
    private int ifSequence = 0;
    //Variables here...

    public CodeGenVisitor() {
        //Empty constructor, nothing needed.
    }

    @Override
    public ArrayList<String> visitCodeLine(TJBParser.CodeLineContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (TJBParser.ExpressionContext expression : ctx.expression()) {
            code.addAll(visit(expression));
        }

        code.add(0, "\t.limit\tstack\t40");
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

        Type type = singleton.getCheckUpTable().get(ctx);
        switch (type) {
            case INT:
                code.add("\tistore\t" + indexOffset + "\n");
                break;
            case DOUBLE:
                code.add("\tfstore\t" + indexOffset + "\n");
                break;
        }

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

        List<ParseTree> terminalNodes = new ArrayList<>();

        for (int i = 0; i < ctx.value.getChildCount(); i++) {
            if (!ctx.value.getChild(i).getText().equals("{") &&
                    !ctx.value.getChild(i).getText().equals("}") &&
                    !ctx.value.getChild(i).getText().equals(",")) {
                terminalNodes.add(ctx.value.getChild(i));
            }
        }

        Type type = singleton.getCheckUpTable().get(ctx.value);
        code.add("\tldc\t" + terminalNodes.size());

        switch (type) {
            case INTARRAY:
                code.add("\tnewarray\tint");
                code.add("\tastore\t" + indexOffset + "\n");

                for (int i = 0; i < terminalNodes.size(); i++) {
                    code.add("\taload\t" + indexOffset);
                    code.add("\tldc\t" + i);

                    if (terminalNodes.get(i) instanceof TerminalNode) {
                        code.add("\tldc\t" + terminalNodes.get(i).getText());
                    } else if (terminalNodes.get(i) instanceof TJBParser.CalculationContext) {

                        if (terminalNodes.get(i).getChild(0) instanceof TJBParser.CheckVARContext) {
                            code.add("\tiload\t" + (variables.indexOf(terminalNodes.get(i).getChild(0).getText()) + 1));
                        } else {
                            code.addAll(visit(terminalNodes.get(i)));
                        }
                    }

                    code.add("\tiastore\n");
                }

                break;
            case DOUBLEARRAY:
                code.add("\tnewarray\tfloat");
                code.add("\tastore\t" + indexOffset + "\n");

                for (int i = 0; i < terminalNodes.size(); i++) {
                    code.add("\taload\t" + indexOffset);
                    code.add("\tldc\t" + i);

                    if (terminalNodes.get(i) instanceof TerminalNode) {
                        code.add("\tldc\t" + terminalNodes.get(i).getText());

                        if (!terminalNodes.get(i).getText().contains(".")) {
                            code.add("\ti2f");
                        }
                    } else if (terminalNodes.get(i) instanceof TJBParser.CalculationContext) {

                        if (terminalNodes.get(i).getChild(0) instanceof TJBParser.CheckVARContext) {
                            Symbol symbol = singleton.getSymbolTable().getSymTable().get(terminalNodes.get(i).getChild(0).getText());
                            code.add("\tiload\t" + (variables.indexOf(terminalNodes.get(i).getChild(0).getText()) + 1));

                            if (symbol.getType() == Type.INT) {
                                code.add("\ti2f");
                            }
                        } else {
                            Type type1 = singleton.getCheckUpTable().get(terminalNodes.get(i));
                            code.addAll(visit(terminalNodes.get(i)));

                            if (type1 == Type.INT) {
                                code.add("\ti2f");
                            }
                        }
                    }

                    code.add("\tfastore\n");
                }

                break;
            case STRINGARRAY:
                code.add("\tanewarray\tjava/lang/String");
                code.add("\tastore\t" + indexOffset + "\n");

                for (int i = 0; i < terminalNodes.size(); i++) {
                    code.add("\taload\t" + indexOffset);
                    code.add("\tldc\t" + i);

                    if (terminalNodes.get(i) instanceof TerminalNode) {
                        code.add("\tldc\t" + terminalNodes.get(i).getText());
                    } else if (terminalNodes.get(i) instanceof TJBParser.CheckSTRIDContext) {
                        code.add("\taload\t" + (variables.indexOf(terminalNodes.get(i).getChild(0).getText()) + 1));
                    }

                    code.add("\taastore\n");
                }

                break;
        }

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

        Type type = singleton.getCheckUpTable().get(ctx);
        switch (type) {
            case INT:
                code.add("\tistore\t" + indexOffset + "\n");
                break;
            case DOUBLE:
                code.add("\tfstore\t" + indexOffset + "\n");
                break;
        }

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

        //Multiply by -1 to turn the calculation from positive to negative or the other way around.
        Type type = singleton.getCheckUpTable().get(ctx);
        switch (type) {
            case INT:
                code.add("\tldc\t-1");
                code.add("\timul\n");
                break;
            case DOUBLE:
                code.add("\tldc\t-1.0");
                code.add("\tfmul\n");
                break;
        }

        return code;
    }

    @Override
    public ArrayList<String> visitExAddOp(TJBParser.ExAddOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        Type leftType = singleton.getCheckUpTable().get(ctx.left);
        Type rightType = singleton.getCheckUpTable().get(ctx.right);

        code.addAll(visit(ctx.left));

        if (leftType == Type.INT && rightType == Type.DOUBLE) {
            //Turn the left value into a float not to lose precision.
            code.add("\ti2f");
            leftType = Type.DOUBLE;
            code.addAll(visit(ctx.right));
        } else if (leftType == Type.DOUBLE && rightType == Type.INT) {
            //Turn the right value into a float not to loose precision.
            code.addAll(visit(ctx.right));
            code.add("\ti2f");
        } else {
            code.addAll(visit(ctx.right));
        }

        switch (leftType) {
            case INT:
                code.add(ctx.op.getText().equals("+") ? "\tiadd\n" : "\tisub\n");
                break;
            case DOUBLE:
                code.add(ctx.op.getText().equals("+") ? "\tfadd\n" : "\tfsub\n");
                break;
        }

        return code;
    }

    @Override
    public ArrayList<String> visitExModOp(TJBParser.ExModOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        Type leftType = singleton.getCheckUpTable().get(ctx.left);
        Type rightType = singleton.getCheckUpTable().get(ctx.right);

        code.addAll(visit(ctx.left));

        if (leftType == Type.INT && rightType == Type.DOUBLE) {
            //Turn the left value into a float not to lose precision.
            code.add("\ti2f");
            leftType = Type.DOUBLE;
            code.addAll(visit(ctx.right));
        } else if (leftType == Type.DOUBLE && rightType == Type.INT) {
            //Turn the right value into a float not to loose precision.
            code.addAll(visit(ctx.right));
            code.add("\ti2f");
        } else {
            code.addAll(visit(ctx.right));
        }

        switch (leftType) {
            case INT:
                code.add("\tirem\n");
                break;
            case DOUBLE:
                code.add("\tfrem\n");
                break;
        }

        return code;
    }

    @Override
    public ArrayList<String> visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String varID = ctx.val.getText();
        int indexOffset = variables.indexOf(varID) + 1;

        Type valueType = singleton.getCheckUpTable().get(ctx.val);

        if (valueType.equals(Type.INT) || valueType.equals(Type.BOOLEAN)) {
            code.add("\tiload\t" + indexOffset);
        } else if (valueType.equals(Type.DOUBLE)) {
            code.add("\tfload\t" + indexOffset);
        } else if (valueType.equals(Type.STRING) || valueType.equals(Type.ARRAY)) {
            code.add("\taload\t" + indexOffset);
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
    public ArrayList<String> visitIfTJB(TJBParser.IfTJBContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int ifNumber = ifSequence++;

        code.add("if_" + ifNumber + ":");
        //First add the if-statement
        code.addAll(visit(ctx.ifStatement()));

        int elseIfNumber = 0;
        //Then any else-if-statements
        for (TJBParser.ElseIfStatementContext elseIfStatement : ctx.elseIfStatement()) {
            elseIfNumber++;

            code.add("elseIf_" + ifNumber + "-" + elseIfNumber + ":");
            //Add all the expressions within the else-if statement
            code.addAll(visit(elseIfStatement));
            code.add("\tgoto\tallDone_" + ifNumber + "\n");

            code.add("elseIfDone_" + elseIfNumber + ":");
        }

        //And finally the else-statement
//        for (TJBParser.ElseStatementContext elseStatement : ctx.elseStatement()) {
//            code.add("else_" + ifNumber + ":");
//            //Visit all the expressions in the else-statement.
//            code.addAll(visit(elseStatement));
//            code.add("\tgoto\tallDone_" + ifNumber + "\n");
//        }

        //And finally the else-statement, if there is one.
        //TODO: Fix else statement
        ArrayList<String> elseCode = visit(ctx.elseStatement());
        if (elseCode != null && elseCode.size() != 0) {
            code.add("else_" + ifNumber + ":");
            //Visit all the expressions in the else-statement.
            code.addAll(elseCode);
            code.add("\tgoto\tallDone_" + ifNumber + "\n");
        }

        code.add("allDone_" + ifNumber + ":\n");

        return code;
    }

    @Override
    public ArrayList<String> visitIfStatement(TJBParser.IfStatementContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int ifNumber = ifSequence - 1;

        code.addAll(visit(ctx.bool));

        //Change the comparison to have the right label to it.
        code.set((code.size() - 1), code.get(code.size() - 1) + "ifDone_" + ifNumber);

        code.addAll(visit(ctx.thenStatement()));
        code.add("\tgoto\tallDone_" + ifNumber);

        code.add("ifDone_" + ifNumber + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitElseIfStatement(TJBParser.ElseIfStatementContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int ifNumber = ifSequence;

        code.addAll(visit(ctx.bool));

        //Change the comparison to have the right label to it.
        code.set((code.size() - 1), code.get(code.size() - 1) + "elseIfDone_" + ifNumber);

        code.addAll(visit(ctx.thenStatement()));

        return code;
    }

    @Override
    public ArrayList<String> visitElseStatement(TJBParser.ElseStatementContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (TJBParser.ExpressionContext expressionContext : ctx.expression()) {
            code.addAll(visit(expressionContext));
        }

        return code;
    }

    @Override
    public ArrayList<String> visitThenStatement(TJBParser.ThenStatementContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (TJBParser.ExpressionContext expressionContext : ctx.expression()) {
            code.addAll(visit(expressionContext));
        }

        return code;
    }

    @Override
    public ArrayList<String> visitBoolNeg(TJBParser.BoolNegContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll(visit(ctx.bool));

        //TODO: How to do negation of booleans?

        return code;
    }

    @Override
    public ArrayList<String> visitBoolComp(TJBParser.BoolCompContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String comparisonToken = ctx.comp.getText();

        Type leftType = singleton.getCheckUpTable().get(ctx.left);
        Type rightType = singleton.getCheckUpTable().get(ctx.right);

        code.addAll(visit(ctx.left));

        if (leftType == Type.INT && rightType == Type.DOUBLE) {
            //Turn the left value into a float not to lose precision.
            code.add("\ti2f");
            leftType = Type.DOUBLE;
            code.addAll(visit(ctx.right));
        } else if (leftType == Type.DOUBLE && rightType == Type.INT) {
            //Turn the right value into a float not to loose precision.
            code.addAll(visit(ctx.right));
            code.add("\ti2f");
        } else {
            code.addAll(visit(ctx.right));
        }

        switch (comparisonToken) {
            case "<":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is greater or equal to right.
                    code.add("\tif_icmpge\t");
                } else {
                    //If value 1 (left) is SMALLER THAN value 2 (right) we should get int 1 as a result.
                    code.add("\tfcmpl\n");
                    //We want to jump to the label only if the int is -1 or 0 (meaning value 1 is BIGGER THAN or EQUAL TO value 2)
                    code.add("\tifle\t");
                }
                break;
            case "<=":
                if (leftType == Type.INT) {
                    //We want to jump to the label only if left is greater than right.
                    code.add("\tif_icmpgt\t");
                } else {
                    //If value 1 (left) is SMALLER THAN value 2 (right) we should get int 1 (less) or 0 (equal) as a result.
                    code.add("\tfcmpl\n");
                    //We want to jump to the label only if the int is -1 (meaning value 1 is BIGGER THAN value 2)
                    code.add("\tiflt\t");
                }
                break;
            case "=":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is not equal to right.
                    code.add("\tif_icmpne\t");
                } else {
                    //If value 1 (left) is EQUAL TO value 2 (right) we should get int 0 as a result.
                    code.add("\tfcmpl\n");
                    //We want to jump to the label only if the int is -1 or 1 (meaning value 1 is BIGGER THAN or SMALLER THAN value 2)
                    code.add("\tifne\t");
                }
                break;
            case "!=":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is not equal to right.
                    code.add("\tif_icmpeq\t");
                } else {
                    //If value 1 (left) is NOT EQUAL TO value 2 (right) we should get int -1 or 1 as a result.
                    code.add("\tfcmpl\n");
                    //We want to jump to the label only if the int is 0 (meaning value 1 is EQUAL TO value 2)
                    code.add("\tifeq\t");
                }
                break;
            case ">":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is smaller than or equal to right.
                    code.add("\tif_icmple\t");
                } else {
                    //If value 1 (left) is BIGGER THAN value 2 (right) we should get int 1 as a result.
                    code.add("\tfcmpg\n");
                    //We want to jump to the label only if the int is 0 or -1 (meaning value 1 is SMALLER THAN or EQUAL TO value 2)
                    code.add("\tifle\t");
                }
                break;
            case ">=":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is smaller than right.
                    code.add("\tif_icmple\t");
                } else {
                    //If value 1 (left) is BIGGER THAN or EQUAL TO value 2 (right) we should get int 1 or 0 as a result.
                    code.add("\tfcmpg\n");
                    //We want to jump to the label only if the int is -1 (meaning value 1 is SMALLER THAN value 2)
                    code.add("\tiflt\t");
                }
                break;
        }

        return code;
    }

    @Override
    public ArrayList<String> visitBoolCompLog(TJBParser.BoolCompLogContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String comparisonToken = ctx.comp.getText();

        code.addAll(visit(ctx.left));
        code.addAll(visit(ctx.right));

        //TODO: Do the logic gates.
        if (comparisonToken.equalsIgnoreCase("||") || comparisonToken.equalsIgnoreCase("And")) {
            //This is the "Or" (or "||") logic gate.
            //...
        } else {
            //This is the "And" (or "&&") logic gate.
            //...
        }

        return code;
    }

    @Override
    public ArrayList<String> visitWhileTJB(TJBParser.WhileTJBContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int whileNumber = whileSequence++;

        code.add("while_" + whileNumber + ":");

        code.addAll(visit(ctx.bool));

        //Change the comparison to have the right label to it.
        code.set((code.size() - 1), code.get(code.size() - 1) + "whileDone_" + whileNumber);

        for (TJBParser.ExpressionContext expressionContext : ctx.expression()) {
            code.addAll(visit(expressionContext));
        }

        code.add("\tgoto\twhile_" + whileNumber);
        //---
        code.add("whileDone_" + whileNumber + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitForTJB(TJBParser.ForTJBContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int forNumber = forSequence++;

        Type iteratorType = singleton.getCheckUpTable().get(ctx);
        iteratorType = Type.INT;
        String varID = ctx.iterator.getText();
        int indexOffset = variables.indexOf(varID) + 1;

        if (indexOffset == 0) {
            //The variable doesn't exist yet, so add it!
            variables.add(varID);
            indexOffset = variables.size();

            code.add("\tldc\t" + ctx.iterVal.getText());

            if (iteratorType == Type.INT) {
                //Value given is an integer.
                code.add("\tistore\t" + indexOffset);
            } else {
                //The value given is a double.
                code.add("\tfstore\t" + indexOffset);
            }
        } else {
            //The variable already exists, but the user wants to set a new value to it.
            String newVal = ctx.iterVal.getText();

            //If the iterVal is being left empty, we just use the value already stored on the given var.
            if (newVal != null && !newVal.isEmpty()) {
                //If there is a new value given, then store it onto the variable (typechecker enforces that both the var and new value are of the same type)
                code.add("\tldc\t" + ctx.iterVal.getText());

                if (iteratorType == Type.INT) {
                    //Value given is an integer.
                    code.add("\tistore\t" + indexOffset);
                } else {
                    //The value given is a double.
                    code.add("\tfstore\t" + indexOffset);
                }
            }
        }

        code.add("for_" + forNumber + ":");

        //Now do the comparison to see if we have to do the next loop or not.
        code.addAll(visit(ctx.comp));

        //Change the comparison to have the right label to it.
        code.set((code.size() - 1), code.get(code.size() - 1) + "forDone_" + forNumber);

        for (TJBParser.ExpressionContext expressionContext : ctx.expression()) {
            code.addAll(visit(expressionContext));
        }

        //Perform the increments on the var given.
        code.addAll(visit(ctx.increments));

        code.add("\tgoto\tfor_" + forNumber);
        //---
        code.add("forDone_" + forNumber + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitIncrementEXP(TJBParser.IncrementEXPContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        //We don't have to check if the Var exists, as the typechecker should make sure the var given here is the same one declared earlier in the for-loop
        String varID = ctx.nameVar.getText();
        //TODO: Once checker has been made, check if it doesn't do the "float" and such commands, if the value of the var is an int.
        Type iteratorType = singleton.getCheckUpTable().get(ctx);
        iteratorType = Type.INT;
        int indexOffset = variables.indexOf(varID) + 1;

        //Load the var, as we need to add the result of the calculation to that at the end.
        if (iteratorType == Type.INT) {
            //Value given is an integer.
            code.add("\tiload\t" + indexOffset);
        } else {
            //The value given is a double.
            code.add("\tfload\t" + indexOffset);
        }

        //Do the calculation given.
        code.addAll(visit(ctx.calc));

        //Then add the result of the calculation to the var and store the result onto the var.
        if (iteratorType == Type.INT) {
            //Value given is an integer.
            code.add("\tiadd");
            code.add("\tistore\t" + indexOffset + "\n");
        } else {
            //The value given is a double.
            code.add("\tfadd");
            code.add("\tfstore\t" + indexOffset + "\n");
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

        for (TJBParser.DisplayOptionsContext displayOptions : ctx.displayOptions()) {
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

        Type type = singleton.getCheckUpTable().get(ctx);
        switch (type) {
            case INT:
                code.add("\tinvokevirtual\tjava/io/PrintStream/println(I)V\n");
                break;
            case DOUBLE:
                code.add("\tinvokevirtual\tjava/io/PrintStream/println(F)V\n");
                break;
        }

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

    //TODO - STILL TO ADD:
    // - Logic gates: '||' and '&&' (or 'Or' and 'And'));
    // - Negative booleans (the '!' character).
}
