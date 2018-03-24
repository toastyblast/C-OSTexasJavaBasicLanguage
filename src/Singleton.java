import java.util.HashMap;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private SymbolTable symbolTable = null;

    public static Singleton getInstance() {
        return ourInstance;
    }

    public SymbolTable getSymbolTable() {
        if (symbolTable == null){
            symbolTable = new SymbolTable();
        }
        return symbolTable;
    }

    private Singleton() {
    }
}
