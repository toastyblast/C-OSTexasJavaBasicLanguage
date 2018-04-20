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

    /**
     * Helper method which adds the context, type of actions like multiplication, division, etc.
     * @param ctx The context of the added action.
     * @param type The type of the added action.
     */
    private void addCtx(ParserRuleContext ctx, Type type) {
        int number = getNumberOnStack(ctx.getText(), currentScope);
        currentScope.getSymTable().put(String.valueOf(counter), new Symbol(ctx, type, number));
        counter++;
    }

    /**
     * Helper method that checks if a variable exists. If the variable is not found in the current scope, then its
     * parents are checked.
     * @param value The name of the variable that is searched for.
     * @param symbolTable The current scope that must be searched.
     * @return True or false.
     */
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

    /**
     * Helper method to get the type of a variable. If the variable is not found in the current scope, then its
     * parents are checked.
     * @param value The value of the variable.
     * @param symbolTable The current scope that must be searched.
     * @return The type of the variable.
     */
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

    /**
     * Helper method to get the number on the stack of a variable.
     * @param value The text value of the variable.
     * @param symbolTable The current scope that must be searched.
     * @return The number on the stack.
     */
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

    /**
     * Visitor for all lines in the code. Before the other nodes are visited a "root" scope is created and it is
     * stored, so it can be used. After all nodes have been visited all scopes that were generated are merged into one
     * and are stored in the singleton so the code checker can use them.
     * @param ctx Context of the current node.
     * @return Returns the type of the node.
     */
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

    /**
     * Visitor for the rule that checks the syntax of VAR. This method is called every time a VAR is used.
     * @param ctx Context of the current node.
     * @return Returns the type of the node.
     */
    @Override
    public Type visitCheckVAR(TJBParser.CheckVARContext ctx) {
        String value = ctx.getText();
        //Check if the VAR exists.
        if (ifVariableExists(value, currentScope)){
            //If the VAR exists get the type and store it in the table, so it can be used in the code generator or in the
            //type checker.
            Type type = getVariableType(value, currentScope);
            addCtx(ctx,type);
            return type;
        }
        return null;
    }

    /**
     * Visitor for the rule that checks the syntax of Str1-9. This method is called every time a Str1-9 is used.
     * @param ctx Context of the current node.
     * @return Returns the type of the node.
     */
    @Override
    public Type visitCheckSTRID(TJBParser.CheckSTRIDContext ctx) {
        String value = ctx.getText();
        //Check if the Str exists.
        if (ifVariableExists(value, currentScope)){
            //Unlike the CheckVAR here you don't need to get the type, since it will always be a STRING.
            addCtx(ctx, Type.STRING);
            return Type.STRING;
        }
        return null;
    }

    /**
     * Visitor for the rule that checks the syntax of Arrays(L1-6). This method is called every time an array is used.
     * @param ctx Context of the current node.
     * @return Returns the type of the node.
     */
    @Override
    public Type visitCheckArray(TJBParser.CheckArrayContext ctx) {
        String value = ctx.getText();
        //Check if the Array exists.
        if (ifVariableExists(value, currentScope)){
            //Get the type of the array and store it in the table, so it can be used in the code generator or in the
            //type checker.
            Type type = getVariableType(value, currentScope);
            addCtx(ctx, type);
            return type;
        }
        return null;
    }

    //Calculation.

    /**
     * Visitor for when parentheses are used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExParentheses(TJBParser.ExParenthesesContext ctx) {
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when negation is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExNegate(TJBParser.ExNegateContext ctx) {
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when the multiplication is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExMulDivOp(TJBParser.ExMulDivOpContext ctx) {
        //Visit the left and the right side.
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        //If the type of the left/right side is null you know that a variable that does not exist was used so throw
        //an error.
        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.STRING || right == Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " Cannot use strings in calculations.");
        }

        //If the calculation is made up of 2 integers then the type of the calculation will be an INTEGER.
        if (left == Type.INT && right == Type.INT) {
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            //If even one number was a double(float) the result will also be a double, so the type of the calculation
            //is also a DOUBLE.
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    /**
     * Visitor for when the multiplication is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExAddOp(TJBParser.ExAddOpContext ctx) {
        //Visit the left and the right side.
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        //If the type of the left/right side is null you know that a variable that does not exist was used so throw
        //an error.
        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.STRING || right == Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " Cannot use strings in calculations.");
        }

        //If the calculation is made up of 2 integers then the type of the calculation will be an INTEGER.
        if (left == Type.INT && right == Type.INT) {
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            //If even one number was a double(float) the result will also be a double, so the type of the calculation
            //is also a DOUBLE.
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    /**
     * Visitor for when a modulo is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @SuppressWarnings("Duplicates")
    @Override
    public Type visitExModOp(TJBParser.ExModOpContext ctx) {
        //Visit the left and the right side.
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        //If the type of the left/right side is null you know that a variable that does not exist was used so throw
        //an error.
        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not defined.");
        } else if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + " Is not defined.");
        }

        if (left == Type.STRING || right == Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " Cannot use strings in calculations.");
        }

        //If the calculation is made up of 2 integers then the type of the calculation will be an INTEGER.
        if (left == Type.INT && right == Type.INT) {
            addCtx(ctx, Type.INT);
            return Type.INT;
        } else {
            //If even one number was a double(float) the result will also be a double, so the type of the calculation
            //is also a DOUBLE.
            addCtx(ctx, Type.DOUBLE);
            return Type.DOUBLE;
        }
    }

    /**
     * Visitor for when a VAR is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExVarLiteral(TJBParser.ExVarLiteralContext ctx) {
        //Visit the checkVAR method and store the type that is returned.
        Type type = visit(ctx.val);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when a double(float) is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExDblLiteral(TJBParser.ExDblLiteralContext ctx) {
        addCtx(ctx, Type.DOUBLE);
        return Type.DOUBLE;
    }

    /**
     * Visitor for when a negative number is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExNegLiteral(TJBParser.ExNegLiteralContext ctx) {
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    /**
     * Visitor for when an integer is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExIntLiteral(TJBParser.ExIntLiteralContext ctx) {
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    //Assignment.

    /**
     * Visitor for when an number is declared.
     * 5 -> A
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitNumAsn(TJBParser.NumAsnContext ctx) {
        //Visit the left and right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If this is null this means that a variable with such name does not exists and we can use it. If it is not null
        //then this means that the variable exists already so then an error is thrown.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined in this scope.");
        }

        //If this is null this means that a VAR which does not exist was used (A -> B). If the VAR does not exist
        //then throw an error.
        if (value == null) {
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined in this scope.");
        }


        //Store the new variable in the symbol table of the current scope, along with the variable's name, type and number
        //on stack.
        currentScope.getSymTable().put(ctx.name.getText(),
                new Symbol(ctx,value, numberOnStack));
        //Increase the number of variables on stack.
        numberOnStack++;
        addCtx(ctx, value);
        return super.visitNumAsn(ctx);
    }

    /**
     * Visitor for when a string is declared.
     * "Hello" -> Str1
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitStrAsn(TJBParser.StrAsnContext ctx) {
        //Visit the variable name.
        Type name = visit(ctx.name);

        //If this is null this means that the string name is not in use. If this is not null then this means that the
        //variable is already in use, so an error is thrown.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        //Store the new variable in the symbol table of the current scope, along with the variable's name, type and number
        //on stack.
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitStrAsn(ctx);
    }

    /**
     * Visitor for when an already declared string is used to declare a new string.
     * Str1 -> Str2
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitStrCpyAsn(TJBParser.StrCpyAsnContext ctx) {
        //Visit the left and the right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If this is null this means that the name of the new variable is not in use.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        //If this is null this means that the variable that we are using for the declaration(left side) is not declared
        //yet, so throw an error.
        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        //Store the new variable in the symbol table of the current scope, along with the variable's name, type and number
        //on stack.
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitStrCpyAsn(ctx);
    }

    /**
     * Visitor which is called when an array is created.
     * {1,2} -> L1
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitArrAsn(TJBParser.ArrAsnContext ctx) {
        //Visit the left and the right side.
        Type name = visit(ctx.name);
        Type typeOfArray = visit(ctx.value);

        //If this is null this means that the name of the array is not in use.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        //Store the new variable in the symbol table of the current scope, along with the variable's name, type and number
        //on stack.
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, typeOfArray, numberOnStack));
        numberOnStack++;
        addCtx(ctx, typeOfArray);
        return super.visitArrAsn(ctx);
    }

    /**
     * Visitor which is called when an already existing array is used to create a new array.
     * L1 -> L2
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitArrCpyAsn(TJBParser.ArrCpyAsnContext ctx) {
        //Visit the left and the right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If this is null this means that the name of the new array is not in use in the current scope.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }

        //If this is null this means that the array that we are using(left side) to declare the new array is not defined,
        //throw an error.
        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, value,numberOnStack));
        numberOnStack++;
        addCtx(ctx, value);
        return super.visitArrCpyAsn(ctx);
    }

    /**
     * Visitor which is called when an already existing array is used to overwrite another already exsting array.
     * L1 --> L2
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitArrAsnVAR(TJBParser.ArrAsnVARContext ctx) {
        //Visit the left and the right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If this is null this means that the right array has not been declared yet.
        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        //If this is null this means that the left array has not been declared yet.
        if (value == null) {
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined.");
        }

        if (value != name){
            throw new CompilerException(ctx, ctx.getText() + " Type mismatch.");
        }
        addCtx(ctx, value);
        return super.visitArrAsnVAR(ctx);
    }

    /**
     * Visitor which is used when the value of an already existing VAR is being overwritten.
     * 65 + 54 --> A
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitNumAsnVAR(TJBParser.NumAsnVARContext ctx) {
        //Visit the left and the right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If this is null this means that the value that we are trying to overwrite does not exist.
        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else if (value == null) {
            //If this is null this means that a VAR which does not exist was used as the left argument.
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        } else {
            //If we are trying to assign a double to an integer throw an exception.
            if (value == Type.DOUBLE && name == Type.INT) {
                throw new CompilerException(ctx, "Double cannot be assigned to an integer."
                        + ctx.value.getText() + " Is a double." + ctx.name.getText() + " Is an integer.");
            }
        }
        addCtx(ctx, value);
        return super.visitNumAsnVAR(ctx);
    }

    /**
     * Visitor which is called when an already existing string's value is overwritten by another already existing string's
     * value.
     * Str1 --> Str2
     * @param ctx The context of the node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrAsnVAR(TJBParser.StrAsnVARContext ctx) {
        //Check the left and the right side.
        Type value = visit(ctx.value);
        Type name = visit(ctx.name);

        //If name or value is null this means that these strings have not been declared yet.
        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }

        if (value == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitStrAsnVAR(ctx);
    }

    /**
     * Visitor which is used when an already existing string is being overwrite by a new string.
     * "New Hello" --> Str1
     * @param ctx The context of the node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrAsnNEWVAR(TJBParser.StrAsnNEWVARContext ctx) {
        //Visit the right side.
        Type name = visit(ctx.name);
        //If this is null this means that the right side has not been declared yet, so throw an exception.
        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitStrAsnNEWVAR(ctx);
    }

    //Boolean expressions

    /**
     * Visitor which is used when a boolean expression between parenthesis is used.
     * (5 < 6)
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitBoolParentheses(TJBParser.BoolParenthesesContext ctx) {
        Type type = visit(ctx.bool);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor which is used when a negated boolean expression is used.
     * !(5 < 6)
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitBoolNeg(TJBParser.BoolNegContext ctx) {
        Type type = visit(ctx.bool);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor which is used when a boolean comparison is used.
     * @param ctx
     * @return
     */
    @Override
    public Type visitBoolComp(TJBParser.BoolCompContext ctx) {
        //Visit the left and right side.
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        //If left or right is null this means that a variable which was not declared yet was used, so throw an exception.
        if (left == null) {
            throw new CompilerException(ctx, ctx.left.getText() + "Is not defined.");
        }

        if (right == null) {
            throw new CompilerException(ctx, ctx.right.getText() + "Is not defined.");
        }

        String compToken = ctx.comp.getText();

        //Ex: (5 > 5) < (8>8)
        //Check if the left and the right side are boolean expression. If they are, and if any comparison sign is used
        //between them then then throw an error.
        if (left == Type.BOOLEAN && left == right) {
            if ((!compToken.equals("||") && !compToken.equals("And")) &&
                    (!compToken.equals("||") && !compToken.equals("And"))) {
                throw new CompilerException(ctx, "Cannot compare boolean expressions");
            }
            addCtx(ctx, Type.BOOLEAN);
        } else if (left != right) {
            //Check if left and right side are comparable types.
            if (!(left == Type.INT && right == Type.DOUBLE)
                    && !(left == Type.DOUBLE && right == Type.INT)) {
                throw new CompilerException(ctx, "You cannot compare different types."
                        + ctx.left.getText() + " Is " + left + " "
                        + ctx.right.getText() + " Is " + right);
            }
            addCtx(ctx, Type.DOUBLE);
        } else if (left == Type.STRING) {
            //When strings are compared do not allow any signs other than '!=' and '='.
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

    /**
     * Visitor which is used when a comparison log is used.
     * (5<8) || (6>8)
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitBoolCompLog(TJBParser.BoolCompLogContext ctx) {
        //Visit the right and the left side.
        Type left = visit(ctx.left);
        Type right = visit(ctx.right);

        //If either side is not of type BOOLEAN(which means that it is not a real expression) throw an error.
        if (left != Type.BOOLEAN) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not boolean");
        } else if (right != Type.BOOLEAN) {
            throw new CompilerException(ctx, ctx.left.getText() + " Is not boolean");
        }

        addCtx(ctx, Type.BOOLEAN);
        return Type.BOOLEAN;
    }

    /**
     * Visitor which is used when a calculation is used in a boolean.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitBoolCalc(TJBParser.BoolCalcContext ctx) {
        Type type = visit(ctx.calc);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor when a declared string is used in a boolean.
     * Str1 = "asd"
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitBoolSTRID(TJBParser.BoolSTRIDContext ctx) {
        Type type = visit(ctx.str);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor which is used when a non-declared string is used in a boolean.
     * "asd" = "asd"
     * @param ctx
     * @return
     */
    @Override
    public Type visitBoolSTR(TJBParser.BoolSTRContext ctx) {
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    //While loop

    /**
     * Visitor for when a while loop is being visited.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitWhileTJB(TJBParser.WhileTJBContext ctx) {
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;
        //Visit everything.
        Type type = super.visitWhileTJB(ctx);

        //Checks if the argument for the while loop is an actuall boolean expression.
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


    /**
     * Visitor for when an if statement beings. (all if/else if/else statements).
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitIfTJB(TJBParser.IfTJBContext ctx) {

        Type type = super.visitIfTJB(ctx);

        return type;
    }

    /**
     * Visitor for when an if statement is used. (only the if statements).
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitIfStatement(TJBParser.IfStatementContext ctx) {
        //Check if the argument for the if statement is actuall a boolean expression.
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

    /**
     * Visitor for when an else statement is used.
     * @param ctx The context of the current node.
     * @return The scope of the current node.
     */
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

    /**
     * Visitor for when an else if statement is used.
     * @param ctx
     * @return
     */
    @Override
    public Type visitElseIfStatement(TJBParser.ElseIfStatementContext ctx) {
        Type argumentType = visit(ctx.bool);
        //Check if the argument for the else if statement is actually a boolean expression.
        if (argumentType != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.bool.getText() + "Is not a boolean statement");
        }
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

    /**
     * Visitor for when a for loop is visited.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitForTJB(TJBParser.ForTJBContext ctx) {
        //Create a new scope.
        SymbolTable newScope = new SymbolTable();
        newScope.setParent(currentScope);
        //Make it the current scope.
        currentScope = newScope;


        Type iteratorType = visit(ctx.iterator);

        Type iteratorValueType;
        if (iteratorType == null) {
            //If the iterator type(1st argument) is null this means that the variable which is used to compare with
            //is not declared yet and it needs to be declared.
            if (ctx.iterVal != null) {
                //iterVal(2nd argument) is used as a value for the (1st argument). If there is no such argument then
                //throw an error.
                if (ctx.iterVal.getText().isEmpty()) {
                    throw new CompilerException(ctx, " Iterator value cannot be empty");
                }
                //Depending on the 2nd argument the type of the new variable is determined.
                if (ctx.iterVal.getText().contains(".")) {
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

        //If an already declared VAR is used as 1st argument(When 1st argument is already defined the 2nd one is optional).
        if (iteratorType == Type.INT) {
            if(ctx.iterVal != null) {
                if (ctx.iterVal.getText().contains(".")) {
                    //If the second argument is a double, this means we are trying to assign a double to an int which
                    //is not allowed, so throw an error.
                    throw new CompilerException(ctx, ctx.iterVal.getText() + " Is a double and cannot be assigned to" +
                            " an integer");
                }
            }
        }

        //Only allows comparison tokens to be used.
//        if (ctx.comp.getText().equals("||") || ctx.comp.getText().equals("AND")
//                || ctx.comp.getText().equals("&&") || ctx.comp.getText().equals("Or")) {
//            throw new CompilerException(ctx, "Invalid comparison.");
//        }
//
//        Type incrementType = visit(ctx.increments);
//        if (incrementType == null) {
//            throw new CompilerException(ctx, " Is not defined.");
//        } else if (incrementType == Type.DOUBLE && iteratorType == Type.INT) {
//            throw new CompilerException(ctx, ctx.increments.getText() + " Is a double and cannot be assigned to an " +
//                    "integer");
//        }
        if (visit(ctx.comp) != Type.BOOLEAN){
            throw new CompilerException(ctx, ctx.comp.getText() + " Is not a boolean expression");
        }

        Type type = super.visitForTJB(ctx);
        //Add the scope to the list so you can use it later.
        scopes.add(currentScope);
        //After the visit is done make the parent the current scope again.
        currentScope = currentScope.getParent();
        return type;
    }

    /**
     * Visitor for when an increment expression is used.
     * @param ctx The context of the current node.
     * @return The scope of the current node.
     */
    @Override
    public Type visitIncrementEXP(TJBParser.IncrementEXPContext ctx) {
        //Visit the left and the right side.
        Type name = visit(ctx.nameVar);
        Type calc = visit(ctx.calc);

        //If the left or right side is null this means, that variables that have not been declared were used.
        if (name == null){
            throw new CompilerException(ctx, ctx.nameVar.getText() + " Is not defined.");
        } else if (calc == null){
            throw new CompilerException(ctx, ctx.calc.getText() + " Is not defined.");
        }
        return super.visitIncrementEXP(ctx);
    }

    /**
     * Visitor for when something is displayed.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitDisplay(TJBParser.DisplayContext ctx) {
        //Go through all children of the display.
        for (int i = 0; i < ctx.displayOptions().size(); i++) {
            Type type = visit(ctx.displayOptions(i));
            if (type == null) {
                //If a child is null, this means that it does not exist.
                throw new CompilerException(ctx, ctx.displayOptions(i).getText() + " Is not defined");
            }
        }
        return super.visitDisplay(ctx);
    }

    /**
     * Visitor for when an array is displayed.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitDispArray(TJBParser.DispArrayContext ctx) {
        Type type = visit(ctx.name);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when a non defined string is used in display.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitDispSTR(TJBParser.DispSTRContext ctx) {
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    /**
     * Visitor for when a calculation is displayed.
     * @param ctx
     * @return
     */
    @Override
    public Type visitDispCalc(TJBParser.DispCalcContext ctx) {
        //Get the type of the calculation.
        Type type = visit(ctx.calc);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when a declared string is used.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitDispSTRID(TJBParser.DispSTRIDContext ctx) {
        Type type = visit(ctx.name);
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when an array is build. It goes through all the arguments that are given for the array.
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitArrayBuild(TJBParser.ArrayBuildContext ctx) {
        Type type = null;

        //Check if the first child is a TerminalNode(token).
        if (ctx.getChild(1) instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) ctx.getChild(1);
            //Depending on the type of the token the type of the array list is determined.
            if (terminalNode.getSymbol().getType() == TJBLexer.INT) {
                type = Type.INTARRAY;
            } else if (terminalNode.getSymbol().getType() == TJBLexer.DBL) {
                type = Type.DOUBLEARRAY;
            } else if (terminalNode.getSymbol().getType() == TJBLexer.STR) {
                type = Type.STRINGARRAY;
            }
        } else if (ctx.getChild(1) instanceof TJBParser.CheckSTRIDContext) {
            //If the first child is an already defined string(rule).
            type = Type.STRINGARRAY;
        } else if (ctx.getChild(1) instanceof TJBParser.CalculationContext) {
            //If the first child is a calculation(rule).
            //Get the type of the calculation and depending on that determine the type of the array list.
            Type type1 = visit(ctx.getChild(1));
            switch (type1) {
                case INT:
                    type = Type.INTARRAY;
                    break;
                case DOUBLE:
                    type = Type.DOUBLEARRAY;
                    break;
            }
        } else if (ctx.getChild(1) instanceof TJBParser.StringUsrInContext){
            //If the first child is a string from user input(rule).
            type = Type.STRINGARRAY;
        }

        //List of the remaining children.
        List<ParseTree> terminalNodes = new ArrayList<>();

        //Go through all children.
        for (int i = 0; i < ctx.getChildCount(); i++) {
            //Skip the comas and the brackets.
            if (!ctx.getChild(i).getText().equals("{") &&
                    !ctx.getChild(i).getText().equals("}") &&
                    !ctx.getChild(i).getText().equals(",")) {
                ParseTree parseTree = ctx.getChild(i);
                if (type == Type.INTARRAY) {
                    //If the array is an INTARRAY do not allow anything else other than an integer.
                    if (parseTree instanceof TerminalNode) {
                        //If child is a token.
                        if (((TerminalNode) parseTree).getSymbol().getType() != TJBParser.INT) {
                            throw new CompilerException(ctx, parseTree.getText() + " Is not an integer." +
                                    " This array should include only integers.");
                        }
                    } else if (visit(parseTree) != Type.INT) {
                        throw new CompilerException(ctx, parseTree.getText() + " Is not an integer." +
                                " This array should include only integers.");
                    }
                } else if (type == Type.DOUBLEARRAY) {
                    //If the array is a DOUBLEARRAY do not allow strings.
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
                    //If the array is a STRING array do not allow numbers.
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

    /**
     * Visitor for when user input is used to declare a string.
     * Scn1.nextStr -> Str1
     * @param ctx The context of the node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrAsnUsrIn(TJBParser.StrAsnUsrInContext ctx) {
        //Visit the left and right side.
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        //If this is null this means that the scanner has not been declared yet.
        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        //If this is null this means that the name of the string is not in use.
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

    /**
     * Visitor for when a user input is used to change the value of an already defined string.
     * Scn1.nextStr --> Str1
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrAsnUsrInVAR(TJBParser.StrAsnUsrInVARContext ctx) {
        //Visit the left and the right side.
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        //If this is null this means that the scanner has not been declared yet.
        if (scanner == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }

        //If this is null this means that the string has not been declared yet.
        if (type == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined");
        }
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    //Scanner.

    /**
     * Visitor for when a scanner is closed.
     * Scn1.close
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitScannerCls(TJBParser.ScannerClsContext ctx) {
        //Visit the scanner.
        Type type = visit(ctx.scnr);
        //If the scanner does not exist throw an exception.
        if (type == null) {
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined");
        }
        return super.visitScannerCls(ctx);
    }

    /**
     * Visit for when a scanner is being created.
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitScannerAsn(TJBParser.ScannerAsnContext ctx) {
        //Visit the scanner name.
        Type type = visit(ctx.name);
        //If the name is null, this means it has not been take.
        if (type == null) {
            //Add the scanner to the table.
            currentScope.getSymTable().put(ctx.name.getText()
                    , new Symbol(ctx, Type.SCANNER, numberOnStack));
            numberOnStack++;
        } else {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined");
        }
        return super.visitScannerAsn(ctx);
    }

    /**
     * Visitor for when a scanner is being used.
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitCheckSCNID(TJBParser.CheckSCNIDContext ctx) {
        String value = ctx.getText();

        if (ifVariableExists(value, currentScope)){
            Type type = getVariableType(value, currentScope);
            addCtx(ctx,type);
            return type;
        }
        return null;
    }

    //Get array value.

    /**
     * Visitor for when a value from an array is used.
     * L1.[0]
     * @param ctx
     * @return
     */
    @Override
    public Type visitArrayGetValue(TJBParser.ArrayGetValueContext ctx) {
        //Visit the array.
        Type typeOfArray = visit(ctx.arrayName);
        Type typeOfValue = null;

        //If this is null, this means that the array has not been declared.
        if (typeOfArray == null){
            throw new CompilerException(ctx, ctx.arrayName.getText() + " List does not exist");
        }

        //Depending on the type of the array determine the type of the value.
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

    /**
     * Visitor for when a calculation is used to change the value of a value in an array.
     * @param ctx The context of the current node.
     * @return The return type.
     */
    @Override
    public Type visitAsnArrVal(TJBParser.AsnArrValContext ctx) {
        //Visit left and right side.
        Type value = visit(ctx.value);
        Type arrValue = visit(ctx.name);

        //If this is null, this means that a variable which is not yet declared has been used.
        if (value == null){
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined.");
        }
        if (arrValue == Type.INT && value == Type.DOUBLE){
            throw new CompilerException(ctx, ctx.getText() + " You cannot assign double to an int.");
        }
        if (arrValue == Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " You cannot assign number to string.");
        }
        return arrValue;
    }

    /**
     * Visitor for when a variable from an array is used in a calculation.
     * @param ctx The context of the current node.
     * @return The type of the current node.
     */
    @Override
    public Type visitExArrLiteral(TJBParser.ExArrLiteralContext ctx) {
        Type type = visit(ctx.arrayGetValue());
        addCtx(ctx, type);
        return type;
    }

    /**
     * Visitor for when a variable from an array is used to declare a string.
     * L1.[0] -> Str1
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitAsnStrFromArr(TJBParser.AsnStrFromArrContext ctx) {
        Type name = visit(ctx.name);

        //If this is not null, this means that the name of the string is already in user.
        if (name != null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is already defined.");
        }
        //Add the new string to the table.
        currentScope.getSymTable().put(ctx.name.getText()
                , new Symbol(ctx, Type.STRING, numberOnStack));
        numberOnStack++;
        addCtx(ctx, Type.STRING);
        return super.visitAsnStrFromArr(ctx);
    }

    /**
     * Visitor for when a variable from an array is used to change the value of an already existing string.
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitCpyAsnStrFromArr(TJBParser.CpyAsnStrFromArrContext ctx) {
        Type name = visit(ctx.name);
        //If this is null, this means that the string that we are trying to change does not exist.
        if (name == null) {
            throw new CompilerException(ctx, ctx.name.getText() + " Is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return super.visitCpyAsnStrFromArr(ctx);
    }

    /**
     * Visitor for when a string is used to change the value of a variable from an array.
     * "Hello" -> L1.[0]
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrArrAsn(TJBParser.StrArrAsnContext ctx) {
        Type type = visit(ctx.name);
        //Check if the type of the array value is a string.
        if (type != Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " Cannot assing string to a number");
        }
        return super.visitStrArrAsn(ctx);
    }

    /**
     * Visitor for when an already declared string is used to change the value of a variable from an array.
     * Str1 -> L1.[0]
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitStrArrAsnVar(TJBParser.StrArrAsnVarContext ctx) {
        Type type = visit(ctx.value);
        Type arrayValue = visit(ctx.name);

        //If the array value type is not a string throw an error.
        if (arrayValue != Type.STRING){
            throw new CompilerException(ctx, ctx.getText() + " Cannot assign string to a number");
        }

        //If the string does not exist throw an error.
        if (type == null){
            throw new CompilerException(ctx, ctx.value.getText() + " Is not defined.");
        }
        return super.visitStrArrAsnVar(ctx);
    }

    /**
     * Visitor for when a user input is used to chang the value of a variable from an array.
     * Scn1.nextStr -> L1.[0]
     * @param ctx The context of the current node.
     * @return
     */
    @Override
    public Type visitStrArrValUsrIn(TJBParser.StrArrValUsrInContext ctx) {
        Type type = visit(ctx.name);
        Type scanner = visit(ctx.scnr);

        //If the scanner does not exist throw an exception.
        if (scanner == null){
            throw new CompilerException(ctx, ctx.scnr.getText() + " Is not defined.");
        }

        //If the array value type is not a string throw an exception.
        if (type != Type.STRING){
            throw new CompilerException(ctx, ctx.name.getText() + " Array type does not match type of the value.");
        }
        return super.visitStrArrValUsrIn(ctx);
    }

    /**
     * Visitor for when a user input(int) is used in a calculation.
     * Scn1.nextInt + 5
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitExAsnUsrInt(TJBParser.ExAsnUsrIntContext ctx) {
        Type type = visit(ctx.scnr);
        //If the scanner does not exist throw an exception.
        if (type == null){
            throw new CompilerException(ctx, ctx.getText() + " Scanner is not defined.");
        }
        addCtx(ctx, Type.INT);
        return Type.INT;
    }

    /**
     * Visitor for when a user input(double) is used in a calculation.
     * Scn1.nextDbl + 5
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitExAsnUsrDbl(TJBParser.ExAsnUsrDblContext ctx) {
        Type type = visit(ctx.scnr);
        //If the scanner does not exist throw an excpetion.
        if (type == null){
            throw new CompilerException(ctx, ctx.getText() + " Scanner is not defined.");
        }
        addCtx(ctx, Type.DOUBLE);
        return Type.DOUBLE;
    }

    /**
     * Visitor for when a user input(string) is used.
     * @param ctx The context of the current node.
     * @return The return type of the current node.
     */
    @Override
    public Type visitStringUsrIn(TJBParser.StringUsrInContext ctx) {
        Type type = visit(ctx.scnr);
        //If the scanner does not exist throw an exception.
        if (type == null){
            throw new CompilerException(ctx, ctx.getText() + " Scanner is not defined.");
        }
        addCtx(ctx, Type.STRING);
        return Type.STRING;
    }

    /**
     * Visitor for when a user input(string) is printed.
     * @param ctx The context of the current node.
     * @return The return type of the node.
     */
    @Override
    public Type visitDispUsrString(TJBParser.DispUsrStringContext ctx) {
        return visit(ctx.str);
    }
}
