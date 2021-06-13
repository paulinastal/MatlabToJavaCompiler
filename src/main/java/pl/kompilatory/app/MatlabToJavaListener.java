package pl.kompilatory.app;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import pl.kompilatory.antlr4.MatlabBaseListener;
import pl.kompilatory.antlr4.MatlabParser;
import pl.kompilatory.app.JavaCodeCreator;
import pl.kompilatory.app.Log;

import java.util.ArrayList;
import java.util.List;


public class MatlabToJavaListener extends MatlabBaseListener {
    private String matlabFileName;
    private String javaFolderPath;

    private List<String> logList = new ArrayList<>();
    private JavaCodeCreator javaCodeCreator = new JavaCodeCreator();

    public MatlabToJavaListener(String matlabFileName, String javaFolderPath) {
        this.matlabFileName = matlabFileName;
        this.javaFolderPath = javaFolderPath;
    }

    @Override
    public void enterProgram(MatlabParser.ProgramContext ctx) {
        logList.add(Log.PROGRAM_START.getName());
    }

    @Override
    public void exitProgram(MatlabParser.ProgramContext ctx) {
        logList.add(Log.PROGRAM_STOP.getName());
        javaCodeCreator.setMatlabFileName(matlabFileName);
        javaCodeCreator.setJavaFolderPath(javaFolderPath);
        javaCodeCreator.setLogList(logList);
        javaCodeCreator.transformIntermediate();
        javaCodeCreator.createFile();
    }

    @Override
    public void enterBool(MatlabParser.BoolContext ctx) {
        super.enterBool(ctx);
    }

    @Override
    public void exitBool(MatlabParser.BoolContext ctx) {
        super.exitBool(ctx);

    }

    @Override
    public void enterEmpty_array(MatlabParser.Empty_arrayContext ctx) {
        super.enterEmpty_array(ctx);
    }

    @Override
    public void exitEmpty_array(MatlabParser.Empty_arrayContext ctx) {
        super.exitEmpty_array(ctx);
    }

    @Override
    public void enterEmpty_cell(MatlabParser.Empty_cellContext ctx) {
        super.enterEmpty_cell(ctx);
    }

    @Override
    public void exitEmpty_cell(MatlabParser.Empty_cellContext ctx) {
        super.exitEmpty_cell(ctx);
    }

    @Override
    public void enterEnd(MatlabParser.EndContext ctx) {
        super.enterEnd(ctx);
    }

    @Override
    public void exitEnd(MatlabParser.EndContext ctx) {
        super.exitEnd(ctx);
    }

