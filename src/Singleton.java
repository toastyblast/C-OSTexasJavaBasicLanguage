import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private SymbolTable symbolTable = null;
    private Map<ParserRuleContext, Symbol> checkUpTable = new HashMap<>();

    public static Singleton getInstance() {
        return ourInstance;
    }

    public SymbolTable getSymbolTable() {
        if (symbolTable == null){
            symbolTable = new SymbolTable();
        }
        return symbolTable;
    }

    public void copyTable(ArrayList<SymbolTable> listOfTables){
        for (int i = 0; i < listOfTables.size(); i++) {
            for (String key:
                 listOfTables.get(i).getSymTable().keySet()) {
                ParserRuleContext ctx = listOfTables.get(i).getSymTable().get(key).getCtx();
                Symbol symbol = listOfTables.get(i).getSymTable().get(key);
                checkUpTable.put(ctx, symbol);
            }
        }
    }

    public Map<ParserRuleContext, Symbol> getCheckUpTable() {
        return checkUpTable;
    }
    private Singleton() {
    }
}
