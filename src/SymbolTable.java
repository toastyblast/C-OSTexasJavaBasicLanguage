import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Symbol> symTable = new HashMap<>();
    private SymbolTable parent = null;

    public SymbolTable()
    {

    }

    public void addSymbol(String string, Symbol Symbol){
        symTable.put(string, Symbol);
    }

    public SymbolTable getParent() {
        return parent;
    }

    public void setParent(SymbolTable parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymTable() {
        return symTable;
    }
}
