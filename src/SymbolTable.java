import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Type> symTable = new HashMap<>();
    private SymbolTable parent = null;

    public SymbolTable()
    {

    }

    public void addSymbol(String string, Type type){
        symTable.put(string, type);
    }

    public Map<String, Type> getSymTable() {
        return symTable;
    }
}
