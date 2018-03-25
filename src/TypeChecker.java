
public class TypeChecker extends TJBBaseVisitor<Type> {

    Singleton singleton = Singleton.getInstance();

    private void validateType(TJBParser.CalculationContext ctx, Type type){
        Type inferred = visit(ctx);
        if (inferred != type){
            throw new CompilerException(ctx, "expected");
        }
    }

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

    //Assign checking.
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

        singleton.getSymbolTable().addSymbol(name, type);
    }

    @Override
    public Type visitNumAsn(TJBParser.NumAsnContext ctx) {
        performAssignChecks(ctx, ctx.name.getText(), ctx.value.getText(), Type.INT);
        return super.visitNumAsn(ctx);
    }

    @Override
    public Type visitStrAsn(TJBParser.StrAsnContext ctx) {
        performAssignChecks(ctx, ctx.name.getText(), ctx.value.getText(), Type.STRING);
        return super.visitStrAsn(ctx);
    }

    @Override
    public Type visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        performAssignChecks(ctx, ctx.name.getText(), ctx.value.getText(), Type.STRING);
        return super.visitStrCpyAsn(ctx);
    }

    @Override
    public Type visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        performAssignChecks(ctx, ctx.name.getText(), ctx.value.getText(), Type.ARRAY);
        return super.visitArrCpyAsn(ctx);
    }

    @Override
    public Type visitArrAsn(TJBParser.ArrAsnContext ctx) {
        performAssignChecks(ctx, ctx.name.getText(), ctx.value.getText(), Type.ARRAY);
        return super.visitArrAsn(ctx);
    }

    //If checking.

    private void checkIfExistsIFStatement(TJBParser.BooleanEXPContext ctx, String value){
        if ((value.length() == 1 && !value.matches(".*\\d+.*")) || (value.substring(0, Math.min(value.length(), 3)).equals("Str"))
                || (value.charAt(0) == 'L' || value.charAt(0) == 'l')){
            if(singleton.getSymbolTable().getSymTable().get(value) == null){
                throw new CompilerException(ctx, "Variable " + value + " not defined");
            }
        }
    }

    @Override
    public Type visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        return Type.INT;
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
    public Type visitBoolComp(TJBParser.BoolCompContext ctx) {
        equalType(ctx.left, ctx.right);
        checkIfExistsIFStatement(ctx, ctx.left.getText());
        checkIfExistsIFStatement(ctx, ctx.right.getText());
        if (getType(ctx.left) == Type.STRING){
            if (!ctx.comp.getText().equals("=")){
                throw new CompilerException(ctx, "Cannot compare strings with " + ctx.comp.getText());
            }
        }
        return Type.BOOLEAN;
    }

    //If statement

    @Override
    public Type visitIfStatement(TJBParser.IfStatementContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + " Is not a boolean statement.");
        }
        return super.visitIfStatement(ctx);
    }

    //While statement

    @Override
    public Type visitWhileTJB(TJBParser.WhileTJBContext ctx) {
        if (visit(ctx.bool) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + " Is not a boolean statement.");
        }
        return super.visitWhileTJB(ctx);
    }

    //Display

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

    //Other checks...
}
