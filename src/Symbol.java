import org.antlr.v4.runtime.ParserRuleContext;

public class Symbol {

    private ParserRuleContext ctx;
    private Type type;
    private int numberOnStack;

    public Symbol(ParserRuleContext ctx, Type type, int numberOnStack){
        this.ctx = ctx;
        this.type = type;
        this.numberOnStack = numberOnStack;
    }

    public Type getType() {
        return type;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    public int getNumberOnStack() {
        return numberOnStack;
    }
}
