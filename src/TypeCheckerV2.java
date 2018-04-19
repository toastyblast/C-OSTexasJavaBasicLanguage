import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckerV2 extends TJBBaseVisitor<Type> {
    private Singleton singleton = Singleton.getInstance();
    private ArrayList<SymbolTable> scopes = new ArrayList<>();
    private SymbolTable currentScope;
    private int numberOnStack = 1;

    private int counter = 0;

    private void addCtx(ParserRuleContext ctx, Type type) {
        int number = getNumberOnStack(ctx.getText(), currentScope);
        currentScope.getSymTable().put(String.valueOf(counter), new Symbol(ctx, type, number));
        counter++;
    }

    private boolean ifVariableExists(String value, SymbolTable symbolTable){
        for (int i = 0; i < symbolTable.getSymTable().size(); i++) {
            if (symbolTable.getSymTable().get(value) != null){
                return true;
            }
        }
        if (symbolTable.getParent() != null) {
            return ifVariableExists(value, symbolTable.getParent());
        }
        return false;
    }

    private Type getVariableType(String value, SymbolTable symbolTable){
        for (int i = 0; i < symbolTable.getSymTable().size(); i++) {
            if (symbolTable.getSymTable().get(value) != null){
                return symbolTable.getSymTable().get(value).getType();
            }
        }
        if (symbolTable.getParent() != null) {
            return getVariableType(value, symbolTable.getParent());
        }
        return null;
    }

    private int getNumberOnStack(String value, SymbolTable symbolTable){
        for (int i = 0; i < symbolTable.getSymTable().size(); i++) {
            if (symbolTable.getSymTable().get(value) != null){
                return symbolTable.getSymTable().get(value).getNumberOnStack();
            }
        }
        if (symbolTable.getParent() != null) {
            return getNumberOnStack(value, symbolTable.getParent());
        }
        return 0;
    }

    @Override
    public Type visitCodeLine(TJBParser.CodeLineContext ctx) {
        currentScope = new SymbolTable();
        currentScope.setParent(null);
        Type type = super.visitCodeLine(ctx);
        scopes.add(currentScope);
        singleton.copyTable(scopes);
        return type;
    }

    //checkVAR/STRID/ARRAY
    @Override
    public Type visitCheckVAR(TJBParser.CheckVARContext ctx) {
        String value = ctx.getText();
//        if (singleton.getSymbolTable().getSymTable().get(value) != null) {
//            Type type = singleton.getSymbolTable().getSymTable().get(value).getType();
//            addCtx(ctx, type);
//            return type;
//        }
        if (ifVariableExists(value, currentScope)){
            Type type = getVariableType(value, currentScope);
            addCtx(ctx,type);
            return type;
        }
        return null;
    }

    @Override
    public Type visitCheckSTRID(TJBParser.CheckSTRIDContext ctx) {
        String value = ctx.getText();
//        if (singleton.getSymbolTable().getSymTable().get(value) != null) {
//            addCtx(ctx, Type.STRING);
//            return Type.STRING;
//        }
        if (ifVariableExists(value, currentScope)){
            addCtx(ctx, Type.STRING);
            return Type.STRING;
        }
        return null;
    }

    @Override
    public Type visitCheckArray(TJBParser.CheckArrayContext ctx) {
        String value = ctx.getText();
//        if (singleton.getSymbolTable().getSymTable().get(value) != null) {
//            addCtx(ctx, Type.ARRAY);
//            return Type.ARRAY;
//        }
        if (ifVariableExists(value, currentScope)){
            addCtx(ctx, getVariableType(value, currentScope));
            return getVariableType(value, currentScope);
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
    public Type visitExMulDivOp(TJBParser.ExMulDivOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT) {
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

        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT) {
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

        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.INT && right == Type.INT) {
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

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined in this scope.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined in this scope.");
        }

//        singleton.getSymbolTable().getSymTable().put(ctx.name.getText()
//                , new Symbol(ctx, value));
        currentScope.getSymTable().put(ctx.name.getText(),
                new Symbol(ctx,value, numberOnStack));
        numberOnStack++;
        addCtx(ctx, value);
        return super.visitNumAsn(ctx);
    }

    @Override
    public Type visitStrAsn(TJBParser.StrAsnContext ctx) {
        Type name = visit(ctx.name);

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitStrAsn(ctx);
    }

    @Override
    public Type visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitStrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsn(TJBParser.ArrAsnContext ctx) {
        Type name = visit(ctx.name);
        Type typeOfArray = visit(ctx.value);

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, typeOfArray, numberOnStack));
        numberOnStack++;
        addCtx(ctx, typeOfArray);
        return super.visitArrAsn(ctx);
    }

    @Override
    public Type visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.ARRAY,numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.ARRAY);
        return super.visitArrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.ARRAY);
        return super.visitArrAsnVAR(ctx);
    }

    @Override
    public Type visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else {
            if (value == Type.DOUBLE && name == Type.INT) {
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

        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitStrAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx) {
        Type name = visit(ctx.name);

        if (name == null) {
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

        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + "Is not defined.");
        }

        if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + "Is not defined.");
        }

        String compToken = ctx.comp.getText();

        if (left == Type.BOOLEAN && left == right) {
            if ((!compToken.equals("||") && !compToken.equals("And")) &&
                    (!compToken.equals("||") && !compToken.equals("And"))) {
                throw new CompilerException(ctx, "Cannot compare boolean expressions");
            }
            addCtx(ctx, Type.BOOLEAN);
        } else if (left != right) {
            if (!(left == Type.INT && right == Type.DOUBLE)
                    && !(left == Type.DOUBLE && right == Type.INT)) {
                throw new CompilerException(ctx, "You cannot compare different types."
                        + ctx.left.getText() + " Is " + left + " "
                        + ctx.right.getText() + " Is " + right);
            }
            addCtx(ctx, Type.DOUBLE);
        } else if (left == Type.STRING) {

            if (!compToken.equals("!=") && !compToken.equals("=")) {
                throw new CompilerException(ctx, "You cannot compare strings with this comparison sign "
                        + compToken);
            }
            addCtx(ctx, Type.STRING);
        } else if (left == Type.INT) {
            addCtx(ctx, Type.INT);
        } else if (left == Type.DOUBLE) {
            addCtx(ctx, Type.DOUBLE);
        }

        return Type.BOOLEAN;
    }

    @Override
    public Type visitBoolCompLog(TJBParser.BoolCompLogContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        if (left != Type.BOOLEAN) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not boolean");
        } else if (right != Type.BOOLEAN) {
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
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;
        //Visit everything.
        Type type = super.visitWhileTJB(ctx);

        if (visit(ctx.bool) != Type.BOOLEAN) {
            throw new CompilerException(ctx, ctx.bool.getText() + "Is not a boolean statement");
        }

        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    //If statement


    @Override
    public Type visitIfTJB(TJBParser.IfTJBContext ctx) {

        Type type = super.visitIfTJB(ctx);

        return type;
    }

    @Override
    public Type visitIfStatement(TJBParser.IfStatementContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN) {
            throw new CompilerException(ctx, ctx.bool.getText() + "Is not a boolean statement");
        }
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;
        //Visit everything.
        Type type = super.visitIfStatement(ctx);
        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    @Override
    public Type visitElseStatement(TJBParser.ElseStatementContext ctx) {
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;
        //Visit everything.
        Type type = super.visitElseStatement(ctx);
        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    @Override
    public Type visitElseIfStatement(TJBParser.ElseIfStatementContext ctx) {
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;
        //Visit everything.
        Type type = super.visitElseIfStatement(ctx);
        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    //For loop
    @Override
    public Type visitForTJB(TJBParser.ForTJBContext ctx) {
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;


        Type iteratorType = visit(ctx.iterator);
//        if (iteratorType != null){
//            throw new CompilerException(ctx, ctx.iterator.getText() + "Is already defined.");
//        }

        Type iteratorValueType;
        if (iteratorType == null) {
            if (ctx.iterVal != null) {
                if (ctx.iterVal.getText().isEmpty()) {
                    throw new CompilerException(ctx, " Iterator value cannot be empty");
                }
                if (ctx.iterVal.getText().contains(",")) {
                    iteratorType = Type.DOUBLE;
                } else {
                    iteratorType = Type.INT;
                }
                currentScope.addSymbol(ctx.iterator.getText(), new Symbol(ctx, iteratorType, numberOnStack));
                numberOnStack++;
            } else {
                throw new CompilerException(ctx, " Iterator value cannot be empty");
            }
        }

        if (iteratorType == Type.INT) {
            if(ctx.iterVal != null) {
                if (ctx.iterVal.getText().contains(".")) {
                    throw new CompilerException(ctx, ctx.iterVal.getText() + " Is a double and cannot be assigned to" +
                            " an integer");
                }
            }
        }

        if (ctx.comp.getText().equals("||") || ctx.comp.getText().equals("AND")
                || ctx.comp.getText().equals("&&") || ctx.comp.getText().equals("Or")) {
            throw new CompilerException(ctx, "Invalid comparison.");
        }

//        String upperValue = ctx.upper.getText();
//        if(singleton.getSymbolTable().getSymTable().get(upperValue) == null && !upperValue.matches(".*\\d+.*")){
//            throw new CompilerException(ctx, upperValue + " is not defined.");
//        }

        Type incrementType = visit(ctx.increments);
        if (incrementType == null) {
            throw new CompilerException(ctx, " Is not defined.");
        } else if (incrementType == Type.DOUBLE && iteratorType == Type.INT) {
            throw new CompilerException(ctx, ctx.increments.getText() + " Is a double and cannot be assigned to an " +
                    "integer");
        }

        Type type = super.visitForTJB(ctx);
        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    @Override
    public Type visitIncrementEXP(TJBParser.IncrementEXPContext ctx) {
        Type name = visit(ctx.nameVar);
        Type calc = visit(ctx.calc);
        return super.visitIncrementEXP(ctx);
    }

    @Override
    public Type visitDisplay(TJBParser.DisplayContext ctx) {
        for (int i = 0; i < ctx.displayOptions().size(); i++) {
            Type type = visit(ctx.displayOptions(i));
            if (type == null) {
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
        addCtx(ctx, type);
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
        Type type = null;

        if (ctx.getChild(1) instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) ctx.getChild(1);
            if (terminalNode.getSymbol().getType() == TJBLexer.INT) {
                type = Type.INTARRAY;
            } else if (terminalNode.getSymbol().getType() == TJBLexer.DBL) {
                type = Type.DOUBLEARRAY;
            } else if (terminalNode.getSymbol().getType() == TJBLexer.STR) {
                type = Type.STRINGARRAY;
            }
        } else if (ctx.getChild(1) instanceof TJBParser.CheckSTRIDContext) {
            type = Type.STRINGARRAY;
        } else if (ctx.getChild(1) instanceof TJBParser.CalculationContext) {
            Type type1 = visit(ctx.getChild(1));
            switch (type1) {
                case INT:
                    type = Type.INTARRAY;
                case DOUBLE:
                    type = Type.DOUBLEARRAY;
            }
        }

        List<ParseTree> terminalNodes = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().equals("{") &&
                    !ctx.getChild(i).getText().equals("}") &&
                    !ctx.getChild(i).getText().equals(",")) {
                ParseTree parseTree = ctx.getChild(i);
                if (type == Type.INTARRAY) {
                    if (parseTree instanceof TerminalNode) {
                        if (((TerminalNode) parseTree).getSymbol().getType() != TJBParser.INT) {
                            throw new CompilerException(ctx, parseTree.getText() + " Is not an integer." +
                                    " This array should include only integers.");
                        }
                    } else if (visit(parseTree) != Type.INT) {
                        throw new CompilerException(ctx, parseTree.getText() + " Is not an integer." +
                                " This array should include only integers.");
                    }
                } else if (type == Type.DOUBLEARRAY) {
                    if (parseTree instanceof TerminalNode) {
                        if (((TerminalNode) parseTree).getSymbol().getType() == TJBParser.STR) {
                            throw new CompilerException(ctx, parseTree.getText() + " Is not a float/integers." +
                                    " This array should include only floats/integers.");
                        }
                    } else if (visit(parseTree) == Type.STRING) {
                        throw new CompilerException(ctx, parseTree.getText() + " Is not a float/integers." +
                                " This array should include only floats/integers.");
                    }
                } else if (type == Type.STRINGARRAY) {
                    if (parseTree instanceof TerminalNode) {
                        if (((TerminalNode) parseTree).getSymbol().getType() != TJBParser.STR) {
                            throw new CompilerException(ctx, parseTree.getText() + " Is not a string." +
                                    " This array should include only strings.");
                        }
                    } else if (visit(parseTree) != Type.STRING) {
                        throw new CompilerException(ctx, parseTree.getText() + " Is not a string." +
                                " This array should include only strings.");
                    }
                }

            }
        }

//        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitNumAsnUsrInt(TJBParser.NumAsnUsrIntContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type == null) {
            currentScope.getSymTable().put(ctx.name.getText()
                    , new Symbol(ctx, Type.INT, numberOnStack));
            numberOnStack++;
        } else {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined");
        }
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    @Override
    public Type visitNumAsnUsrIntVAR(TJBParser.NumAsnUsrIntVARContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined");
        }
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    @Override
    public Type visitNumAsnUsrDbl(TJBParser.NumAsnUsrDblContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type == null) {
            currentScope.getSymTable().put(ctx.name.getText()
                    , new Symbol(ctx, Type.DOUBLE, numberOnStack));
            numberOnStack++;
        } else {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined");
        }
        addCtx(ctx, Type.DOUBLE);
        return Type.DOUBLE;
    }

    @Override
    public Type visitNumAsnUsrDblVAR(TJBParser.NumAsnUsrDblVARContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined");
        }

        if (type != Type.DOUBLE){
            throw new CompilerException(ctx, ctx.name.getText() + " Cannot assign double to an int");
        }
        addCtx(ctx, Type.DOUBLE);
        return Type.DOUBLE;
    }

    @Override
    public Type visitStrAsnUsrIn(TJBParser.StrAsnUsrInContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type == null) {
            currentScope.getSymTable().put(ctx.name.getText()
                    , new Symbol(ctx, Type.STRING, numberOnStack));
            numberOnStack++;
        } else {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined");
        }
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    @Override
    public Type visitStrAsnUsrInVAR(TJBParser.StrAsnUsrInVARContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        if (type != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined");
        }
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    //Scanner.

    @Override
    public Type visitScannerCls(TJBParser.ScannerClsContext ctx) {
        Type type = visit(ctx.scnr);
        if (type == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }
        return super.visitScannerCls(ctx);
    }

    @Override
    public Type visitScannerAsn(TJBParser.ScannerAsnContext ctx) {
        Type type = visit(ctx.name);
        if (type == null) {
            currentScope.getSymTable().put(ctx.name.getText()
                    , new Symbol(ctx, Type.SCANNER, numberOnStack));
            numberOnStack++;
        } else {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined");
        }
        return super.visitScannerAsn(ctx);
    }

    @Override
    public Type visitCheckSCNID(TJBParser.CheckSCNIDContext ctx) {
        String value = ctx.getText();
//        if (currentScope.getSymTable().get(value) != null) {
//            addCtx(ctx, Type.SCANNER);
//            return Type.SCANNER;
//        }
        if (ifVariableExists(value, currentScope)){
            Type type = getVariableType(value, currentScope);
            addCtx(ctx,type);
            return type;
        }
        return null;
    }

    //Get array value.

    @Override
    public Type visitArrayGetValue(TJBParser.ArrayGetValueContext ctx) {
        Type typeOfArray = visit(ctx.arrayName);
        Type typeOfValue = null;

        if (typeOfArray == null){
            throw new CompilerException(ctx, ctx.arrayName.getText() + " List does not exist");
        }

        if (typeOfArray == Type.DOUBLEARRAY){
            typeOfValue = Type.DOUBLE;
        } else if (typeOfArray == Type.INTARRAY){
            typeOfValue = Type.INT;
        } else if (typeOfArray == Type.STRINGARRAY){
            typeOfValue = Type.STRING;
        }
        addCtx(ctx, typeOfValue);
        return typeOfValue;
    }

    @Override
    public Type visitAsnArrVal(TJBParser.AsnArrValContext ctx) {
        Type value = visit(ctx.value);
        Type arrValue = visit(ctx.name);

        if (arrValue == Type.INT && value == Type.DOUBLE){
            throw new CompilerException(ctx, ctx.getText() + " You cannot assign double to an int.");
        }
        return arrValue;
    }

    @Override
    public Type visitExArrLiteral(TJBParser.ExArrLiteralContext ctx) {
        Type type = visit(ctx.arrayGetValue());
        addCtx(ctx, type);
        return type;
    }

    @Override
    public Type visitAsnStrFromArr(TJBParser.AsnStrFromArrContext ctx) {
        Type name = visit(ctx.name);

        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitAsnStrFromArr(ctx);
    }

    @Override
    public Type visitCpyAsnStrFromArr(TJBParser.CpyAsnStrFromArrContext ctx) {
        Type name = visit(ctx.name);

        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitCpyAsnStrFromArr(ctx);
    }

    @Override
    public Type visitStrArrAsn(TJBParser.StrArrAsnContext ctx) {
        return super.visitStrArrAsn(ctx);
    }

    @Override
    public Type visitStrArrAsnVar(TJBParser.StrArrAsnVarContext ctx) {
        Type type = visit(ctx.value);
        if (type == null){
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined.");
        }
        return super.visitStrArrAsnVar(ctx);
    }

    @Override
    public Type visitStrArrValUsrIn(TJBParser.StrArrValUsrInContext ctx) {
        Type type = visit(ctx.name);
        if (type != Type.STRING){
            throw new CompilerException(ctx, ctx.name.getText() + " Array type does not match type of the value.");
        }
        return super.visitStrArrValUsrIn(ctx);
    }

    @Override
    public Type visitIntArrValUsrIn(TJBParser.IntArrValUsrInContext ctx) {
        Type type = visit(ctx.name);
        if (type == Type.STRING){
            throw new CompilerException(ctx, ctx.name.getText() + " Array type does not match type of the value");
        }
        return super.visitIntArrValUsrIn(ctx);
    }

    @Override
    public Type visitDblArrValUsrIn(TJBParser.DblArrValUsrInContext ctx) {
        Type type = visit(ctx.name);
        if (type != Type.DOUBLE){
            throw new CompilerException(ctx, ctx.name.getText() + " Array type does not match type of the value.");
        }
        return super.visitDblArrValUsrIn(ctx);
    }
}
