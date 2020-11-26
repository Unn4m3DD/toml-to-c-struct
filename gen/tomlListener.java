// Generated from /home/andre/IdeaProjects/toml-to-c-struct/src/toml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tomlParser}.
 */
public interface tomlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tomlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(tomlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(tomlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tomlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tomlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(tomlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(tomlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(tomlParser.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(tomlParser.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(tomlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(tomlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#simple_key}.
	 * @param ctx the parse tree
	 */
	void enterSimple_key(tomlParser.Simple_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#simple_key}.
	 * @param ctx the parse tree
	 */
	void exitSimple_key(tomlParser.Simple_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#unquoted_key}.
	 * @param ctx the parse tree
	 */
	void enterUnquoted_key(tomlParser.Unquoted_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#unquoted_key}.
	 * @param ctx the parse tree
	 */
	void exitUnquoted_key(tomlParser.Unquoted_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#quoted_key}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_key(tomlParser.Quoted_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#quoted_key}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_key(tomlParser.Quoted_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#dotted_key}.
	 * @param ctx the parse tree
	 */
	void enterDotted_key(tomlParser.Dotted_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#dotted_key}.
	 * @param ctx the parse tree
	 */
	void exitDotted_key(tomlParser.Dotted_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(tomlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(tomlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(tomlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(tomlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(tomlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(tomlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#floating_point}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point(tomlParser.Floating_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#floating_point}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point(tomlParser.Floating_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(tomlParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(tomlParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(tomlParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(tomlParser.Date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(tomlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(tomlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#array_values}.
	 * @param ctx the parse tree
	 */
	void enterArray_values(tomlParser.Array_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#array_values}.
	 * @param ctx the parse tree
	 */
	void exitArray_values(tomlParser.Array_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#comment_or_nl}.
	 * @param ctx the parse tree
	 */
	void enterComment_or_nl(tomlParser.Comment_or_nlContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#comment_or_nl}.
	 * @param ctx the parse tree
	 */
	void exitComment_or_nl(tomlParser.Comment_or_nlContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(tomlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(tomlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#standard_table}.
	 * @param ctx the parse tree
	 */
	void enterStandard_table(tomlParser.Standard_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#standard_table}.
	 * @param ctx the parse tree
	 */
	void exitStandard_table(tomlParser.Standard_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#inline_table}.
	 * @param ctx the parse tree
	 */
	void enterInline_table(tomlParser.Inline_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#inline_table}.
	 * @param ctx the parse tree
	 */
	void exitInline_table(tomlParser.Inline_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#inline_table_keyvals}.
	 * @param ctx the parse tree
	 */
	void enterInline_table_keyvals(tomlParser.Inline_table_keyvalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#inline_table_keyvals}.
	 * @param ctx the parse tree
	 */
	void exitInline_table_keyvals(tomlParser.Inline_table_keyvalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#inline_table_keyvals_non_empty}.
	 * @param ctx the parse tree
	 */
	void enterInline_table_keyvals_non_empty(tomlParser.Inline_table_keyvals_non_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#inline_table_keyvals_non_empty}.
	 * @param ctx the parse tree
	 */
	void exitInline_table_keyvals_non_empty(tomlParser.Inline_table_keyvals_non_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tomlParser#array_table}.
	 * @param ctx the parse tree
	 */
	void enterArray_table(tomlParser.Array_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tomlParser#array_table}.
	 * @param ctx the parse tree
	 */
	void exitArray_table(tomlParser.Array_tableContext ctx);
}