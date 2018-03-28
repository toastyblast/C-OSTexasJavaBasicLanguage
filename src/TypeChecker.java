
public class TypeChecker extends TJBBaseVisitor<Type> {

    private Singleton singleton = Singleton.getInstance();

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

        singleton.getSymbolTable().addSymbol(name, type);
    }

    //Assign visitors. ↓

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

    @Override
    public Type visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        checkIfExists(ctx, ctx.value.getText());
        checkIfExists(ctx, ctx.name.getText());
        return super.visitNumAsnVAR(ctx);
    }

    @Override
    public Type visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        checkIfExists(ctx, ctx.value.getText());
        checkIfExists(ctx, ctx.name.getText());
        return super.visitStrAsnVAR(ctx);
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

    //Boolean visitors. ↓
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

    //For visitors. ↓

    @Override
    public Type visitForTJB(TJBParser.ForTJBContext ctx) {
        String iteratorName = ctx.iterator.getText();
        if(singleton.getSymbolTable().getSymTable().get(iteratorName) == null){
            throw new CompilerException(ctx, "Variable " + iteratorName + " already defined");
        }
        Type iteratorType;
        if (ctx.iterVal.getText().contains(",")){
            iteratorType = Type.DOUBLE;
        } else {
            iteratorType = Type.INT;
        }
        singleton.getSymbolTable().addSymbol(iteratorName, iteratorType);
        if (ctx.comp.getText().equals("||") || ctx.comp.getText().equals("AND")
                || ctx.comp.getText().equals("&&") || ctx.comp.getText().equals("Or")){
            throw new CompilerException(ctx, "Invalid comparison.");
        }

        String upperValue = ctx.upper.getText();
        if(singleton.getSymbolTable().getSymTable().get(upperValue) == null){
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
            if (value.contains(",")){
                return Type.DOUBLE;
            } else {
                return Type.INT;
            }
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
