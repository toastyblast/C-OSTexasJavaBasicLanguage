import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TJB {

    private static void evaluate(String line){
        // Create lexer and run scanner to create stream of tokens
        CharStream charStream = CharStreams.fromString(line);
        TJBLexer lexer = new TJBLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        TJBParser parser = new TJBParser(tokens);
        ParseTree expression = parser.codeLine();

        // Type check then evaulate by running the visitor
        evaluateAndPrint(expression); // <-- Change this to checkEvaluateAndPrint when you implemented a checker
    }

    private static void evaluateAndPrint( ParseTree parseTree ) {

        // Type check then evaulate by running the visitor
        try {
            TypeChecker typeChecker = new TypeChecker();
            Type type = typeChecker.visit(parseTree);  // throws on error
        } catch( CompilerException ce ) {
            System.err.println("ERROR: " + ce.getMessage() );
        }

    }

    public static void main(String[] args) {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get("./code") ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Eval
        try {
            evaluate(content);
        } catch (RuntimeException RE){
            System.err.println(RE.getMessage());
        }
    }

}
