// Generated from E:/Git/MatlabToJavaCompiler/src/main/java/pl/kompilatory/antlr4\Matlab.g4 by ANTLR 4.8
package pl.kompilatory.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatlabParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatlabVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MatlabParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MatlabParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MatlabParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MatlabParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#def_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function(MatlabParser.Def_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(MatlabParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#function_returns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_returns(MatlabParser.Function_returnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MatlabParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_assign(MatlabParser.Statement_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(MatlabParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operator(MatlabParser.Math_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expression(MatlabParser.Logic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#logic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator(MatlabParser.Logic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(MatlabParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MatlabParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#semi_colon_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi_colon_operator(MatlabParser.Semi_colon_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MatlabParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_if(MatlabParser.Statement_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_switch(MatlabParser.Statement_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_while(MatlabParser.Statement_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#statement_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_for(MatlabParser.Statement_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#colon_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_expression(MatlabParser.Colon_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_expression(MatlabParser.Parenthesis_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(MatlabParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatlabParser#logic_negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_negation(MatlabParser.Logic_negationContext ctx);
}