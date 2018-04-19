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
            runTJBCompiler(content);
        } catch (RuntimeException RE) {
            System.err.println(RE.getMessage());
        }
    }

    private static void runTJBCompiler(String line) {
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

        // Type check then runTJBCompiler by running the visitor
        try {
            TypeCheckerV2 typeChecker = new TypeCheckerV2();
            Type type = typeChecker.visit(expression);  // throws on error

//            Singleton.getInstance().copyTable();
//            for (ParserRuleContext context:
//                    Singleton.getInstance().getCheckUpTable().keySet()) {
//                System.out.println(Singleton.getInstance().getCheckUpTable().get(context));
//            }

            //If the typechecker did not throw an exception, then run the code generator.
            CodeGenVisitor genVisitor = new CodeGenVisitor();
            ArrayList<String> generatedCode = genVisitor.visit(expression);

            //This is here to write the generated jasmin code array made by the code generator to an actual text file.
            //The text file is then used by the Java library to build the class file and run that.
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter("./compilerOutput/jasminCode/" + jasminFileName));

            //Take the header defined at the top of this class, then turn the string into actual text and finally add
            // the end program string from the top of this class as well.
            writer.write(startProg.replaceAll("\\{\\{name\\}\\}", programName));
            writer.write("\n");
            writer.write(generatedCode.stream().collect(Collectors.joining("\n")));
            writer.write(endProg);
            writer.close();

            //Show UI output on run terminal so the user knows what is happening.
            System.out.println("\nCreating files with desired names in folder [./compilerOutput/]...");
            System.out.println("Running UI outputs while compiling...");

            //This shows what commands the system is doing, as to give insight for the user on what files were generated.
            System.out.println("\n========COMMAND OUTPUT========");
            System.out.println("Generated Jasmin/Java ByteCode file: " + jasminFileName);
            executedCommand("java -jar jasmin.jar ./compilerOutput/jasminCode/" + jasminFileName);
            System.out.println("==============================");

            //This runs the .class file generated and prints out the output, along with the error code given.
            System.out.println("\n========PROGRAM OUTPUT========");
            executedCommand("java " + programName);
            System.out.println("==============================");

            //This is the final output of moving the class file to the compilerOutput folder. Java can only run files from the current directory, so that's why it is moved after said running.
            System.out.println("\n========ARCHIVE OUTPUT========");
            executedCommand("cmd /c move ./" + programName + ".class ./compilerOutput/");
            System.out.println("==============================");
        } catch (CompilerException ce) {
            System.err.println("ERROR: " + ce.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
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
            System.out.println("\nSYSTEM - Command execution finished with error code " + exitVal);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}
