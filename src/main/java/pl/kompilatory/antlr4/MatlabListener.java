// Generated from E:/Git/MatlabToJavaCompiler/src/main/java/pl/kompilatory/antlr4\Matlab.g4 by ANTLR 4.8
package pl.kompilatory.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatlabParser}.
 */
public interface MatlabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatlabParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MatlabParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MatlabParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#empty_array}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_array(MatlabParser.Empty_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#empty_array}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_array(MatlabParser.Empty_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#empty_cell}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_cell(MatlabParser.Empty_cellContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#empty_cell}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_cell(MatlabParser.Empty_cellContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(MatlabParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(MatlabParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#floa}.
	 * @param ctx the parse tree
	 */
	void enterFloa(MatlabParser.FloaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#floa}.
	 * @param ctx the parse tree
	 */
	void exitFloa(MatlabParser.FloaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MatlabParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MatlabParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MatlabParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MatlabParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MatlabParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MatlabParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#def_function}.
	 * @param ctx the parse tree
	 */
	void enterDef_function(MatlabParser.Def_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#def_function}.
	 * @param ctx the parse tree
	 */
	void exitDef_function(MatlabParser.Def_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(MatlabParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(MatlabParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#function_returns}.
	 * @param ctx the parse tree
	 */
	void enterFunction_returns(MatlabParser.Function_returnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#function_returns}.
	 * @param ctx the parse tree
	 */
	void exitFunction_returns(MatlabParser.Function_returnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement_assign}.
	 * @param ctx the parse tree
	 */
	void enterStatement_assign(MatlabParser.Statement_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement_assign}.
	 * @param ctx the parse tree
	 */
	void exitStatement_assign(MatlabParser.Statement_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement_if}.
	 * @param ctx the parse tree
	 */
	void enterStatement_if(MatlabParser.Statement_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement_if}.
	 * @param ctx the parse tree
	 */
	void exitStatement_if(MatlabParser.Statement_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement_switch}.
	 * @param ctx the parse tree
	 */
	void enterStatement_switch(MatlabParser.Statement_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement_switch}.
	 * @param ctx the parse tree
	 */
	void exitStatement_switch(MatlabParser.Statement_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement_for}.
	 * @param ctx the parse tree
	 */
	void enterStatement_for(MatlabParser.Statement_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement_for}.
	 * @param ctx the parse tree
	 */
	void exitStatement_for(MatlabParser.Statement_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement_while}.
	 * @param ctx the parse tree
	 */
	void enterStatement_while(MatlabParser.Statement_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement_while}.
	 * @param ctx the parse tree
	 */
	void exitStatement_while(MatlabParser.Statement_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MatlabParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MatlabParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#semi_colon_operator}.
	 * @param ctx the parse tree
	 */
	void enterSemi_colon_operator(MatlabParser.Semi_colon_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#semi_colon_operator}.
	 * @param ctx the parse tree
	 */
	void exitSemi_colon_operator(MatlabParser.Semi_colon_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MatlabParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MatlabParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MatlabParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MatlabParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MatlabParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MatlabParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(MatlabParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(MatlabParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(MatlabParser.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(MatlabParser.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(MatlabParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(MatlabParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(MatlabParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(MatlabParser.Logic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatlabParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(MatlabParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatlabParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(MatlabParser.Relational_operatorContext ctx);
}