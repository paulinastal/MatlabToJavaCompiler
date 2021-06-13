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
		CONTINUE=21, BREAK=22, FUNCTION=23, RETURN=24, SET=25, GET=26, ASSIGN=27, 
		DOT=28, COMMA=29, COLON=30, SEMI_COLON=31, LEFT_PARENTHESIS=32, RIGHT_PARENTHESIS=33, 
		LEFT_BRACE=34, RIGHT_BRACE=35, LEFT_SQUARE_BRACKET=36, RIGHT_SQUARE_BRACKET=37, 
		ID=38, TRUE=39, FALSE=40, AND=41, OR=42, NOT=43, EQUAL=44, NOT_EQUAL=45, 
		GREATER_THAN=46, GREATER_OR_EQUAL=47, LESS_THAN=48, LESS_OR_EQUAL=49, 
		INT=50, FLOAT=51;
	public static final int
		RULE_bool = 0, RULE_empty_array = 1, RULE_empty_cell = 2, RULE_end = 3, 
		RULE_floa = 4, RULE_integer = 5, RULE_var = 6, RULE_program = 7, RULE_def_function = 8, 
		RULE_function_params = 9, RULE_function_returns = 10, RULE_statement_assign = 11, 
		RULE_statement_if = 12, RULE_statement_switch = 13, RULE_statement_for = 14, 
		RULE_statement_while = 15, RULE_array = 16, RULE_semi_colon_operator = 17, 
		RULE_function = 18, RULE_statement = 19, RULE_expression = 20, RULE_parenthesis_expression = 21, 
		RULE_math_operator = 22, RULE_logic_expression = 23, RULE_logic_operator = 24, 
		RULE_relational_operator = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"bool", "empty_array", "empty_cell", "end", "floa", "integer", "var", 
			"program", "def_function", "function_params", "function_returns", "statement_assign", 
			"statement_if", "statement_switch", "statement_for", "statement_while", 
			"array", "semi_colon_operator", "function", "statement", "expression", 
			"parenthesis_expression", "math_operator", "logic_expression", "logic_operator", 
			"relational_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'/'", "'*'", "'^'", "'.*'", "'./'", 
			"'.^'", "'global'", "'if'", "'else'", "'elseif'", "'end'", "'while'", 
			"'for'", "'switch'", "'otherwise'", "'case'", "'continue'", "'break'", 
			"'function'", "'return'", "'set'", "'get'", "'='", "'.'", "','", "':'", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'", null, "'true'", "'false'", 
			"'&&'", "'||'", "'~'", "'=='", "'~='", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "CONTINUE", 
			"BREAK", "FUNCTION", "RETURN", "SET", "GET", "ASSIGN", "DOT", "COMMA", 
			"COLON", "SEMI_COLON", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "ID", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", 
			"LESS_THAN", "LESS_OR_EQUAL", "INT", "FLOAT"
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
			setState(52);
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

	public static class Empty_arrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatlabParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatlabParser.RIGHT_SQUARE_BRACKET, 0); }
		public Empty_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterEmpty_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitEmpty_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitEmpty_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_arrayContext empty_array() throws RecognitionException {
		Empty_arrayContext _localctx = new Empty_arrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empty_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LEFT_SQUARE_BRACKET);
			setState(55);
			match(RIGHT_SQUARE_BRACKET);
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

	public static class Empty_cellContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(MatlabParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatlabParser.RIGHT_BRACE, 0); }
		public Empty_cellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterEmpty_cell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitEmpty_cell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitEmpty_cell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_cellContext empty_cell() throws RecognitionException {
		Empty_cellContext _localctx = new Empty_cellContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_empty_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LEFT_BRACE);
			setState(58);
			match(RIGHT_BRACE);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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

	public static class FloaContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MatlabParser.FLOAT, 0); }
		public FloaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterFloa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitFloa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitFloa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloaContext floa() throws RecognitionException {
		FloaContext _localctx = new FloaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(FLOAT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MatlabParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(INT);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MatlabParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
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
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << IF) | (1L << END) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNCTION) | (1L << RETURN) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case IF:
				case END:
				case WHILE:
				case FOR:
				case SWITCH:
				case CONTINUE:
				case BREAK:
				case RETURN:
				case LEFT_PARENTHESIS:
				case LEFT_SQUARE_BRACKET:
				case ID:
				case TRUE:
				case FALSE:
				case NOT:
				case INT:
				case FLOAT:
					{
					setState(68);
					statement();
					}
					break;
				case FUNCTION:
					{
					setState(69);
					def_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Function_returnsContext function_returns() {
			return getRuleContext(Function_returnsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(MatlabParser.DOT, 0); }
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode GET() { return getToken(MatlabParser.GET, 0); }
		public TerminalNode SET() { return getToken(MatlabParser.SET, 0); }
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
		enterRule(_localctx, 16, RULE_def_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUNCTION);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76);
				function_returns();
				setState(77);
				match(ASSIGN);
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET || _la==GET) {
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==GET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(82);
				match(DOT);
				}
			}

			setState(85);
			var();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(86);
				function_params();
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					statement();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(95);
			end();
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 18, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LEFT_PARENTHESIS);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(98);
				var();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					var();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 20, RULE_function_returns);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				var();
				}
				break;
			case LEFT_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(LEFT_SQUARE_BRACKET);
				setState(112);
				var();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					var();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
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

	public static class Statement_assignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 22, RULE_statement_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			var();
			setState(125);
			match(ASSIGN);
			setState(126);
			expression(0);
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
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MatlabParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MatlabParser.SEMI_COLON, i);
		}
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
		enterRule(_localctx, 24, RULE_statement_if);
		int _la;
		try {
			int _alt;
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(128);
				match(IF);
				setState(129);
				logic_expression(0);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(130);
					match(COMMA);
					}
				}

				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						statement();
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(139);
					match(ELSEIF);
					setState(140);
					logic_expression(0);
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(141);
						match(COMMA);
						}
					}

					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(144);
							statement();
							}
							} 
						}
						setState(149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155);
					match(ELSE);
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(156);
							statement();
							}
							} 
						}
						setState(161);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
				}

				setState(164);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(IF);
				setState(167);
				expression(0);
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				statement();
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				match(END);
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

	public static class Statement_switchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(MatlabParser.SWITCH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 26, RULE_statement_switch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SWITCH);
			setState(176);
			expression(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(177);
				match(CASE);
				setState(178);
				expression(0);
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						statement();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(190);
				match(OTHERWISE);
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						statement();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
			}

			setState(199);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MatlabParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(MatlabParser.END, 0); }
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
		enterRule(_localctx, 28, RULE_statement_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FOR);
			setState(202);
			var();
			setState(203);
			match(ASSIGN);
			setState(204);
			expression(0);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(205);
				match(COMMA);
				}
			}

			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					statement();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(214);
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
		enterRule(_localctx, 30, RULE_statement_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WHILE);
			setState(217);
			logic_expression(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(218);
				match(COMMA);
				}
			}

			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					statement();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(227);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatlabParser.LEFT_SQUARE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatlabParser.RIGHT_SQUARE_BRACKET, 0); }
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
		enterRule(_localctx, 32, RULE_array);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(LEFT_SQUARE_BRACKET);
				setState(230);
				expression(0);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << END) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(231);
						match(COMMA);
						}
					}

					setState(234);
					expression(0);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(LEFT_SQUARE_BRACKET);
				setState(243);
				expression(0);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << END) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(244);
						match(COMMA);
						}
					}

					setState(247);
					expression(0);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON) {
					{
					{
					setState(253);
					semi_colon_operator();
					setState(254);
					expression(0);
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << END) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
						{
						{
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(255);
							match(COMMA);
							}
						}

						setState(258);
						expression(0);
						}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
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
		enterRule(_localctx, 34, RULE_semi_colon_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatlabParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatlabParser.RIGHT_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Empty_cellContext> empty_cell() {
			return getRuleContexts(Empty_cellContext.class);
		}
		public Empty_cellContext empty_cell(int i) {
			return getRuleContext(Empty_cellContext.class,i);
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
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			var();
			setState(276);
			match(LEFT_PARENTHESIS);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << END) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_BRACE) | (1L << LEFT_SQUARE_BRACKET) | (1L << ID) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case END:
				case LEFT_PARENTHESIS:
				case LEFT_SQUARE_BRACKET:
				case ID:
				case TRUE:
				case FALSE:
				case NOT:
				case INT:
				case FLOAT:
					{
					setState(277);
					expression(0);
					}
					break;
				case LEFT_BRACE:
					{
					setState(278);
					empty_cell();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					setState(284);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
					case MINUS:
					case END:
					case LEFT_PARENTHESIS:
					case LEFT_SQUARE_BRACKET:
					case ID:
					case TRUE:
					case FALSE:
					case NOT:
					case INT:
					case FLOAT:
						{
						setState(282);
						expression(0);
						}
						break;
					case LEFT_BRACE:
						{
						setState(283);
						empty_cell();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MatlabParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MatlabParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(MatlabParser.RETURN, 0); }
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
		enterRule(_localctx, 38, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(295);
				statement_assign();
				}
				break;
			case 2:
				{
				setState(296);
				statement_if();
				}
				break;
			case 3:
				{
				setState(297);
				statement_for();
				}
				break;
			case 4:
				{
				setState(298);
				statement_while();
				}
				break;
			case 5:
				{
				setState(299);
				statement_switch();
				}
				break;
			case 6:
				{
				setState(300);
				expression(0);
				}
				break;
			case 7:
				{
				setState(301);
				logic_expression(0);
				}
				break;
			case 8:
				{
				setState(302);
				parenthesis_expression();
				}
				break;
			case 9:
				{
				setState(303);
				function();
				}
				break;
			case 10:
				{
				setState(304);
				var();
				}
				break;
			case 11:
				{
				setState(305);
				match(BREAK);
				}
				break;
			case 12:
				{
				setState(306);
				match(CONTINUE);
				}
				break;
			case 13:
				{
				setState(307);
				match(RETURN);
				}
				break;
			}
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(310);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FloaContext floa() {
			return getRuleContext(FloaContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MatlabParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MatlabParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MatlabParser.NOT, 0); }
		public TerminalNode COLON() { return getToken(MatlabParser.COLON, 0); }
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatlabListener ) ((MatlabListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatlabVisitor ) return ((MatlabVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(314);
				bool();
				}
				break;
			case 2:
				{
				setState(315);
				floa();
				}
				break;
			case 3:
				{
				setState(316);
				end();
				}
				break;
			case 4:
				{
				setState(317);
				integer();
				}
				break;
			case 5:
				{
				setState(318);
				var();
				}
				break;
			case 6:
				{
				setState(319);
				array();
				}
				break;
			case 7:
				{
				setState(320);
				function();
				}
				break;
			case 8:
				{
				setState(321);
				parenthesis_expression();
				}
				break;
			case 9:
				{
				setState(322);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				expression(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(327);
						match(COLON);
						setState(328);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(330);
						math_operator();
						setState(331);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatlabParser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatlabParser.RIGHT_PARENTHESIS, 0); }
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
			setState(338);
			match(LEFT_PARENTHESIS);
			setState(339);
			expression(0);
			setState(340);
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
		enterRule(_localctx, 44, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(345);
				bool();
				}
				break;
			case 2:
				{
				setState(346);
				expression(0);
				setState(347);
				relational_operator();
				setState(348);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
					setState(352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(353);
					logic_operator();
					setState(354);
					logic_expression(2);
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 48, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 50, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 23:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0170\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\7\tI\n\t\f\t\16\tL\13\t\3\n\3\n\3\n\3\n\5\nR\n"+
		"\n\3\n\3\n\5\nV\n\n\3\n\3\n\5\nZ\n\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\5\13m\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\5\f}\n\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\5\16\u0086\n\16\3\16\7\16\u0089\n\16\f\16\16"+
		"\16\u008c\13\16\3\16\3\16\3\16\5\16\u0091\n\16\3\16\7\16\u0094\n\16\f"+
		"\16\16\16\u0097\13\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\16\3\16"+
		"\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\5\16\u00a5\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\7\17\u00bc\n\17\f\17\16\17\u00bf"+
		"\13\17\3\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6\13\17\5\17\u00c8\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00d1\n\20\3\20\7\20\u00d4\n"+
		"\20\f\20\16\20\u00d7\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u00de\n\21\3"+
		"\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3\21\3\21\3\22\3\22\3\22\5"+
		"\22\u00eb\n\22\3\22\7\22\u00ee\n\22\f\22\16\22\u00f1\13\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00f8\n\22\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13"+
		"\22\3\22\3\22\3\22\5\22\u0103\n\22\3\22\7\22\u0106\n\22\f\22\16\22\u0109"+
		"\13\22\7\22\u010b\n\22\f\22\16\22\u010e\13\22\3\22\3\22\5\22\u0112\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u011a\n\24\3\24\3\24\3\24\5\24\u011f"+
		"\n\24\7\24\u0121\n\24\f\24\16\24\u0124\13\24\5\24\u0126\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0137\n\25\3\25\5\25\u013a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0147\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0161\n\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0167\n\31\f\31\16\31\u016a\13\31\3\32\3\32\3\33\3\33\3\33\2\4*\60\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\t\3\2)*\3"+
		"\2\33\34\4\2\37\37!!\4\2\5\6--\3\2\5\f\3\2+,\3\2.\63\2\u0194\2\66\3\2"+
		"\2\2\48\3\2\2\2\6;\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16D\3\2\2"+
		"\2\20J\3\2\2\2\22M\3\2\2\2\24c\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u00af"+
		"\3\2\2\2\34\u00b1\3\2\2\2\36\u00cb\3\2\2\2 \u00da\3\2\2\2\"\u0111\3\2"+
		"\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u0136\3\2\2\2*\u0146\3\2\2\2,\u0154"+
		"\3\2\2\2.\u0158\3\2\2\2\60\u0160\3\2\2\2\62\u016b\3\2\2\2\64\u016d\3\2"+
		"\2\2\66\67\t\2\2\2\67\3\3\2\2\289\7&\2\29:\7\'\2\2:\5\3\2\2\2;<\7$\2\2"+
		"<=\7%\2\2=\7\3\2\2\2>?\7\21\2\2?\t\3\2\2\2@A\7\65\2\2A\13\3\2\2\2BC\7"+
		"\64\2\2C\r\3\2\2\2DE\7(\2\2E\17\3\2\2\2FI\5(\25\2GI\5\22\n\2HF\3\2\2\2"+
		"HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\21\3\2\2\2LJ\3\2\2\2MQ\7\31"+
		"\2\2NO\5\26\f\2OP\7\35\2\2PR\3\2\2\2QN\3\2\2\2QR\3\2\2\2RU\3\2\2\2ST\t"+
		"\3\2\2TV\7\36\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\16\b\2XZ\5\24\13\2"+
		"YX\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[]\5(\25\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\5\b\5\2b\23\3\2\2\2cl\7\"\2\2di\5\16"+
		"\b\2ef\7\37\2\2fh\5\16\b\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7#\2\2o\25\3\2\2\2p}"+
		"\5\16\b\2qr\7&\2\2rw\5\16\b\2st\7\37\2\2tv\5\16\b\2us\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\'\2\2{}\3\2\2\2|p\3\2\2"+
		"\2|q\3\2\2\2}\27\3\2\2\2~\177\5\16\b\2\177\u0080\7\35\2\2\u0080\u0081"+
		"\5*\26\2\u0081\31\3\2\2\2\u0082\u0083\7\16\2\2\u0083\u0085\5\60\31\2\u0084"+
		"\u0086\7\37\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3"+
		"\2\2\2\u0087\u0089\5(\25\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009a\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\20\2\2\u008e\u0090\5\60\31\2\u008f\u0091\7\37\2\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0094\5("+
		"\25\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u008d\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00a4\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7\17\2\2\u009e\u00a0\5"+
		"(\25\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009d\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\21\2\2\u00a7"+
		"\u00b0\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\t"+
		"\4\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\t\4\2\2\u00ad\u00ae\7\21\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u0082\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\33\3\2\2"+
		"\2\u00b1\u00b2\7\24\2\2\u00b2\u00bd\5*\26\2\u00b3\u00b4\7\26\2\2\u00b4"+
		"\u00b8\5*\26\2\u00b5\u00b7\5(\25\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c7\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c4\7\25\2\2\u00c1\u00c3\5(\25\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\7\21\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7\23\2\2\u00cc"+
		"\u00cd\5\16\b\2\u00cd\u00ce\7\35\2\2\u00ce\u00d0\5*\26\2\u00cf\u00d1\7"+
		"\37\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2"+
		"\u00d4\5(\25\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7\21\2\2\u00d9\37\3\2\2\2\u00da\u00db\7\22\2\2\u00db\u00dd\5\60"+
		"\31\2\u00dc\u00de\7\37\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e2\3\2\2\2\u00df\u00e1\5(\25\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\21\2\2\u00e6!\3\2\2\2\u00e7\u00e8\7&\2\2"+
		"\u00e8\u00ef\5*\26\2\u00e9\u00eb\7\37\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5*\26\2\u00ed\u00ea\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3\u0112\3\2\2\2\u00f4"+
		"\u00f5\7&\2\2\u00f5\u00fc\5*\26\2\u00f6\u00f8\7\37\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5*\26\2\u00fa"+
		"\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u010c\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5$\23\2\u0100"+
		"\u0107\5*\26\2\u0101\u0103\7\37\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\5*\26\2\u0105\u0102\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u00ff\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7\'\2\2\u0110\u0112\3\2\2\2\u0111\u00e7\3\2\2\2\u0111"+
		"\u00f4\3\2\2\2\u0112#\3\2\2\2\u0113\u0114\7!\2\2\u0114%\3\2\2\2\u0115"+
		"\u0116\5\16\b\2\u0116\u0125\7\"\2\2\u0117\u011a\5*\26\2\u0118\u011a\5"+
		"\6\4\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u0122\3\2\2\2\u011b"+
		"\u011e\7\37\2\2\u011c\u011f\5*\26\2\u011d\u011f\5\6\4\2\u011e\u011c\3"+
		"\2\2\2\u011e\u011d\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\7#\2\2\u0128\'\3\2\2\2\u0129\u0137\5\30\r\2"+
		"\u012a\u0137\5\32\16\2\u012b\u0137\5\36\20\2\u012c\u0137\5 \21\2\u012d"+
		"\u0137\5\34\17\2\u012e\u0137\5*\26\2\u012f\u0137\5\60\31\2\u0130\u0137"+
		"\5,\27\2\u0131\u0137\5&\24\2\u0132\u0137\5\16\b\2\u0133\u0137\7\30\2\2"+
		"\u0134\u0137\7\27\2\2\u0135\u0137\7\32\2\2\u0136\u0129\3\2\2\2\u0136\u012a"+
		"\3\2\2\2\u0136\u012b\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u012d\3\2\2\2\u0136"+
		"\u012e\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2"+
		"\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\t\4\2\2\u0139\u0138\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a)\3\2\2\2\u013b\u013c\b\26\1\2\u013c\u0147"+
		"\5\2\2\2\u013d\u0147\5\n\6\2\u013e\u0147\5\b\5\2\u013f\u0147\5\f\7\2\u0140"+
		"\u0147\5\16\b\2\u0141\u0147\5\"\22\2\u0142\u0147\5&\24\2\u0143\u0147\5"+
		",\27\2\u0144\u0145\t\5\2\2\u0145\u0147\5*\26\4\u0146\u013b\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2"+
		"\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0151\3\2\2\2\u0148\u0149\f\5\2\2\u0149\u014a\7 "+
		"\2\2\u014a\u0150\5*\26\6\u014b\u014c\f\3\2\2\u014c\u014d\5.\30\2\u014d"+
		"\u014e\5*\26\4\u014e\u0150\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"+\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\"\2\2\u0155\u0156\5*\26\2"+
		"\u0156\u0157\7#\2\2\u0157-\3\2\2\2\u0158\u0159\t\6\2\2\u0159/\3\2\2\2"+
		"\u015a\u015b\b\31\1\2\u015b\u0161\5\2\2\2\u015c\u015d\5*\26\2\u015d\u015e"+
		"\5\64\33\2\u015e\u015f\5*\26\2\u015f\u0161\3\2\2\2\u0160\u015a\3\2\2\2"+
		"\u0160\u015c\3\2\2\2\u0161\u0168\3\2\2\2\u0162\u0163\f\3\2\2\u0163\u0164"+
		"\5\62\32\2\u0164\u0165\5\60\31\4\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2"+
		"\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\61"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\t\7\2\2\u016c\63\3\2\2\2\u016d"+
		"\u016e\t\b\2\2\u016e\65\3\2\2\2/HJQUY^ilw|\u0085\u008a\u0090\u0095\u009a"+
		"\u00a1\u00a4\u00af\u00b8\u00bd\u00c4\u00c7\u00d0\u00d5\u00dd\u00e2\u00ea"+
		"\u00ef\u00f7\u00fc\u0102\u0107\u010c\u0111\u0119\u011e\u0122\u0125\u0136"+
		"\u0139\u0146\u014f\u0151\u0160\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}