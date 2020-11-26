import java.util.*;

public class Toml2CStruct extends tomlBaseListener {
    private int depth = 1;
    Stack<String> toCloseStruct = new Stack<String>();

    private void openStruct() {
        System.out.println("  ".repeat(Math.max(depth, 0)) + "typedef struct {");
        depth++;
    }

    private void closeStruct(String struct) {
        depth--;
        System.out.println("  ".repeat(Math.max(depth, 0)) + "} " + struct + ";\n");
    }

    @Override
    public void enterDocument(tomlParser.DocumentContext ctx) {
        System.out.println("\nstruct toml_t {");
    }

    @Override
    public void exitDocument(tomlParser.DocumentContext ctx) {
        while (!toCloseStruct.empty()) {
            closeStruct(toCloseStruct.peek());
            toCloseStruct.pop();
        }
        System.out.println("}");
    }

    @Override
    public void enterStandard_table(tomlParser.Standard_tableContext ctx) {
        List<String> structs = Arrays.asList(ctx.key().getText().split("\\."));

        while (!toCloseStruct.empty())
            if (!structs.contains(toCloseStruct.peek())) {
                closeStruct(toCloseStruct.peek());
                toCloseStruct.pop();
            } else {
                break;
            }
        for (String struct : structs) {
            if (!toCloseStruct.contains(struct))
                toCloseStruct.add(struct);
        }
        openStruct();

    }

    @Override
    public void exitStandard_table(tomlParser.Standard_tableContext ctx) {

    }

    @Override
    public void enterKey_value(tomlParser.Key_valueContext ctx) {
        System.out.print("  ".repeat(depth));
        if (ctx.value().getText().charAt(0) == '"') {
            System.out.printf("char* %s;\n", ctx.key().getText());
        } else if (ctx.value().getText().equals("true") || ctx.value().getText().equals("false")) {
            System.out.printf("bool %s;\n", ctx.key().getText());
        } else {
            System.out.printf("int %s;\n", ctx.key().getText());
        }
    }
}
