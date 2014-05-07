// Generated from C:/Veebirakendused/New folder/Pizza/grammar\Pizza.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PizzaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PizzaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PizzaParser#pizza1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza1(@NotNull PizzaParser.Pizza1Context ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#showw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShoww(@NotNull PizzaParser.ShowwContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#addi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi(@NotNull PizzaParser.AddiContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#pizza2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza2(@NotNull PizzaParser.Pizza2Context ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#addp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddp(@NotNull PizzaParser.AddpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#pizza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza(@NotNull PizzaParser.PizzaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#showm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowm(@NotNull PizzaParser.ShowmContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#setName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetName(@NotNull PizzaParser.SetNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull PizzaParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#createIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIn(@NotNull PizzaParser.CreateInContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#createM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateM(@NotNull PizzaParser.CreateMContext ctx);
}