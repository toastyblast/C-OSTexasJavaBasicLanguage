import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TJB {
    private static String startProg = ".class public {{name}}\n" +
            ".super java/lang/Object\n" +
            "\n" +
            ";\n" +
            "; standard initializer (calls java.lang.Object's initializer)\n" +
            ";\n" +
            ".method public <init>()V\n" +
            "\taload_0\n" +
            "\tinvokenonvirtual java/lang/Object/<init>()V\n" +
            "\treturn\n" +
            ".end method\n" +
            "\n" +
            ";\n" +
            "; main() method\n" +
            ";\n" +
            ".method public static main([Ljava/lang/String;)V";

    private static String endProg = "\n\treturn\n.end method";

    private static void evaluate(String line){
        //FIXME: Get a name for the program from the user in some way (will replace the "{{name}}" at the start of the startProg variable)
        String programName = "PLACEHOLDER";

        // Create lexer and run scanner to create stream of tokens
        CharStream charStream = CharStreams.fromString(line);
        TJBLexer lexer = new TJBLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        TJBParser parser = new TJBParser(tokens);
        ParseTree expression = parser.codeLine();

        // Type check then evaulate by running the visitor
        evaluateAndPrint(expression); // <-- Change this to checkEvaluateAndPrint when you implemented a checker

        //TODO - Yoran: Make the code generator
        CodeGenVisitor genVisitor = new CodeGenVisitor();
        ArrayList<String> generatedCode = genVisitor.visit(expression);

        System.out.println(startProg.replaceAll("\\{\\{name\\}\\}", programName));
        // Output compiled part of the jasmin file
        System.out.println(generatedCode.stream().collect(Collectors.joining("\n")));
        // Output footer of jasmin file
        System.out.println(endProg);
    }

    private static void evaluateAndPrint( ParseTree parseTree ) {

        // Type check then evaulate by running the visitor
        try {
            TypeCheckerV2 typeChecker = new TypeCheckerV2();
            Type type = typeChecker.visit(parseTree);  // throws on error
            Singleton.getInstance().copyTable();
            for (ParserRuleContext context:
                    Singleton.getInstance().getCheckUpTable().keySet()) {
                System.out.println(Singleton.getInstance().getCheckUpTable().get(context));
            }
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
