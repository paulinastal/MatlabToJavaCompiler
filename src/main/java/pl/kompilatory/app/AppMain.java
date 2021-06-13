package pl.kompilatory.app;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.kompilatory.antlr4.MatlabLexer;
import pl.kompilatory.antlr4.MatlabParser;


import java.io.IOException;

public class AppMain {
    public static void main(String[] args) {
        String matlabFilePath = args[0];
        String javaFolderPath = args[1];
        System.out.println("Matlab file: " + matlabFilePath);
        System.out.println("Java file folder: " + javaFolderPath);

        try {
            MatlabLexer matlabLexer = new MatlabLexer(CharStreams.fromFileName(matlabFilePath));
            CommonTokenStream commonTokenStream = new CommonTokenStream(matlabLexer);
            MatlabParser matlabParser = new MatlabParser(commonTokenStream);
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();

            ParseTree parseTree = matlabParser.program();

            String fileName = getMatlabFileName(matlabFilePath);

            MatlabToJavaListener matlabToJavaListener = new MatlabToJavaListener(fileName, javaFolderPath);
            parseTreeWalker.walk(matlabToJavaListener, parseTree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getMatlabFileName(String filePath) {
        String[] split = filePath.split("\\\\");
        int length = split.length;
        String file = split[length - 1];
        return file.substring(0, file.length() - 2);
    }
}
