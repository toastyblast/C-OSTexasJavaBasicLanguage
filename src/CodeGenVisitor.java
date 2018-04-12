import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class CodeGenVisitor extends TJBBaseVisitor<ArrayList<String>> {
    private Singleton singleton = Singleton.getInstance();

    private final ArrayList<String> variables = new ArrayList<>();
    private int compSequence = 0;
    private int forSequence = 0;
    private int whileSequence = 0;
    private int ifSequence = 0;
    private int orLogicSequence = 0;
    private int andLogicSequence = 0;

    private int localCurrentIf = 0;
    private int currentElseIf = 0;

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

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitNumAsn(TJBParser.NumAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        //Due to the typechecker we're always sure this variable is new and we do not have to check if it already exists.
        String numID = ctx.name.getText();
        variables.add(numID);
        int indexOffset = variables.size();

        code.addAll(visit(ctx.calculation()));

        Type type = singleton.getCheckUpTable().get(ctx).getType();
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

        Type type = singleton.getCheckUpTable().get(ctx.value).getType();
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
                            Type type1 = singleton.getCheckUpTable().get(terminalNodes.get(i)).getType();
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
        int copyOffset = singleton.getCheckUpTable().get(ctx.value).getNumberOnStack();

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

        //TODO - Martin?: Figure out how arrays work and are made in Jasmin!

        return code;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.addAll(visit(ctx.calculation()));

        Type type = singleton.getCheckUpTable().get(ctx).getType();
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

        int indexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\tldc\t" + ctx.value.getText());
        code.add("\tastore\t" + indexOffset + "\n");

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        int copyIndexOffset = singleton.getCheckUpTable().get(ctx.value).getNumberOnStack();

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

        //TODO - Martin?: Figure out how arrays work and are made in Jasmin!

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
        Type type = singleton.getCheckUpTable().get(ctx).getType();
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

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitExAddOp(TJBParser.ExAddOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        Type leftType = singleton.getCheckUpTable().get(ctx.left).getType();
        Type rightType = singleton.getCheckUpTable().get(ctx.right).getType();

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

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitExMulDivOp(TJBParser.ExMulDivOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        Type leftType = singleton.getCheckUpTable().get(ctx.left).getType();
        Type rightType = singleton.getCheckUpTable().get(ctx.right).getType();

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
                code.add(ctx.op.getText().equals("*") ? "\timul\n" : "\tidiv\n");
                break;
            case DOUBLE:
                code.add(ctx.op.getText().equals("*") ? "\tfmul\n" : "\tfdiv\n");
                break;
        }

        return code;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitExModOp(TJBParser.ExModOpContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        Type leftType = singleton.getCheckUpTable().get(ctx.left).getType();
        Type rightType = singleton.getCheckUpTable().get(ctx.right).getType();

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

        int indexOffset = singleton.getCheckUpTable().get(ctx.val).getNumberOnStack();

        Type valueType = singleton.getCheckUpTable().get(ctx.val).getType();

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
        int localIfNumber = ifNumber;

        code.add("if_" + ifNumber + ":");
        //First add the if-statement
        code.addAll(visit(ctx.ifStatement()));

        localCurrentIf = localIfNumber;
        //Then any else-if-statements
        for (TJBParser.ElseIfStatementContext elseIfStatement : ctx.elseIfStatement()) {
            code.add("elseIf_" + localIfNumber + "-" + currentElseIf + ":");
            //Add all the expressions within the else-if statement
            code.addAll(visit(elseIfStatement));
            code.add("\tgoto\tallDone_" + localIfNumber);

            code.add("elseIfDone_" + localIfNumber + "-" + currentElseIf + ":");

            currentElseIf++;
        }
        //Reset the current else if again for the next generation of another else-if branch
        currentElseIf = 0;

        //And finally the else-statement, if there is one.
        if (ctx.elseStatement() != null) {
            code.add("else_" + ifNumber + ":");
            //Visit all the expressions in the else-statement.
            code.addAll(visit(ctx.elsePart));
            code.add("\tgoto\tallDone_" + ifNumber);
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
        code.add("\tifeq\tifDone_" + ifNumber);

        code.addAll(visit(ctx.thenStatement()));
        code.add("\tgoto\tallDone_" + ifNumber);

        code.add("ifDone_" + ifNumber + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitElseIfStatement(TJBParser.ElseIfStatementContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int currentIf = localCurrentIf;

        code.addAll(visit(ctx.bool));

        //Change the comparison to have the right label to it.
        code.add("\tifeq\telseIfDone_" + currentIf + "-" + currentElseIf);

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
        //We want the negation to have the same number for the labels as the actual comparison, just to make the reading of the Jasmin a bit easier.
        int negCompNumber = compSequence;

        code.addAll(visit(ctx.bool));

        code.add("\tifeq\tnegPos_" + negCompNumber);
        //If the number is not 0 (which means it's 1 (true), since we're negating a boolean), we need to make it 0 (false).
        code.add("\tldc\t0");
        code.add("\tgoto\tnegDone_" + negCompNumber);

        //In this case, the number on the stack is 0 (false), and we need to make it 1 (true).
        code.add("negPos_" + negCompNumber + ":");
        code.add("\tldc\t1");

        //This is so that in the true to false case, we do not perform the false to true case too.
        code.add("negDone_" + negCompNumber + ":\n");

        return code;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public ArrayList<String> visitBoolComp(TJBParser.BoolCompContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int compNumber = compSequence++;

        String comparisonToken = ctx.comp.getText();

        Type leftType = singleton.getCheckUpTable().get(ctx.left).getType();
        Type rightType = singleton.getCheckUpTable().get(ctx.right).getType();

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
                    code.add("\tfcmpl");
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
                    code.add("\tfcmpl");
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
                    code.add("\tfcmpl");
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
                    code.add("\tfcmpl");
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
                    code.add("\tfcmpg");
                    //We want to jump to the label only if the int is 0 or -1 (meaning value 1 is SMALLER THAN or EQUAL TO value 2)
                    code.add("\tifle\t");
                }
                break;
            case ">=":
                if (leftType == Type.INT) {
                    //We want to jump to the label if left is smaller than right.
                    code.add("\tif_icmplt\t");
                } else {
                    //If value 1 (left) is BIGGER THAN or EQUAL TO value 2 (right) we should get int 1 or 0 as a result.
                    code.add("\tfcmpg");
                    //We want to jump to the label only if the int is -1 (meaning value 1 is SMALLER THAN value 2)
                    code.add("\tiflt\t");
                }
                break;
        }

        //Add the label for the comparison to jump to if it is false.
        code.set((code.size() - 1), code.get(code.size() - 1) + "compNeg_" + compNumber);
        //We'll end up here and add a one if the comparison is true.
        code.add("\tldc\t1");
        code.add("\tgoto\tcompDone_" + compNumber);

        //The comparison is false, so return a 0.
        code.add("compNeg_" + compNumber + ":");
        code.add("\tldc\t0");

        //End statement for the true to jump to, as to not perform the false code.
        code.add("compDone_" + compNumber + ":\n");

        return code;
    }

    @Override
    public ArrayList<String> visitBoolCompLog(TJBParser.BoolCompLogContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        String comparisonToken = ctx.comp.getText();

        //Add all the code of the left and right comparison, this should leave two integers of either 1 or 0 each on top of the operand stack right before here.
        code.addAll(visit(ctx.left));
//        code.addAll(visit(ctx.right));

//        if (comparisonToken.equalsIgnoreCase("||") || comparisonToken.equalsIgnoreCase("Or")) {
//            //This is the "Or" (or "||") logic gate.
//            code.add("\tior");
//        } else {
//            //This is the "And" (or "&&") logic gate.
//            code.add("\tiand");
//        }

        if (comparisonToken.equalsIgnoreCase("||") || comparisonToken.equalsIgnoreCase("Or")) {
            int orNumber = orLogicSequence++;

            //This is the "Or" (or "||") logic gate.
            //If the number on the stack from the first boolean is 1 or more (true), go to label. If 0 or less (false), go to the right code, as that might still be true.
            code.add("\tifgt\tlogicOr_" + orNumber);
            code.addAll(visit(ctx.right));
            code.add("\tgoto\tlogicOrEnd_" + orNumber);

            //If left is true though, we can just immediately push true on the stack (short circuit) so that the branch or loop can do an iteration.
            code.add("logicOr_" + orNumber + ":");
            code.add("\tldc\t1");

            code.add("logicOrEnd_" + orNumber + ":");
        } else {
            int andNumber = andLogicSequence++;

            //This is the "And" (or "&&") logic gate.
            //If the number on the stack from the first boolean is 1 or more (true), go to label. If 0 or less (false), put 0 on the stack, as the right comparison doesn't even have to be looked at (short circuit).
            code.add("\tifgt\tlogicAnd_" + andNumber);
            code.add("\tldc\t0");
            code.add("\tgoto\tlogicAndEnd_" + andNumber);

            //If left is true, then right also has to be run, and if that returns true or false will dictate if the loop or branch will run.
            code.add("logicAnd_" + andNumber + ":");
            code.addAll(visit(ctx.right));

            code.add("logicAndEnd_" + andNumber + ":");
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
        code.add("\tifeq\twhileDone_" + whileNumber);

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

        Type iteratorType = singleton.getCheckUpTable().get(ctx.iterator).getType();
        String varID = ctx.iterator.getText();
        int indexOffset = singleton.getCheckUpTable().get(ctx.iterator).getNumberOnStack();

        if (indexOffset > variables.size()) {
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
        code.add("\tifeq\tforDone_" + forNumber);

        for (TJBParser.ExpressionContext expressionContext : ctx.expression()) {
            code.addAll(visit(expressionContext));
        }

        //Perform the increments on the var given.
        code.addAll(visit(ctx.increments));

        code.add("\tgoto\tfor_" + forNumber);
        //---
        code.add("forDone_" + forNumber + ":\n");

        return code;
    }

    @Override
    public ArrayList<String> visitIncrementEXP(TJBParser.IncrementEXPContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        //We don't have to check if the Var exists, as the typechecker should make sure the var given here is the same one declared earlier in the for-loop
        Type iteratorType = singleton.getCheckUpTable().get(ctx.nameVar).getType();
        int indexOffset = singleton.getCheckUpTable().get(ctx.nameVar).getNumberOnStack();

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

        int indexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\taload\t" + indexOffset);
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        return code;
    }

    @Override
    public ArrayList<String> visitDispCalc(TJBParser.DispCalcContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.addAll(visit(ctx.calculation()));

        Type type = singleton.getCheckUpTable().get(ctx).getType();
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
        int indexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\taload\t" + indexOffset);

        //FIXME - Martin?: CHECK IF THIS IS CORRECT FOR ARRAYS!
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava.lang.reflect.Array;)V\n");

        return code;
    }

    @Override
    public ArrayList<String> visitScannerAsn(TJBParser.ScannerAsnContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        variables.add(ctx.name.getText());

        int indexOffset = variables.size();

        code.add("\tnew\t" + "\tjava/util/Scanner\t");
        code.add("\tdup\t");
        code.add("\tgetstatic\t" + "\tjava/lang/System/in Ljava/io/InputStream;\t");
        code.add("\tinvokespecial\t" + "\tjava/util/Scanner/<init>(Ljava/io/InputStream;)V\t");
        code.add("\tastore_" + indexOffset);

        return code;
    }

    @Override
    public ArrayList<String> visitScannerCls(TJBParser.ScannerClsContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/close()V");

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsnUsrIn(TJBParser.StrAsnUsrInContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        variables.add(ctx.name.getText());

        int place = variables.size();
        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a string." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/next()Ljava/lang/String;");
        code.add("\tastore " + place);

        return code;
    }

    @Override
    public ArrayList<String> visitStrAsnUsrInVAR(TJBParser.StrAsnUsrInVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();
        int numberIndexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a string." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/next()Ljava/lang/String;");
        code.add("\tastore " + numberIndexOffset);

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsnUsrInt(TJBParser.NumAsnUsrIntContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        variables.add(ctx.name.getText());

        int place = variables.size();
        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a number." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/nextInt()I");
        code.add("\tistore " + place);

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsnUsrIntVAR(TJBParser.NumAsnUsrIntVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();
        int numberIndexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a number." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/nextInt()I");
        code.add("\tistore " + numberIndexOffset);

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsnUsrDbl(TJBParser.NumAsnUsrDblContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        variables.add(ctx.name.getText());

        int place = variables.size();
        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a number." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/nextFloat()F");
        code.add("\tinvokestatic\t" + "java/lang/Float/valueOf(F)Ljava/lang/Float;");
        code.add("\tinvokevirtual " + "java/lang/Float/floatValue()F");
        code.add("\tfstore " + place);

        return code;
    }

    @Override
    public ArrayList<String> visitNumAsnUsrDblVAR(TJBParser.NumAsnUsrDblVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        int indexOffset = singleton.getCheckUpTable().get(ctx.scnr).getNumberOnStack();
        int numberIndexOffset = singleton.getCheckUpTable().get(ctx.name).getNumberOnStack();

        code.add("\tgetstatic\tjava/lang/System/out\tLjava/io/PrintStream;");
        code.add("\tldc\t" + '"' + "Please type a number." + '"');
        code.add("\tinvokevirtual\tjava/io/PrintStream/println(Ljava/lang/String;)V\n");

        code.add("\taload_" + indexOffset);
        code.add("\tinvokevirtual\t" + "java/util/Scanner/nextFloat()F");
        code.add("\tinvokestatic\t" + "java/lang/Float/valueOf(F)Ljava/lang/Float;");
        code.add("\tinvokevirtual " + "java/lang/Float/floatValue()F");
        code.add("\tfstore " + numberIndexOffset);

        return code;
    }
}
