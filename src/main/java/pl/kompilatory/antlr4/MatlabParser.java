// Generated from E:/Git/MatlabToJavaCompiler/src/main/java/pl/kompilatory/antlr4\Matlab.g4 by ANTLR 4.8
package pl.kompilatory.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatlabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, WS=2, PLUS=3, MINUS=4, DIVIDE=5, MULTIPLY=6, POWER=7, ELEMENT_WISE_MULTIPLY=8, 
		ELEMENT_WISE_DIVIDE=9, ELEMENT_WISE_POWER=10, GLOBAL=11, IF=12, ELSE=13, 
		ELSEIF=14, END=15, WHILE=16, FOR=17, SWITCH=18, OTHERWISE=19, CASE=20, 
		FUNCTION=21, RETURN=22, ASSIGN=23, DOT=24, COMMA=25, COLON=26, SEMI_COLON=27, 
		LEFT_PARENTHESIS=28, RIGHT_PARENTHESIS=29, LEFT_BRACE=30, RIGHT_BRACE=31, 
		LEFT_SQUARE_BRACKET=32, RIGHT_SQUARE_BRACKET=33, TRUE=34, FALSE=35, ID=36, 
		AND=37, OR=38, NOT=39, EQUAL=40, NOT_EQUAL=41, GREATER_THAN=42, GREATER_OR_EQUAL=43, 
		LESS_THAN=44, LESS_OR_EQUAL=45, INT=46, FLOAT=47;
	public static final int
		RULE_bool = 0, RULE_variable = 1, RULE_program = 2, RULE_def_function = 3, 
		RULE_function_params = 4, RULE_function_returns = 5, RULE_statement = 6, 
		RULE_statement_assign = 7, RULE_math_expression = 8, RULE_math_operator = 9, 
		RULE_logic_expression = 10, RULE_logic_operator = 11, RULE_relational_operator = 12, 
		RULE_array = 13, RULE_semi_colon_operator = 14, RULE_function = 15, RULE_statement_if = 16, 
		RULE_statement_switch = 17, RULE_statement_while = 18, RULE_statement_for = 19, 
		RULE_colon_expression = 20, RULE_parenthesis_expression = 21, RULE_negation = 22, 
		RULE_logic_negation = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"bool", "variable", "program", "def_function", "function_params", "function_returns", 
			"statement", "statement_assign", "math_expression", "math_operator", 
			"logic_expression", "logic_operator", "relational_operator", "array", 
			"semi_colon_operator", "function", "statement_if", "statement_switch", 
			"statement_while", "statement_for", "colon_expression", "parenthesis_expression", 
			"negation", "logic_negation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'/'", "'*'", "'^'", "'.*'", "'./'", 
			"'.^'", "'global'", "'if'", "'else'", "'elseif'", "'end'", "'while'", 
			"'for'", "'switch'", "'otherwise'", "'case'", "'function'", "'return'", 
			"'='", "'.'", "','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'true'", "'false'", null, "'&&'", "'||'", "'~'", "'=='", "'~='", 
			"'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "FUNCTION", 
			"RETURN", "ASSIGN", "DOT", "COMMA", "COLON", "SEMI_COLON", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "TRUE", "FALSE", "ID", "AND", "OR", "NOT", "EQUAL", 
			"NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", 
			"INT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Matlab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatlabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MatlabParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MatlabParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public TerminalNode INT() { return getToken(MatlabParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MatlabParser.FLOAT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Def_functionContext> def_function() {
			return getRuleContexts(Def_functionContext.class);
		}
		public Def_functionContext def_function(int i) {
			return getRuleContext(Def_functionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << FUNCTION) | (1L << ID))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case FOR:
				case SWITCH:
				case ID:
					{
					setState(52);
					statement();
					}
					break;
				case FUNCTION:
					{
					setState(53);
					def_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MatlabParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public Function_returnsContext function_returns() {
			return getRuleContext(Function_returnsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterDef_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitDef_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitDef_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FUNCTION);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				function_returns();
				setState(61);
				match(ASSIGN);
				}
				break;
			}
			setState(65);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PARENTHESIS) {
				{
				setState(66);
				function_params();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatlabParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatlabParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> ID() { return getTokens(MatlabParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MatlabParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatlabParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatlabParser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitFunction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitFunction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LEFT_PARENTHESIS);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				match(ID);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					match(ID);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(88);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_returnsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MatlabParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MatlabParser.ID, i);
		}
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatlabParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatlabParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MatlabParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatlabParser.COMMA, i);
		}
		public Function_returnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_returns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterFunction_returns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitFunction_returns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitFunction_returns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnsContext function_returns() throws RecognitionException {
		Function_returnsContext _localctx = new Function_returnsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_returns);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				}
				break;
			case LEFT_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(LEFT_SQUARE_BRACKET);
				setState(92);
				match(ID);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					match(ID);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement_assignContext statement_assign() {
			return getRuleContext(Statement_assignContext.class,0);
		}
		public Statement_ifContext statement_if() {
			return getRuleContext(Statement_ifContext.class,0);
		}
		public Statement_forContext statement_for() {
			return getRuleContext(Statement_forContext.class,0);
		}
		public Statement_whileContext statement_while() {
			return getRuleContext(Statement_whileContext.class,0);
		}
		public Statement_switchContext statement_switch() {
			return getRuleContext(Statement_switchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MatlabParser.COMMA, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MatlabParser.SEMI_COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				statement_assign();
				}
				break;
			case 2:
				{
				setState(104);
				statement_if();
				}
				break;
			case 3:
				{
				setState(105);
				statement_for();
				}
				break;
			case 4:
				{
				setState(106);
				statement_while();
				}
				break;
			case 5:
				{
				setState(107);
				statement_switch();
				}
				break;
			case 6:
				{
				setState(108);
				function();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMI_COLON) {
				{
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public Statement_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_assignContext statement_assign() throws RecognitionException {
		Statement_assignContext _localctx = new Statement_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(ASSIGN);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(116);
				variable();
				}
				break;
			case 2:
				{
				setState(117);
				negation();
				}
				break;
			case 3:
				{
				setState(118);
				math_expression();
				}
				break;
			case 4:
				{
				setState(119);
				logic_expression(0);
				}
				break;
			case 5:
				{
				setState(120);
				array();
				}
				break;
			case 6:
				{
				setState(121);
				function();
				}
				break;
			case 7:
				{
				setState(122);
				parenthesis_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expressionContext extends ParserRuleContext {
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<Parenthesis_expressionContext> parenthesis_expression() {
			return getRuleContexts(Parenthesis_expressionContext.class);
		}
		public Parenthesis_expressionContext parenthesis_expression(int i) {
			return getRuleContext(Parenthesis_expressionContext.class,i);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_math_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
				{
				setState(125);
				variable();
				}
				break;
			case MINUS:
				{
				setState(126);
				negation();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				{
				setState(127);
				array();
				}
				break;
			case LEFT_PARENTHESIS:
				{
				setState(128);
				parenthesis_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			math_operator();
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(132);
				variable();
				}
				break;
			case 2:
				{
				setState(133);
				negation();
				}
				break;
			case 3:
				{
				setState(134);
				array();
				}
				break;
			case 4:
				{
				setState(135);
				parenthesis_expression();
				}
				break;
			case 5:
				{
				setState(136);
				math_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MatlabParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MatlabParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(MatlabParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MatlabParser.DIVIDE, 0); }
		public TerminalNode POWER() { return getToken(MatlabParser.POWER, 0); }
		public TerminalNode ELEMENT_WISE_MULTIPLY() { return getToken(MatlabParser.ELEMENT_WISE_MULTIPLY, 0); }
		public TerminalNode ELEMENT_WISE_DIVIDE() { return getToken(MatlabParser.ELEMENT_WISE_DIVIDE, 0); }
		public TerminalNode ELEMENT_WISE_POWER() { return getToken(MatlabParser.ELEMENT_WISE_POWER, 0); }
		public Math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterMath_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitMath_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitMath_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operatorContext math_operator() throws RecognitionException {
		Math_operatorContext _localctx = new Math_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIVIDE) | (1L << MULTIPLY) | (1L << POWER) | (1L << ELEMENT_WISE_MULTIPLY) | (1L << ELEMENT_WISE_DIVIDE) | (1L << ELEMENT_WISE_POWER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Logic_negationContext logic_negation() {
			return getRuleContext(Logic_negationContext.class,0);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterLogic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitLogic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitLogic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		return logic_expression(0);
	}

	private Logic_expressionContext logic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, _parentState);
		Logic_expressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(142);
				bool();
				}
				break;
			case ID:
			case INT:
			case FLOAT:
				{
				setState(143);
				variable();
				setState(144);
				relational_operator();
				setState(145);
				variable();
				}
				break;
			case NOT:
				{
				setState(147);
				logic_negation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					logic_operator();
					setState(152);
					logic_expression(3);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MatlabParser.AND, 0); }
		public TerminalNode OR() { return getToken(MatlabParser.OR, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitLogic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MatlabParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MatlabParser.NOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(MatlabParser.LESS_THAN, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(MatlabParser.LESS_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MatlabParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(MatlabParser.GREATER_OR_EQUAL, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_OR_EQUAL) | (1L << LESS_THAN) | (1L << LESS_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatlabParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatlabParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatlabParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatlabParser.COMMA, i);
		}
		public List<Semi_colon_operatorContext> semi_colon_operator() {
			return getRuleContexts(Semi_colon_operatorContext.class);
		}
		public Semi_colon_operatorContext semi_colon_operator(int i) {
			return getRuleContext(Semi_colon_operatorContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(LEFT_SQUARE_BRACKET);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(164);
					variable();
					}
					break;
				case 2:
					{
					setState(165);
					logic_expression(0);
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(168);
						match(COMMA);
						}
					}

					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(171);
						variable();
						}
						break;
					case 2:
						{
						setState(172);
						logic_expression(0);
						}
						break;
					}
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(LEFT_SQUARE_BRACKET);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(183);
					variable();
					}
					break;
				case 2:
					{
					setState(184);
					logic_expression(0);
					}
					break;
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(187);
						match(COMMA);
						}
					}

					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(190);
						variable();
						}
						break;
					case 2:
						{
						setState(191);
						logic_expression(0);
						}
						break;
					}
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON) {
					{
					{
					setState(199);
					semi_colon_operator();
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(200);
						variable();
						}
						break;
					case 2:
						{
						setState(201);
						logic_expression(0);
						}
						break;
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
						{
						{
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(204);
							match(COMMA);
							}
						}

						setState(209);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(207);
							variable();
							}
							break;
						case 2:
							{
							setState(208);
							logic_expression(0);
							}
							break;
						}
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semi_colon_operatorContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(MatlabParser.SEMI_COLON, 0); }
		public Semi_colon_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_colon_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterSemi_colon_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitSemi_colon_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitSemi_colon_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semi_colon_operatorContext semi_colon_operator() throws RecognitionException {
		Semi_colon_operatorContext _localctx = new Semi_colon_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_semi_colon_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatlabParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatlabParser.RIGHT_PARENTHESIS, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatlabParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatlabParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(LEFT_PARENTHESIS);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case INT:
				case FLOAT:
					{
					setState(229);
					variable();
					}
					break;
				case MINUS:
					{
					setState(230);
					negation();
					}
					break;
				case LEFT_SQUARE_BRACKET:
					{
					setState(231);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case INT:
					case FLOAT:
						{
						setState(235);
						variable();
						}
						break;
					case MINUS:
						{
						setState(236);
						negation();
						}
						break;
					case LEFT_SQUARE_BRACKET:
						{
						setState(237);
						array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(247);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MatlabParser.IF, 0); }
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatlabParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatlabParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(MatlabParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(MatlabParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(MatlabParser.ELSE, 0); }
		public Statement_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_ifContext statement_if() throws RecognitionException {
		Statement_ifContext _localctx = new Statement_ifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			match(IF);
			{
			setState(250);
			logic_expression(0);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(251);
				match(COMMA);
				}
			}

			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(254);
				statement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(260);
				match(ELSEIF);
				{
				setState(261);
				logic_expression(0);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(262);
					match(COMMA);
					}
				}

				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
					{
					{
					setState(265);
					statement();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(276);
				match(ELSE);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
					{
					{
					setState(277);
					statement();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(END);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_switchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(MatlabParser.SWITCH, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public List<TerminalNode> CASE() { return getTokens(MatlabParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(MatlabParser.CASE, i);
		}
		public TerminalNode OTHERWISE() { return getToken(MatlabParser.OTHERWISE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_switchContext statement_switch() throws RecognitionException {
		Statement_switchContext _localctx = new Statement_switchContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(SWITCH);
			setState(288);
			variable();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(289);
				match(CASE);
				setState(290);
				variable();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
					{
					{
					setState(291);
					statement();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(302);
				match(OTHERWISE);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
					{
					{
					setState(303);
					statement();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MatlabParser.WHILE, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public TerminalNode COMMA() { return getToken(MatlabParser.COMMA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_whileContext statement_while() throws RecognitionException {
		Statement_whileContext _localctx = new Statement_whileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHILE);
			setState(314);
			logic_expression(0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(315);
				match(COMMA);
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(318);
				statement();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MatlabParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public Colon_expressionContext colon_expression() {
			return getRuleContext(Colon_expressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MatlabParser.COMMA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterStatement_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitStatement_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitStatement_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_forContext statement_for() throws RecognitionException {
		Statement_forContext _localctx = new Statement_forContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FOR);
			setState(327);
			match(ID);
			setState(328);
			match(ASSIGN);
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case FLOAT:
				{
				setState(329);
				colon_expression();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				{
				setState(330);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(333);
				match(COMMA);
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(336);
				statement();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colon_expressionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MatlabParser.COLON, 0); }
		public Colon_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterColon_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitColon_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitColon_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colon_expressionContext colon_expression() throws RecognitionException {
		Colon_expressionContext _localctx = new Colon_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_colon_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			variable();
			setState(345);
			match(COLON);
			setState(346);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatlabParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatlabParser.RIGHT_PARENTHESIS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitParenthesis_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitParenthesis_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LEFT_PARENTHESIS);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(349);
				variable();
				}
				break;
			case 2:
				{
				setState(350);
				negation();
				}
				break;
			case 3:
				{
				setState(351);
				math_expression();
				}
				break;
			case 4:
				{
				setState(352);
				array();
				}
				break;
			}
			setState(355);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(MatlabParser.MINUS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(MINUS);
			setState(358);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_negationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MatlabParser.NOT, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Logic_negationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterLogic_negation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitLogic_negation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitLogic_negation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_negationContext logic_negation() throws RecognitionException {
		Logic_negationContext _localctx = new Logic_negationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(NOT);
			setState(361);
			logic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u016e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\5\5\5B"+
		"\n\5\3\5\3\5\5\5F\n\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\7\6T\n\6\f\6\16\6W\13\6\5\6Y\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"b\n\7\f\7\16\7e\13\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b"+
		"\5\bs\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n"+
		"\5\n\u0084\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\7\f\u009d\n\f\f\f\16"+
		"\f\u00a0\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u00a9\n\17\3\17\5"+
		"\17\u00ac\n\17\3\17\3\17\5\17\u00b0\n\17\7\17\u00b2\n\17\f\17\16\17\u00b5"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17\3\17\5\17\u00bf\n\17\3"+
		"\17\3\17\5\17\u00c3\n\17\7\17\u00c5\n\17\f\17\16\17\u00c8\13\17\3\17\3"+
		"\17\3\17\5\17\u00cd\n\17\3\17\5\17\u00d0\n\17\3\17\3\17\5\17\u00d4\n\17"+
		"\7\17\u00d6\n\17\f\17\16\17\u00d9\13\17\7\17\u00db\n\17\f\17\16\17\u00de"+
		"\13\17\3\17\3\17\5\17\u00e2\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00eb\n\21\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\7\21\u00f3\n\21\f\21"+
		"\16\21\u00f6\13\21\5\21\u00f8\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ff"+
		"\n\22\3\22\7\22\u0102\n\22\f\22\16\22\u0105\13\22\3\22\3\22\3\22\5\22"+
		"\u010a\n\22\3\22\7\22\u010d\n\22\f\22\16\22\u0110\13\22\7\22\u0112\n\22"+
		"\f\22\16\22\u0115\13\22\3\22\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13"+
		"\22\5\22\u011e\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0127\n\23"+
		"\f\23\16\23\u012a\13\23\7\23\u012c\n\23\f\23\16\23\u012f\13\23\3\23\3"+
		"\23\7\23\u0133\n\23\f\23\16\23\u0136\13\23\5\23\u0138\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\5\24\u013f\n\24\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u014e\n\25\3\25\5\25\u0151"+
		"\n\25\3\25\7\25\u0154\n\25\f\25\16\25\u0157\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0164\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\2\3\26\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\b\3\2$%\4\2&&\60\61\4\2\33\33\35\35\3\2\5\f\3\2\'(\3"+
		"\2*/\2\u019b\2\62\3\2\2\2\4\64\3\2\2\2\6:\3\2\2\2\b=\3\2\2\2\nO\3\2\2"+
		"\2\fg\3\2\2\2\16o\3\2\2\2\20t\3\2\2\2\22\u0083\3\2\2\2\24\u008d\3\2\2"+
		"\2\26\u0096\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00e1\3\2\2\2"+
		"\36\u00e3\3\2\2\2 \u00e5\3\2\2\2\"\u00fb\3\2\2\2$\u0121\3\2\2\2&\u013b"+
		"\3\2\2\2(\u0148\3\2\2\2*\u015a\3\2\2\2,\u015e\3\2\2\2.\u0167\3\2\2\2\60"+
		"\u016a\3\2\2\2\62\63\t\2\2\2\63\3\3\2\2\2\64\65\t\3\2\2\65\5\3\2\2\2\66"+
		"9\5\16\b\2\679\5\b\5\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;\7\3\2\2\2<:\3\2\2\2=A\7\27\2\2>?\5\f\7\2?@\7\31\2\2@B\3\2\2\2"+
		"A>\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7&\2\2DF\5\n\6\2ED\3\2\2\2EF\3\2\2\2"+
		"FJ\3\2\2\2GI\5\16\b\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2"+
		"\2LJ\3\2\2\2MN\7\21\2\2N\t\3\2\2\2OX\7\36\2\2PU\7&\2\2QR\7\33\2\2RT\7"+
		"&\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XP\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\37\2\2[\13\3\2\2\2\\h\7&\2\2]^\7\"\2\2"+
		"^c\7&\2\2_`\7\33\2\2`b\7&\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2"+
		"df\3\2\2\2ec\3\2\2\2fh\7#\2\2g\\\3\2\2\2g]\3\2\2\2h\r\3\2\2\2ip\5\20\t"+
		"\2jp\5\"\22\2kp\5(\25\2lp\5&\24\2mp\5$\23\2np\5 \21\2oi\3\2\2\2oj\3\2"+
		"\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs\t\4\2\2rq\3\2"+
		"\2\2rs\3\2\2\2s\17\3\2\2\2tu\7&\2\2u}\7\31\2\2v~\5\4\3\2w~\5.\30\2x~\5"+
		"\22\n\2y~\5\26\f\2z~\5\34\17\2{~\5 \21\2|~\5,\27\2}v\3\2\2\2}w\3\2\2\2"+
		"}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0084"+
		"\5\4\3\2\u0080\u0084\5.\30\2\u0081\u0084\5\34\17\2\u0082\u0084\5,\27\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\5\24\13\2\u0086\u008c\5\4\3\2"+
		"\u0087\u008c\5.\30\2\u0088\u008c\5\34\17\2\u0089\u008c\5,\27\2\u008a\u008c"+
		"\5\22\n\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\23\3\2\2\2\u008d\u008e"+
		"\t\5\2\2\u008e\25\3\2\2\2\u008f\u0090\b\f\1\2\u0090\u0097\5\2\2\2\u0091"+
		"\u0092\5\4\3\2\u0092\u0093\5\32\16\2\u0093\u0094\5\4\3\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0097\5\60\31\2\u0096\u008f\3\2\2\2\u0096\u0091\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u0099\f\4\2\2\u0099\u009a\5\30"+
		"\r\2\u009a\u009b\5\26\f\5\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2\31\3\2\2\2\u00a3\u00a4"+
		"\t\7\2\2\u00a4\33\3\2\2\2\u00a5\u00a8\7\"\2\2\u00a6\u00a9\5\4\3\2\u00a7"+
		"\u00a9\5\26\f\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00b3\3"+
		"\2\2\2\u00aa\u00ac\7\33\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00b0\5\4\3\2\u00ae\u00b0\5\26\f\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00e2\3\2\2\2\u00b8"+
		"\u00bb\7\"\2\2\u00b9\u00bc\5\4\3\2\u00ba\u00bc\5\26\f\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00c6\3\2\2\2\u00bd\u00bf\7\33\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c3\5\4"+
		"\3\2\u00c1\u00c3\5\26\f\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00dc\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\5\36\20\2\u00ca\u00cd\5\4\3\2\u00cb\u00cd\5\26\f\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00d0\7\33\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d4"+
		"\5\4\3\2\u00d2\u00d4\5\26\f\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2"+
		"\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00c9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7#\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00a5\3\2\2\2\u00e1\u00b8\3\2\2\2\u00e2\35\3\2\2"+
		"\2\u00e3\u00e4\7\35\2\2\u00e4\37\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6\u00f7"+
		"\7\36\2\2\u00e7\u00eb\5\4\3\2\u00e8\u00eb\5.\30\2\u00e9\u00eb\5\34\17"+
		"\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f4"+
		"\3\2\2\2\u00ec\u00f0\7\33\2\2\u00ed\u00f1\5\4\3\2\u00ee\u00f1\5.\30\2"+
		"\u00ef\u00f1\5\34\17\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\37\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc\u00fe\5\26\f"+
		"\2\u00fd\u00ff\7\33\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0103\3\2\2\2\u0100\u0102\5\16\b\2\u0101\u0100\3\2\2\2\u0102\u0105\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0113\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\7\20\2\2\u0107\u0109\5\26\f\2\u0108\u010a\7"+
		"\33\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b"+
		"\u010d\5\16\b\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0106\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u011d\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\7\17\2\2\u0117"+
		"\u0119\5\16\b\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0116\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\21"+
		"\2\2\u0120#\3\2\2\2\u0121\u0122\7\24\2\2\u0122\u012d\5\4\3\2\u0123\u0124"+
		"\7\26\2\2\u0124\u0128\5\4\3\2\u0125\u0127\5\16\b\2\u0126\u0125\3\2\2\2"+
		"\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0137\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0134\7\25\2\2\u0131\u0133\5\16\b\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\7\21\2\2\u013a%\3\2\2\2\u013b\u013c\7\22\2"+
		"\2\u013c\u013e\5\26\f\2\u013d\u013f\7\33\2\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u0142\5\16\b\2\u0141\u0140\3"+
		"\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\21\2\2\u0147\'\3\2\2"+
		"\2\u0148\u0149\7\23\2\2\u0149\u014a\7&\2\2\u014a\u014d\7\31\2\2\u014b"+
		"\u014e\5*\26\2\u014c\u014e\5\34\17\2\u014d\u014b\3\2\2\2\u014d\u014c\3"+
		"\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\7\33\2\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152\u0154\5\16\b\2\u0153\u0152\3"+
		"\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\21\2\2\u0159)\3\2\2\2"+
		"\u015a\u015b\5\4\3\2\u015b\u015c\7\34\2\2\u015c\u015d\5\4\3\2\u015d+\3"+
		"\2\2\2\u015e\u0163\7\36\2\2\u015f\u0164\5\4\3\2\u0160\u0164\5.\30\2\u0161"+
		"\u0164\5\22\n\2\u0162\u0164\5\34\17\2\u0163\u015f\3\2\2\2\u0163\u0160"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\7\37\2\2\u0166-\3\2\2\2\u0167\u0168\7\6\2\2\u0168\u0169\5\4\3\2"+
		"\u0169/\3\2\2\2\u016a\u016b\7)\2\2\u016b\u016c\5\26\f\2\u016c\61\3\2\2"+
		"\2\658:AEJUXcgor}\u0083\u008b\u0096\u009e\u00a8\u00ab\u00af\u00b3\u00bb"+
		"\u00be\u00c2\u00c6\u00cc\u00cf\u00d3\u00d7\u00dc\u00e1\u00ea\u00f0\u00f4"+
		"\u00f7\u00fe\u0103\u0109\u010e\u0113\u011a\u011d\u0128\u012d\u0134\u0137"+
		"\u013e\u0143\u014d\u0150\u0155\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}