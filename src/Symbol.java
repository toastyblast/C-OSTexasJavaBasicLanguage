import org.antlr.v4.runtime.ParserRuleContext;

public class Symbol {

    private ParserRuleContext ctx;
    private Type type;

    public Symbol(ParserRuleContext ctx, Type type){
        this.ctx = ctx;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }
}
