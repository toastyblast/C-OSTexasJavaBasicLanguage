import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckerV2 extends TJBBaseVisitor<Type> {

    private Singleton singleton = Singleton.getInstance();
    private int counter = 0;

    private void addCtx(ParserRuleContext ctx, Type type){
        singleton.getSymbolTable().getSymTable().put(String.valueOf(counter), new Symbol(ctx, type));
        counter++;
    }

    //checkVAR/STRID/ARRAY

    @Override
    public Type visitCheckVAR(TJBParser.CheckVARContext ctx) {
        String value = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(value) != null){
            Type type = singleton.getSymbolTable().getSymTable().get(value).getType();
            addCtx(ctx, type);
            return type;
        }
        return null;
    }

    @Override
    public Type visitCheckSTRID(TJBParser.CheckSTRIDContext ctx) {
        String value = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(value) != null){
            return Type.STRING;
        }
        return null;
    }

    @Override
    public Type visitCheckArray(TJBParser.CheckArrayContext ctx) {
        String value = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(value) != null){
            return Type.ARRAY;
        }
        return null;
    }

    //Calculation.

    @Override
    public Type visitExParentheses(TJBParser.ExParenthesesContext ctx) {
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitExNegate(TJBParser.ExNegateContext ctx) {
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExMulOp(TJBParser.ExMulOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);
        if (left == Type.INT && right == Type.INT){
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExDivOp(TJBParser.ExDivOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left == null){
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null){
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT){
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExAddOp(TJBParser.ExAddOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left == null){
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null){
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT){
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExModOp(TJBParser.ExModOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left == null){
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null){
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT){
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    @Override
    public Type visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitExDblLiteral(TJBParser.ExDblLiteralContext ctx) {
        addCtx(ctx, Type.DOUBLE);
        return Type.DOUBLE;
    }

    @Override
    public Type visitExNegLiteral(TJBParser.ExNegLiteralContext ctx) {
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    @Override
    public Type visitExIntLiteral(TJBParser.ExIntLiteralContext ctx) {
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    //Assignment.


    @Override
    public Type visitNumAsn(TJBParser.NumAsnContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name != null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, value));
        addCtx(ctx, value);
        return super.visitNumAsn(ctx);
    }

    @Override
    public Type visitStrAsn(TJBParser.StrAsnContext ctx) {
        Type name = visit(ctx.name);

        if (name != null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING));
        addCtx(ctx, Type.STRING);
        return super.visitStrAsn(ctx);
    }

    @Override
    public Type visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name != null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING));
        addCtx(ctx, Type.STRING);
        return super.visitStrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsn(TJBParser.ArrAsnContext ctx) {
        Type name = visit(ctx.name);

        if (name != null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.ARRAY));
        addCtx(ctx, Type.ARRAY);
        return super.visitArrAsn(ctx);
    }

    @Override
    public Type visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name != null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.ARRAY));
        addCtx(ctx, Type.ARRAY);
        return super.visitArrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.ARRAY);
        return super.visitArrAsnVAR(ctx);
    }

    @Override
    public Type visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else {
            if (value == Type.DOUBLE && name == Type.INT){
                throw new CompilerException(ctx, "Double cannot be assigned to an integer."
                        + ctx.value.getText() + " Is a double." + ctx.name.getText() + " Is an integer.");
            }
        }
        addCtx(ctx, value);
        return super.visitNumAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        if (value == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitStrAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx) {
        Type name = visit(ctx.name);

        if (name == null){
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitStrAsnNEWVAR(ctx);
    }

    //Boolean expressions


    @Override
    public Type visitBoolParentheses(TJBParser.BoolParenthesesContext ctx) {
        Type type = visit(ctx.bool);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitBoolNeg(TJBParser.BoolNegContext ctx) {
        Type type = visit(ctx.bool);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitBoolComp(TJBParser.BoolCompContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left == null){
            throw new CompilerException(ctx, ctx.left.getText() + "Is not defined.");
        }

        if (right == null){
            throw new CompilerException(ctx, ctx.right.getText() + "Is not defined.");
        }

        String compToken = ctx.comp.getText();

        if (left == Type.BOOLEAN && left == right){
            if ((!compToken.equals("||") && !compToken.equals("And")) &&
                    (!compToken.equals("||") && !compToken.equals("And"))){
                throw new CompilerException(ctx, "Cannot compare boolean expressions");
            }
            addCtx(ctx, Type.BOOLEAN);
        }

        else if (left != right){
            if (!(left == Type.INT && right == Type.DOUBLE)
                    &&!(left == Type.DOUBLE && right == Type.INT)){
                throw new CompilerException(ctx, "You cannot compare different types."
                + ctx.left.getText() + " Is " + left + " "
                + ctx.right.getText() + " Is " + right);
            }
            addCtx(ctx, Type.DOUBLE);
        }

        else if (left == Type.STRING){

            if (!compToken.equals("!=") && !compToken.equals("=")){
                throw new CompilerException(ctx, "You cannot compare strings with this comparison sign "
                + compToken);
            }
            addCtx(ctx, Type.STRING);
        }

        else if (left == Type.INT){
            addCtx(ctx, Type.INT);
        }

        else if (left == Type.DOUBLE){
            addCtx(ctx, Type.DOUBLE);
        }

        return Type.BOOLEAN;
    }

    @Override
    public Type visitBoolCompLog(TJBParser.BoolCompLogContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.left.getText() + " Is not boolean");
        } else if (right != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.left.getText() + " Is not boolean");
        }

        addCtx(ctx, Type.BOOLEAN);
        return Type.BOOLEAN;
    }

    @Override
    public Type visitBoolCalc(TJBParser.BoolCalcContext ctx) {
        Type type = visit(ctx.calc);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitBoolSTRID(TJBParser.BoolSTRIDContext ctx) {
        Type type = visit(ctx.str);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitBoolSTR(TJBParser.BoolSTRContext ctx) {
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    //While loop

    @Override
    public Type visitWhileTJB(TJBParser.WhileTJBContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + "Is not a boolean statement");
        }
        return super.visitWhileTJB(ctx);
    }

    //If statement

    @Override
    public Type visitIfStatement(TJBParser.IfStatementContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + "Is not a boolean statement");
        }
        return super.visitIfStatement(ctx);
    }


    //For loop

    @Override
    public Type visitForTJB(TJBParser.ForTJBContext ctx) {

        Type iteratorType = visit(ctx.iterator);
        if (iteratorType != null){
            throw new CompilerException(ctx, ctx.iterator.getText() + " is already defined.");
        }

        Type iteratorValueType;

        if (ctx.iterVal.getText().contains(".")){
            iteratorType = Type.DOUBLE;
        } else {
            iteratorType = Type.INT;
        }

        singleton.getSymbolTable().addSymbol(ctx.iterator.getText(), new Symbol(ctx, iteratorType));

        if (ctx.comp.getText().equals("||") || ctx.comp.getText().equals("AND")
                || ctx.comp.getText().equals("&&") || ctx.comp.getText().equals("Or")){
            throw new CompilerException(ctx, "Invalid comparison.");
        }

        String upperValue = ctx.upper.getText();
        if(singleton.getSymbolTable().getSymTable().get(upperValue) == null && !upperValue.matches(".*\\d+.*")){
            throw new CompilerException(ctx, upperValue + " is not defined.");
        }

        Type incrementType = visit(ctx.increments);
        if (incrementType == null){
            throw new CompilerException(ctx, " is not defined.");
        }

        return super.visitForTJB(ctx);
    }

    @Override
    public Type visitDisplay(TJBParser.DisplayContext ctx) {
        for (int i = 0; i < ctx.displayOptions().size(); i++) {
            Type type = visit(ctx.displayOptions(i));
            if (type == null){
                throw new CompilerException(ctx, ctx.displayOptions(i).getText() + " Is not defined");
            }
        }
        return super.visitDisplay(ctx);
    }

    @Override
    public Type visitDispArray(TJBParser.DispArrayContext ctx) {
        Type type = visit(ctx.name);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitDispSTR(TJBParser.DispSTRContext ctx) {
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    @Override
    public Type visitDispCalc(TJBParser.DispCalcContext ctx) {
        Type type = visit(ctx.calc);
        addCtx(ctx,type);
        return type;
    }

    @Override
    public Type visitDispSTRID(TJBParser.DispSTRIDContext ctx) {
        Type type = visit(ctx.name);
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitArrayBuild(TJBParser.ArrayBuildContext ctx) {
        Type type;
        List<TerminalNode> terminalNodes = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof TerminalNode) {
                Token token = ((TerminalNode) ctx.getChild(i)).getSymbol();
                if (token.getType() == TJBLexer.INT ||
                        token.getType() == TJBLexer.DBL ||
                        token.getType() == TJBLexer.STR){
                    terminalNodes.add((TerminalNode)ctx.getChild(i));
                }
            }
        }

        System.out.println(terminalNodes);

        if (terminalNodes.get(0).getSymbol().getType() == TJBLexer.INT){
            addCtx(ctx, Type.INT);
            return Type.INT;
        }

        else if (terminalNodes.get(0).getSymbol().getType() == TJBLexer.DBL) {

        }

        else if (terminalNodes.get(0).getSymbol().getType() == TJBLexer.INT) {

        }
        return Type.INTARRAY;
    }
}
