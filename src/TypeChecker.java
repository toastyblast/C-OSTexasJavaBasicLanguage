
@Deprecated
public class TypeChecker extends TJBBaseVisitor<Type> {

    private Singleton singleton = Singleton.getInstance();
    int counter = 0;

    private void equalType(TJBParser.BooleanEXPContext left, TJBParser.BooleanEXPContext right){
        Type inferredTypeLeft = visit(left);
        Type inferredTypeRight = visit(right);
        if (inferredTypeLeft != inferredTypeRight){
            if ((inferredTypeLeft == Type.INT && inferredTypeRight == Type.DOUBLE)
                    || (inferredTypeLeft == Type.DOUBLE && inferredTypeRight == Type.INT)){
                //Do nothing.
            } else {
                throw new CompilerException(left, " Cannot compare different types.");
            }

        }
    }

    private Type getType(TJBParser.BooleanEXPContext ctx){
        return visit(ctx);
    }

    //Assign checking. ↓

    //Assign helper methods. ↓

    private void checkIfDeclared(TJBParser.AssignmentContext ctx, String variableName){
        if(singleton.getSymbolTable().getSymTable().get(variableName) != null){
            throw new CompilerException(ctx, "Variable " + variableName + " already declared.");
        }
    }
    private void checkIfExists(TJBParser.AssignmentContext ctx, String value){
        if ((value.length() == 1 && !value.matches(".*\\d+.*")) || (value.substring(0, Math.min(value.length(), 3)).equals("Str"))
                || (value.charAt(0) == 'L' || value.charAt(0) == 'l')){
            if(singleton.getSymbolTable().getSymTable().get(value) == null){
                throw new CompilerException(ctx, "Variable " + value + " not defined");
            }
        }
    }
    private void checkIfSelfAssign(TJBParser.AssignmentContext ctx, String variableName, String value){
        if (variableName.equals(value)){
            throw new CompilerException(ctx, "Cannot assign value to self.");
        }
    }

    private void performAssignChecks(TJBParser.AssignmentContext ctx, String name, String value, Type type){
        checkIfSelfAssign(ctx, name, value);
        checkIfDeclared(ctx, name);
        checkIfExists(ctx, value);
        singleton.getSymbolTable().addSymbol(name, new Symbol(ctx, type));
    }

    //Assign visitors. ↓

    @Override
    public Type visitNumAsn(TJBParser.NumAsnContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();
        Type valueType = visit(ctx.value);
        performAssignChecks(ctx, name, value, valueType);
        return super.visitNumAsn(ctx);
    }

    @Override
    public Type visitStrAsn(TJBParser.StrAsnContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();
        performAssignChecks(ctx, name, value, Type.STRING);
        return super.visitStrAsn(ctx);
    }