    @Override
    public void enterFloa(MatlabParser.FloaContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitFloa(MatlabParser.FloaContext ctx) {
        super.exitFloa(ctx);
    }

    @Override
    public void enterInteger(MatlabParser.IntegerContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitInteger(MatlabParser.IntegerContext ctx) {
        super.exitInteger(ctx);
    }

    @Override
    public void enterVar(MatlabParser.VarContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitVar(MatlabParser.VarContext ctx) {
        super.exitVar(ctx);
    }

    @Override
    public void enterDef_function(MatlabParser.Def_functionContext ctx) {
        logList.add(Log.FUNCTION_DEF_START.getName());
    }

    @Override
    public void exitDef_function(MatlabParser.Def_functionContext ctx) {
        logList.add(Log.FUNCTION_DEF_STOP.getName());
    }

    @Override
    public void enterFunction_params(MatlabParser.Function_paramsContext ctx) {
        super.enterFunction_params(ctx);
    }

    @Override
    public void exitFunction_params(MatlabParser.Function_paramsContext ctx) {
        super.exitFunction_params(ctx);
    }

    @Override
    public void enterFunction_returns(MatlabParser.Function_returnsContext ctx) {
        super.enterFunction_returns(ctx);
    }

    @Override
    public void exitFunction_returns(MatlabParser.Function_returnsContext ctx) {
        super.exitFunction_returns(ctx);
    }

    @Override
    public void enterStatement_assign(MatlabParser.Statement_assignContext ctx) {
        logList.add(Log.ASSIGN_START.getName());
    }

    @Override
    public void exitStatement_assign(MatlabParser.Statement_assignContext ctx) {
        logList.add(Log.ASSIGN_STOP.getName());
    }

    @Override
    public void enterStatement_if(MatlabParser.Statement_ifContext ctx) {
        logList.add(Log.IF_START.getName());
    }

    @Override
    public void exitStatement_if(MatlabParser.Statement_ifContext ctx) {
        logList.add(Log.IF_STOP.getName());
    }

    @Override
    public void enterStatement_switch(MatlabParser.Statement_switchContext ctx) {
        logList.add(Log.SWITCH_START.getName());
    }

    @Override
    public void exitStatement_switch(MatlabParser.Statement_switchContext ctx) {
        logList.add(Log.SWITCH_STOP.getName());
    }

    @Override
    public void enterStatement_for(MatlabParser.Statement_forContext ctx) {
        logList.add(Log.FOR_START.getName());
    }

    @Override
    public void exitStatement_for(MatlabParser.Statement_forContext ctx) {
        logList.add(Log.FOR_STOP.getName());
    }

    @Override
    public void enterStatement_while(MatlabParser.Statement_whileContext ctx) {
        logList.add(Log.WHILE_START.getName());
    }

    @Override
    public void exitStatement_while(MatlabParser.Statement_whileContext ctx) {
        logList.add(Log.WHILE_STOP.getName());
    }

    @Override
    public void enterArray(MatlabParser.ArrayContext ctx) {
        logList.add(Log.ARRAY_START.getName());
    }

    @Override
    public void exitArray(MatlabParser.ArrayContext ctx) {
        logList.add(Log.ARRAY_STOP.getName());
    }

    @Override
    public void enterFunction(MatlabParser.FunctionContext ctx) {
        logList.add(Log.FUNCTION_START.getName());
    }

    @Override
    public void exitFunction(MatlabParser.FunctionContext ctx) {
        logList.add(Log.FUNCTION_STOP.getName());
    }

    @Override
    public void enterStatement(MatlabParser.StatementContext ctx) {
        logList.add(Log.STATEMENT_START.getName());
    }

    @Override
    public void exitStatement(MatlabParser.StatementContext ctx) {
        logList.add(Log.STATEMENT_STOP.getName());
    }

    @Override
    public void enterExpression(MatlabParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(MatlabParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterLogic_expression(MatlabParser.Logic_expressionContext ctx) {
        logList.add(Log.LOGIC_EXPRESSION_START.getName());
    }

    @Override
    public void exitLogic_expression(MatlabParser.Logic_expressionContext ctx) {
        logList.add(Log.LOGIC_EXPRESSION_STOP.getName());
    }

    @Override
    public void enterLogic_operator(MatlabParser.Logic_operatorContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitLogic_operator(MatlabParser.Logic_operatorContext ctx) {
        super.exitLogic_operator(ctx);
    }

    @Override
    public void enterRelational_operator(MatlabParser.Relational_operatorContext ctx) {
        if (ctx.getText().equals("~=")) {
            logList.add("!=");
        } else {
            logList.add(ctx.getText());
        }
    }

    @Override
    public void exitRelational_operator(MatlabParser.Relational_operatorContext ctx) {
        super.exitRelational_operator(ctx);
    }

    @Override
    public void enterMath_operator(MatlabParser.Math_operatorContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitMath_operator(MatlabParser.Math_operatorContext ctx) {
        super.exitMath_operator(ctx);
    }

    @Override
    public void enterParenthesis_expression(MatlabParser.Parenthesis_expressionContext ctx) {
        logList.add(Log.PARENTHESIS_EXPRESSION_START.getName());
    }

    @Override
    public void exitParenthesis_expression(MatlabParser.Parenthesis_expressionContext ctx) {
        logList.add(Log.PARENTHESIS_EXPRESSION_STOP.getName());
    }

    @Override
    public void enterSemi_colon_operator(MatlabParser.Semi_colon_operatorContext ctx) {
        logList.add(ctx.getText());
    }

    @Override
    public void exitSemi_colon_operator(MatlabParser.Semi_colon_operatorContext ctx) {
        super.exitSemi_colon_operator(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
