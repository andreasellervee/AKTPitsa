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
	 * Visit a parse tree produced by {@link PizzaParser#pizza2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza2(@NotNull PizzaParser.Pizza2Context ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaKoostisega}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaKoostisega(@NotNull PizzaParser.NaitaKoostisegaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#LisaKoostis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisaKoostis(@NotNull PizzaParser.LisaKoostisContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#LisaKoostisListi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisaKoostisListi(@NotNull PizzaParser.LisaKoostisListiContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#Loomenuu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoomenuu(@NotNull PizzaParser.LoomenuuContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#LooKoostis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLooKoostis(@NotNull PizzaParser.LooKoostisContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(@NotNull PizzaParser.ShowContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaMenuu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaMenuu(@NotNull PizzaParser.NaitaMenuuContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaKoostiseta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaKoostiseta(@NotNull PizzaParser.NaitaKoostisetaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#MenuuNimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuuNimi(@NotNull PizzaParser.MenuuNimiContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaTuubita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaTuubita(@NotNull PizzaParser.NaitaTuubitaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#pizza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza(@NotNull PizzaParser.PizzaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaTuubiga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaTuubiga(@NotNull PizzaParser.NaitaTuubigaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PizzaParser#LisaPitsa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisaPitsa(@NotNull PizzaParser.LisaPitsaContext ctx);
}