    @Override
    public Type visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();
        performAssignChecks(ctx, name, value, Type.STRING);
        return super.visitStrCpyAsn(ctx);
    }

    @Override
    public Type visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();
        performAssignChecks(ctx, name, value, Type.ARRAY);
        return super.visitArrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsn(TJBParser.ArrAsnContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();
        performAssignChecks(ctx, name, value, Type.ARRAY);
        return super.visitArrAsn(ctx);
    }

    @Override
    public Type visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        if ((ctx.value.getText().length() == 1 && !ctx.value.getText().matches(".*\\d+.*"))){
            checkIfExists(ctx, ctx.name.getText());
            Type nameType = visit(ctx.name);
            if (visit(ctx.value) == Type.DOUBLE && nameType == Type.INT){
                throw new CompilerException(ctx, "Cannot assign double to an int. " + ctx.name.getText() + " is int. "
                        + ctx.value.getText() + " is double");
            }
        } else {
            checkIfExists(ctx, ctx.value.getText());
            checkIfExists(ctx, ctx.name.getText());

            Type valueType = visit(ctx.value);
            Type nameType = visit(ctx.name);

            if (nameType == Type.INT && valueType == Type.DOUBLE){
                throw new CompilerException(ctx, "Cannot assign double to an int. " + ctx.name.getText() + " is int. "
                        + ctx.value.getText() + " is double");
            }
        }
        return super.visitNumAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        checkIfExists(ctx, ctx.value.getText());
        checkIfExists(ctx, ctx.name.getText());
        return super.visitStrAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx) {
        checkIfExists(ctx, ctx.name.getText());
        return super.visitStrAsnNEWVAR(ctx);
    }

    @Override
    public Type visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx) {
        checkIfExists(ctx, ctx.value.getText());
        checkIfExists(ctx, ctx.name.getText());
        return super.visitArrAsnVAR(ctx);
    }

    //Boolean checking. ↓

    //Boolean helper methods. ↓
    private void checkIfExistsIFStatement(TJBParser.BooleanEXPContext ctx, String value){
        if ((value.length() == 1 && !value.matches(".*\\d+.*")) || (value.substring(0, Math.min(value.length(), 3)).equals("Str"))
                || (value.charAt(0) == 'L' || value.charAt(0) == 'l')){
            if(singleton.getSymbolTable().getSymTable().get(value) == null){
                throw new CompilerException(ctx, "Variable " + value + " not defined");
            }
        }
    }

    //Calculation visitors. ↓

    @Override
    public Type visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, visit(ctx.val)));
        counter++;
        return visit(ctx.val);
    }

    @Override
    public Type visitExDblLiteral(TJBParser.ExDblLiteralContext ctx) {
        return Type.DOUBLE;
    }

    @Override
    public Type visitExIntLiteral(TJBParser.ExIntLiteralContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitBoolSTR(TJBParser.BoolSTRContext ctx) {
        return Type.STRING;
    }

    @Override
    public Type visitBoolSTRID(TJBParser.BoolSTRIDContext ctx) {
        return Type.STRING;
    }

    @Override
    public Type visitExParentheses(TJBParser.ExParenthesesContext ctx) {
        singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, visit(ctx.val)));
        counter++;
        return visit(ctx.val);
    }

    @Override
    public Type visitExNegate(TJBParser.ExNegateContext ctx) {
        singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, visit(ctx.val)));
        counter++;
        return visit(ctx.val);
    }

    @Override
    public Type visitExMulOp(TJBParser.ExMulOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);
        if (left == Type.INT && right == Type.INT){
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.INT));
            counter++;
            return Type.INT;
        } else {
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.DOUBLE));
            counter++;
            return Type.DOUBLE;
        }
    }

    @Override
    public Type visitExDivOp(TJBParser.ExDivOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);
        if (left == Type.INT && right == Type.INT){
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.INT));
            counter++;
            return Type.INT;
        } else {
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.DOUBLE));
            counter++;
            return Type.DOUBLE;
        }
    }

    @Override
    public Type visitExModOp(TJBParser.ExModOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);
        if (left == Type.INT && right == Type.INT){
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.INT));
            counter++;
            return Type.INT;
        } else {
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.DOUBLE));
            counter++;
            return Type.DOUBLE;
        }
    }

    @Override
    public Type visitExAddOp(TJBParser.ExAddOpContext ctx) {
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);
        if (left == Type.INT && right == Type.INT){
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.INT));
            counter++;
            return Type.INT;
        } else {
            singleton.getSymbolTable().addSymbol(String.valueOf(counter), new Symbol(ctx, Type.DOUBLE));
            counter++;
            return Type.DOUBLE;
        }
    }

    //Boolean visitors. ↓
    @Override
    public Type visitBoolComp(TJBParser.BoolCompContext ctx) {
        checkIfExistsIFStatement(ctx, ctx.left.getText());
        checkIfExistsIFStatement(ctx, ctx.right.getText());
        equalType(ctx.left, ctx.right);
        if (getType(ctx.left) == Type.STRING){
            if (!ctx.comp.getText().equals("=") && !ctx.comp.getText().equals("!=")){
                throw new CompilerException(ctx, "Cannot compare strings with " + ctx.comp.getText());
            }
        }
        return Type.BOOLEAN;
    }

    @Override
    public Type visitBoolParentheses(TJBParser.BoolParenthesesContext ctx) {
        return visit(ctx.bool);
    }

    @Override
    public Type visitBoolNeg(TJBParser.BoolNegContext ctx) {
        return visit(ctx.bool);
    }

    //If visitors. ↓

    @Override
    public Type visitIfStatement(TJBParser.IfStatementContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + " Is not a boolean statement.");
        }
        return super.visitIfStatement(ctx);
    }

    //While visitors. ↓

    @Override
    public Type visitWhileTJB(TJBParser.WhileTJBContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + " Is not a boolean statement.");
        }
        return super.visitWhileTJB(ctx);
    }

    //Display visitors. ↓

    @Override
    public Type visitDispCalc(TJBParser.DispCalcContext ctx) {
        String text = ctx.getText();
        if (text.length() == 1 && !text.matches(".*\\d+.*")){
            if(singleton.getSymbolTable().getSymTable().get(text) == null){
                throw new CompilerException(ctx, "Variable " + text + " not defined");
            }
        }
        return super.visitDispCalc(ctx);
    }

    @Override
    public Type visitDispSTRID(TJBParser.DispSTRIDContext ctx) {
        String text = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(text) == null){
            throw new CompilerException(ctx, "Variable " + text + " not defined");
        }
        return super.visitDispSTRID(ctx);
    }

    @Override
    public Type visitDispArray(TJBParser.DispArrayContext ctx) {
        String text = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(text) == null){
            throw new CompilerException(ctx, "Variable " + text + " not defined");
        }
        return super.visitDispArray(ctx);
    }

    //For visitors. ↓

    @Override
    public Type visitForTJB(TJBParser.ForTJBContext ctx) {
        String iteratorName = ctx.iterator.getText();
        if(singleton.getSymbolTable().getSymTable().get(iteratorName) != null){
            throw new CompilerException(ctx, "Variable " + iteratorName + " already defined");
        }
        Type iteratorType;
        if (ctx.iterVal.getText().contains(",")){
            iteratorType = Type.DOUBLE;
        } else {
            iteratorType = Type.INT;
        }
        singleton.getSymbolTable().addSymbol(iteratorName, new Symbol(ctx, iteratorType));
        if (ctx.comp.getText().equals("||") || ctx.comp.getText().equals("AND")
                || ctx.comp.getText().equals("&&") || ctx.comp.getText().equals("Or")){
            throw new CompilerException(ctx, "Invalid comparison.");
        }

        String upperValue = ctx.upper.getText();
        if(singleton.getSymbolTable().getSymTable().get(upperValue) == null && !upperValue.matches(".*\\d+.*")){
            throw new CompilerException(ctx, "Variable " + upperValue + " not defined");
        }
        String increment = ctx.increments.getText();
        if (increment.length() == 1 && !increment.matches(".*\\d+.*")){
            if(singleton.getSymbolTable().getSymTable().get(increment) == null){
                throw new CompilerException(ctx, "Variable " + increment + " not defined");
            }
        }
        return super.visitForTJB(ctx);
    }

    //"Type" visitors. ↓

    @Override
    public Type visitExNegLiteral(TJBParser.ExNegLiteralContext ctx) {
        return Type.INT;
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
    public Type visitCheckVAR(TJBParser.CheckVARContext ctx) {
        String value = ctx.getText();
        if(singleton.getSymbolTable().getSymTable().get(value) != null){
            return singleton.getSymbolTable().getSymTable().get(value).getType();
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

    //Other checks...
}
