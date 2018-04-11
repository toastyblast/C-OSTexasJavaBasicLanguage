import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
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
        Scanner inputScanner = new Scanner(System.in);
        String programName = "CLASS_PLACEHOLDER";
        String jasminFileName = "JASMIN_PLACEHOLDER";

        System.out.println("\nPlease enter a name for your program's generated Java Bytecode/Class file.");
        System.out.print("Enter class name: ");
        programName = inputScanner.nextLine();
        //Remove any spaces and/or forward slashes, as we do not allow these (this can confuse the OS).
        programName = programName.replaceAll(" ", "_");
        programName = programName.replaceAll("/", "_");
        jasminFileName = programName + "-JASMIN.j";

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

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("./compilerOutput/jasminCode/" + jasminFileName));
            writer.write(startProg.replaceAll("\\{\\{name\\}\\}", programName));
            writer.write("\n");
            writer.write(generatedCode.stream().collect(Collectors.joining("\n")));
            writer.write(endProg);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nCreating files with desired names in folder [./compilerOutput/]...");
        System.out.println("Running UI outputs while compiling...");

        System.out.println("\n========COMMAND OUTPUT========");
        System.out.println("Generated Jasmin/Java ByteCode file: " + jasminFileName);
        executedCommand("java -jar jasmin.jar ./compilerOutput/jasminCode/" + jasminFileName);

        System.out.println("\nNow running the generated class file, displaying its outputs afterwards...");
        System.out.println("==============================");

        System.out.println("\n========PROGRAM OUTPUT========");
        executedCommand("java " + programName);
        System.out.println("==============================");

        System.out.println("\n========ARCHIVE OUTPUT========");
        executedCommand("cmd /c move ./" + programName + ".class ./compilerOutput/");
        System.out.println("==============================");
    }

    private static void evaluateAndPrint(ParseTree parseTree) {
        // Type check then evaulate by running the visitor
        try {
            TypeCheckerV2 typeChecker = new TypeCheckerV2();
            Type type = typeChecker.visit(parseTree);  // throws on error
//            Singleton.getInstance().copyTable();
//            for (ParserRuleContext context:
//                    Singleton.getInstance().getCheckUpTable().keySet()) {
//                System.out.println(Singleton.getInstance().getCheckUpTable().get(context));
//            }
        } catch (CompilerException ce) {
            System.err.println("ERROR: " + ce.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String pathToCodeFile = "CODE_PLACEHOLDER";

        System.out.println("Please enter the name of the text file with your TJ-B code to compile (please give the exact path from project package).");
        System.out.print("Enter file name: ");
        pathToCodeFile = inputScanner.nextLine();

        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(pathToCodeFile)));
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
