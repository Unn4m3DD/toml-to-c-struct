// Generated from /home/andre/IdeaProjects/toml-to-c-struct/src/toml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tomlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tomlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tomlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(tomlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(tomlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(tomlParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(tomlParser.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(tomlParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#simple_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_key(tomlParser.Simple_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#unquoted_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquoted_key(tomlParser.Unquoted_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#quoted_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_key(tomlParser.Quoted_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#dotted_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_key(tomlParser.Dotted_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(tomlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(tomlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(tomlParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#floating_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point(tomlParser.Floating_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(tomlParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time(tomlParser.Date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(tomlParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#array_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_values(tomlParser.Array_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#comment_or_nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_or_nl(tomlParser.Comment_or_nlContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(tomlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#standard_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_table(tomlParser.Standard_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#inline_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_table(tomlParser.Inline_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#inline_table_keyvals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_table_keyvals(tomlParser.Inline_table_keyvalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#inline_table_keyvals_non_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_table_keyvals_non_empty(tomlParser.Inline_table_keyvals_non_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tomlParser#array_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_table(tomlParser.Array_tableContext ctx);
}