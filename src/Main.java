import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.traversal.TreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage java -jar Toml2CStruct [source file path]");
            System.exit(1);
        }
        CharStream cs = CharStreams.fromFileName(args[0]);
        tomlLexer lexer = new tomlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tomlParser parser = new tomlParser(tokens);
        ParseTree tree = parser.document();
        ParseTreeWalker.DEFAULT.walk(new Toml2CStruct(), tree);
    }
}