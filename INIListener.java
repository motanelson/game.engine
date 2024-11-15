// Generated from INI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link INIParser}.
 */
public interface INIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link INIParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(INIParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link INIParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(INIParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link INIParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(INIParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link INIParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(INIParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link INIParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(INIParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link INIParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(INIParser.PairContext ctx);
}