import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private SymbolTable symbolTable = null;
    private Map<ParserRuleContext, Type> checkUpTable = new HashMap<>();

    public static Singleton getInstance() {
        return ourInstance;
    }

    public SymbolTable getSymbolTable() {
        if (symbolTable == null){
            symbolTable = new SymbolTable();
        }
        return symbolTable;
    }

    public void copyTable(){
        for (String key:
                symbolTable.getSymTable().keySet()) {
            ParserRuleContext ctx = symbolTable.getSymTable().get(key).getCtx();
            Type type = symbolTable.getSymTable().get(key).getType();
            checkUpTable.put(ctx, type);
        }
    }

    public Map<ParserRuleContext, Type> getCheckUpTable() {
        return checkUpTable;
    }
    private Singleton() {
    }
}
