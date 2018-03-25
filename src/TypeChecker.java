
public class TypeChecker extends TJBBaseVisitor<Type> {

    Singleton singleton = Singleton.getInstance();

    private void validateType(TJBParser.CalculationContext ctx, Type type){
        Type inferred = visit(ctx);
        if (inferred != type){
            throw new CompilerException(ctx, "expected");
        }
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

    //Other checks...
}
