// Generated from C:/Users/Andreas/Documents/kool/automaadid translaatorid/Projekt/grammar\Pizza.g4 by ANTLR 4.x
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
	 * Visit a parse tree produced by {@link PizzaParser#LisaKoostis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisaKoostis(@NotNull PizzaParser.LisaKoostisContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaParser#NaitaKoostisega}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaitaKoostisega(@NotNull PizzaParser.NaitaKoostisegaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PizzaParser#Pizza2R}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizza2R(@NotNull PizzaParser.Pizza2RContext ctx);
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
	 * Visit a parse tree produced by {@link PizzaParser#PizzaR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizzaR(@NotNull PizzaParser.PizzaRContext ctx);
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