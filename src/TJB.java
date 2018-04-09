import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

    private static void evaluate(String line) {
        //TODO 1: Ask user for what file to read the code from.
        //TODO 2: Then, ask the user for a name to output the generated Jasmin code into.
        //TODO 3: Finally, ask them for a name for the .class file OR give that the same name as the jasmin code file they gave, with "CLASS" added at the end of it (to have one less name to ask for).
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

        CodeGenVisitor genVisitor = new CodeGenVisitor();
        ArrayList<String> generatedCode = genVisitor.visit(expression);

        System.out.println("========CODE GENERATED========");
        System.out.println(startProg.replaceAll("\\{\\{name\\}\\}", programName));
        // Output compiled part of the jasmin file
        System.out.println(generatedCode.stream().collect(Collectors.joining("\n")));
        // Output footer of jasmin file
        System.out.println(endProg);
        System.out.println("==============================");

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("JasminCode.j"));
            writer.write(startProg.replaceAll("\\{\\{name\\}\\}", programName));
            writer.write("\n");
            writer.write(generatedCode.stream().collect(Collectors.joining("\n")));
            writer.write(endProg);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n========COMMAND OUTPUT========");
        //FIXME: Show the name of the file according to what the user gave as input for the name.
        System.out.println("Generated Jasmin/Java ByteCode file: " + "JasminCode.j");
        executedCommand("java -jar jasmin.jar JasminCode.j");

        System.out.println("\nNow running the generated class file, displaying its outputs afterwards...");
        System.out.println("==============================");

        System.out.println("\n========PROGRAM OUTPUT========");
        executedCommand("java PLACEHOLDER");
        System.out.println("==============================");
    }

    private static void evaluateAndPrint(ParseTree parseTree) {
        // Type check then evaulate by running the visitor
        try {
            TypeCheckerV2 typeChecker = new TypeCheckerV2();
            Type type = typeChecker.visit(parseTree);  // throws on error
            Singleton.getInstance().copyTable();
//            for (ParserRuleContext context:
//                    Singleton.getInstance().getCheckUpTable().keySet()) {
//                System.out.println(Singleton.getInstance().getCheckUpTable().get(context));
//            }
        } catch (CompilerException ce) {
            System.err.println("ERROR: " + ce.getMessage());
        }
    }

    public static void main(String[] args) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("./generatorTest")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Eval
        try {
            evaluate(content);
        } catch (RuntimeException RE) {
            System.err.println(RE.getMessage());
        }
    }

    private static void executedCommand(String command) {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line1;

            while ((line1 = input.readLine()) != null) {
                System.out.println(line1);
            }

            int exitVal = pr.waitFor();
            System.out.println("\nCommand execution finished with error code " + exitVal);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}
