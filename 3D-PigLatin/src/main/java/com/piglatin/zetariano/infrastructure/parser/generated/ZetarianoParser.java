// Generated from ZetarianoParser.g4 by ANTLR 4.13.2
package com.piglatin.zetariano.infrastructure.parser.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ZetarianoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, PLUS=3, MINUS=4, MULT=5, SPLIT=6, MODULO=7, 
		ASSIGN=8, PLUS_ASSIGN=9, MINUS_ASSIGN=10, MULT_ASSIGN=11, SPLIT_ASSIGN=12, 
		IDENTIC=13, DIFF=14, MAJORTO=15, MINORTO=16, MINOR=17, MAJOR=18, AND=19, 
		OR=20, NOT=21, INCREMENT=22, DECREMENT=23, COLON=24, COMMA=25, DOT=26, 
		SEMICOLON=27, QUESTION=28, LEFT_CLASP=29, RIGHT_CLASP=30, LEFT_BRACE=31, 
		RIGHT_BRACE=32, LEFT_PAREN=33, RIGHT_PAREN=34, PUBLIC=35, CLASS=36, NEW=37, 
		VOID=38, RETURN=39, IF=40, ELSE=41, SWITCH=42, CASE=43, DEFAULT=44, BREAK=45, 
		CONTINUE=46, FOR=47, WHILE=48, DO=49, PRINTLN=50, PRINT=51, READLN=52, 
		TRUE=53, FALSE=54, NULL=55, INT=56, DOUBLE=57, CHAR=58, BOOLEAN=59, STRING=60, 
		ID=61, INTEGER=62, DECIMAL=63, STRING_LITERAL=64, CHAR_LITERAL=65, WS=66;
	public static final int
		RULE_program = 0, RULE_class_declaration = 1, RULE_class_body = 2, RULE_field_declaration = 3, 
		RULE_constructor_declaration = 4, RULE_method_declaration = 5, RULE_parameter_list = 6, 
		RULE_parameter = 7, RULE_type = 8, RULE_block = 9, RULE_statement = 10, 
		RULE_variable_declaration = 11, RULE_array_initializer = 12, RULE_object_creation = 13, 
		RULE_assignment = 14, RULE_array_access = 15, RULE_struct_access = 16, 
		RULE_if_statement = 17, RULE_switch_statement = 18, RULE_case_statement = 19, 
		RULE_default_statement = 20, RULE_for_statement = 21, RULE_for_initialization = 22, 
		RULE_for_condition = 23, RULE_for_update = 24, RULE_while_statement = 25, 
		RULE_do_while_statement = 26, RULE_return_statement = 27, RULE_break_statement = 28, 
		RULE_continue_statement = 29, RULE_print_statement = 30, RULE_read_statement = 31, 
		RULE_expression = 32, RULE_primary = 33, RULE_logical_or = 34, RULE_logical_and = 35, 
		RULE_equality = 36, RULE_relational = 37, RULE_additive = 38, RULE_multiplicative = 39, 
		RULE_unary = 40, RULE_postfix = 41, RULE_method_call = 42, RULE_argument_list = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_declaration", "class_body", "field_declaration", "constructor_declaration", 
			"method_declaration", "parameter_list", "parameter", "type", "block", 
			"statement", "variable_declaration", "array_initializer", "object_creation", 
			"assignment", "array_access", "struct_access", "if_statement", "switch_statement", 
			"case_statement", "default_statement", "for_statement", "for_initialization", 
			"for_condition", "for_update", "while_statement", "do_while_statement", 
			"return_statement", "break_statement", "continue_statement", "print_statement", 
			"read_statement", "expression", "primary", "logical_or", "logical_and", 
			"equality", "relational", "additive", "multiplicative", "unary", "postfix", 
			"method_call", "argument_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", 
			"'||'", "'!'", "'++'", "'--'", "':'", "','", "'.'", "';'", "'?'", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "'public'", "'class'", "'new'", "'void'", 
			"'return'", "'if'", "'else'", "'switch'", "'case'", "'default'", "'break'", 
			"'continue'", "'for'", "'while'", "'do'", "'println'", "'print'", "'readln'", 
			"'true'", "'false'", "'null'", "'int'", "'double'", "'char'", "'boolean'", 
			"'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "BLOCK_COMMENT", "PLUS", "MINUS", "MULT", "SPLIT", 
			"MODULO", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "SPLIT_ASSIGN", 
			"IDENTIC", "DIFF", "MAJORTO", "MINORTO", "MINOR", "MAJOR", "AND", "OR", 
			"NOT", "INCREMENT", "DECREMENT", "COLON", "COMMA", "DOT", "SEMICOLON", 
			"QUESTION", "LEFT_CLASP", "RIGHT_CLASP", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_PAREN", "RIGHT_PAREN", "PUBLIC", "CLASS", "NEW", "VOID", "RETURN", 
			"IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", "FOR", 
			"WHILE", "DO", "PRINTLN", "PRINT", "READLN", "TRUE", "FALSE", "NULL", 
			"INT", "DOUBLE", "CHAR", "BOOLEAN", "STRING", "ID", "INTEGER", "DECIMAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "WS"
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
	public String getGrammarFileName() { return "ZetarianoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZetarianoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ZetarianoParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			class_declaration();
			setState(89);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ZetarianoParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(ZetarianoParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ZetarianoParser.LEFT_BRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(ZetarianoParser.RIGHT_BRACE, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PUBLIC);
			setState(92);
			match(CLASS);
			setState(93);
			match(ID);
			setState(94);
			match(LEFT_BRACE);
			setState(95);
			class_body();
			setState(96);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public List<Field_declarationContext> field_declaration() {
			return getRuleContexts(Field_declarationContext.class);
		}
		public Field_declarationContext field_declaration(int i) {
			return getRuleContext(Field_declarationContext.class,i);
		}
		public List<Constructor_declarationContext> constructor_declaration() {
			return getRuleContexts(Constructor_declarationContext.class);
		}
		public Constructor_declarationContext constructor_declaration(int i) {
			return getRuleContext(Constructor_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4539628458749198336L) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(98);
					field_declaration();
					}
					break;
				case 2:
					{
					setState(99);
					constructor_declaration();
					}
					break;
				case 3:
					{
					setState(100);
					method_declaration();
					}
					break;
				}
				}
				setState(105);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declarationContext extends ParserRuleContext {
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	 
		public Field_declarationContext() { }
		public void copyFrom(Field_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends Field_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public FieldDeclarationContext(Field_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_declaration);
		try {
			_localctx = new FieldDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(ID);
			setState(108);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_declarationContext extends ParserRuleContext {
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	 
		public Constructor_declarationContext() { }
		public void copyFrom(Constructor_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends Constructor_declarationContext {
		public TerminalNode PUBLIC() { return getToken(ZetarianoParser.PUBLIC, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ZetarianoParser.LEFT_BRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(ZetarianoParser.RIGHT_BRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public ConstructorDeclarationContext(Constructor_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor_declaration);
		int _la;
		try {
			_localctx = new ConstructorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PUBLIC);
			setState(111);
			match(ID);
			setState(112);
			match(LEFT_PAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4539628424389459968L) != 0)) {
				{
				setState(113);
				parameter_list();
				}
			}

			setState(116);
			match(RIGHT_PAREN);
			setState(117);
			match(LEFT_BRACE);
			setState(118);
			block();
			setState(119);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	 
		public Method_declarationContext() { }
		public void copyFrom(Method_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends Method_declarationContext {
		public TerminalNode PUBLIC() { return getToken(ZetarianoParser.PUBLIC, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ZetarianoParser.LEFT_BRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(ZetarianoParser.RIGHT_BRACE, 0); }
		public TerminalNode VOID() { return getToken(ZetarianoParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public MethodDeclarationContext(Method_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_declaration);
		int _la;
		try {
			_localctx = new MethodDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PUBLIC);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(122);
				match(VOID);
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case BOOLEAN:
			case STRING:
			case ID:
				{
				setState(123);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			match(ID);
			setState(127);
			match(LEFT_PAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4539628424389459968L) != 0)) {
				{
				setState(128);
				parameter_list();
				}
			}

			setState(131);
			match(RIGHT_PAREN);
			setState(132);
			match(LEFT_BRACE);
			setState(133);
			block();
			setState(134);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ZetarianoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZetarianoParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			parameter();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				parameter();
				}
				}
				setState(143);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			type();
			setState(145);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdContext extends TypeContext {
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TypeIdContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(ZetarianoParser.CHAR, 0); }
		public TypeCharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(ZetarianoParser.BOOLEAN, 0); }
		public TypeBooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(ZetarianoParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDoubleContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(ZetarianoParser.DOUBLE, 0); }
		public TypeDoubleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(ZetarianoParser.STRING, 0); }
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(DOUBLE);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new TypeIdContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					statement();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementVariableDeclarationContext extends StatementContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementWhileContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementContinueContext extends StatementContext {
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssignmentContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementForContext extends StatementContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementReturnContext extends StatementContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakContext extends StatementContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementEmptyContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementEmptyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSwitchContext extends StatementContext {
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public StatementSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPrintContext extends StatementContext {
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementReadContext extends StatementContext {
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDoWhileContext extends StatementContext {
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public StatementDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementObjectCreationContext extends StatementContext {
		public Object_creationContext object_creation() {
			return getRuleContext(Object_creationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public StatementObjectCreationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStatementObjectCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStatementObjectCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStatementObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variable_declaration();
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				assignment();
				setState(165);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				if_statement();
				}
				break;
			case 4:
				_localctx = new StatementSwitchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				switch_statement();
				}
				break;
			case 5:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				for_statement();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				while_statement();
				}
				break;
			case 7:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				do_while_statement();
				}
				break;
			case 8:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				return_statement();
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				break_statement();
				setState(176);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(178);
				continue_statement();
				setState(179);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new StatementPrintContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				print_statement();
				setState(182);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new StatementReadContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(184);
				read_statement();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new StatementObjectCreationContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(187);
				object_creation();
				setState(188);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new StatementExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(190);
				expression(0);
				setState(191);
				match(SEMICOLON);
				}
				break;
			case 15:
				_localctx = new StatementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationArrayContext extends Variable_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_CLASP() { return getToken(ZetarianoParser.LEFT_CLASP, 0); }
		public TerminalNode RIGHT_CLASP() { return getToken(ZetarianoParser.RIGHT_CLASP, 0); }
		public TerminalNode INTEGER() { return getToken(ZetarianoParser.INTEGER, 0); }
		public TerminalNode ASSIGN() { return getToken(ZetarianoParser.ASSIGN, 0); }
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public VariableDeclarationArrayContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterVariableDeclarationArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitVariableDeclarationArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitVariableDeclarationArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationObjectContext extends Variable_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ZetarianoParser.ASSIGN, 0); }
		public Object_creationContext object_creation() {
			return getRuleContext(Object_creationContext.class,0);
		}
		public VariableDeclarationObjectContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterVariableDeclarationObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitVariableDeclarationObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitVariableDeclarationObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationMatrixContext extends Variable_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public List<TerminalNode> LEFT_CLASP() { return getTokens(ZetarianoParser.LEFT_CLASP); }
		public TerminalNode LEFT_CLASP(int i) {
			return getToken(ZetarianoParser.LEFT_CLASP, i);
		}
		public List<TerminalNode> RIGHT_CLASP() { return getTokens(ZetarianoParser.RIGHT_CLASP); }
		public TerminalNode RIGHT_CLASP(int i) {
			return getToken(ZetarianoParser.RIGHT_CLASP, i);
		}
		public TerminalNode ASSIGN() { return getToken(ZetarianoParser.ASSIGN, 0); }
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public VariableDeclarationMatrixContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterVariableDeclarationMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitVariableDeclarationMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitVariableDeclarationMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationSimpleContext extends Variable_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ZetarianoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationSimpleContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterVariableDeclarationSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitVariableDeclarationSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitVariableDeclarationSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_declaration);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				type();
				setState(197);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(198);
					match(ASSIGN);
					setState(199);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new VariableDeclarationArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				type();
				setState(203);
				match(ID);
				setState(204);
				match(LEFT_CLASP);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(205);
					match(INTEGER);
					}
				}

				setState(208);
				match(RIGHT_CLASP);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(209);
					match(ASSIGN);
					setState(210);
					array_initializer();
					}
				}

				}
				break;
			case 3:
				_localctx = new VariableDeclarationMatrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				type();
				setState(214);
				match(ID);
				setState(215);
				match(LEFT_CLASP);
				setState(216);
				match(LEFT_CLASP);
				setState(217);
				match(RIGHT_CLASP);
				setState(218);
				match(RIGHT_CLASP);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(219);
					match(ASSIGN);
					setState(220);
					array_initializer();
					}
				}

				}
				break;
			case 4:
				_localctx = new VariableDeclarationObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				type();
				setState(224);
				match(ID);
				setState(225);
				match(ASSIGN);
				setState(226);
				object_creation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializerContext extends ParserRuleContext {
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	 
		public Array_initializerContext() { }
		public void copyFrom(Array_initializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerNewContext extends Array_initializerContext {
		public TerminalNode NEW() { return getToken(ZetarianoParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_CLASP() { return getToken(ZetarianoParser.LEFT_CLASP, 0); }
		public TerminalNode INTEGER() { return getToken(ZetarianoParser.INTEGER, 0); }
		public TerminalNode RIGHT_CLASP() { return getToken(ZetarianoParser.RIGHT_CLASP, 0); }
		public ArrayInitializerNewContext(Array_initializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterArrayInitializerNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitArrayInitializerNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitArrayInitializerNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerMatrixContext extends Array_initializerContext {
		public TerminalNode NEW() { return getToken(ZetarianoParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LEFT_CLASP() { return getTokens(ZetarianoParser.LEFT_CLASP); }
		public TerminalNode LEFT_CLASP(int i) {
			return getToken(ZetarianoParser.LEFT_CLASP, i);
		}
		public List<TerminalNode> RIGHT_CLASP() { return getTokens(ZetarianoParser.RIGHT_CLASP); }
		public TerminalNode RIGHT_CLASP(int i) {
			return getToken(ZetarianoParser.RIGHT_CLASP, i);
		}
		public ArrayInitializerMatrixContext(Array_initializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterArrayInitializerMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitArrayInitializerMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitArrayInitializerMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends Array_initializerContext {
		public TerminalNode LEFT_BRACE() { return getToken(ZetarianoParser.LEFT_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(ZetarianoParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ZetarianoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZetarianoParser.COMMA, i);
		}
		public ArrayInitializerContext(Array_initializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_initializer);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ArrayInitializerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(LEFT_BRACE);
				setState(231);
				expression(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					match(COMMA);
					setState(233);
					expression(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				_localctx = new ArrayInitializerNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(NEW);
				setState(242);
				type();
				setState(243);
				match(LEFT_CLASP);
				setState(244);
				match(INTEGER);
				setState(245);
				match(RIGHT_CLASP);
				}
				break;
			case 3:
				_localctx = new ArrayInitializerMatrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(NEW);
				setState(248);
				type();
				setState(249);
				match(LEFT_CLASP);
				setState(250);
				match(LEFT_CLASP);
				setState(251);
				match(RIGHT_CLASP);
				setState(252);
				match(RIGHT_CLASP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Object_creationContext extends ParserRuleContext {
		public Object_creationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation; }
	 
		public Object_creationContext() { }
		public void copyFrom(Object_creationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectCreationContext extends Object_creationContext {
		public TerminalNode NEW() { return getToken(ZetarianoParser.NEW, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ObjectCreationContext(Object_creationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterObjectCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitObjectCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_creationContext object_creation() throws RecognitionException {
		Object_creationContext _localctx = new Object_creationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object_creation);
		int _la;
		try {
			_localctx = new ObjectCreationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(NEW);
			setState(257);
			match(ID);
			setState(258);
			match(LEFT_PAREN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
				{
				setState(259);
				argument_list();
				}
			}

			setState(262);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentDecrementContext extends AssignmentContext {
		public TerminalNode DECREMENT() { return getToken(ZetarianoParser.DECREMENT, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentDecrementContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentMultContext extends AssignmentContext {
		public TerminalNode MULT_ASSIGN() { return getToken(ZetarianoParser.MULT_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentMultContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentSimpleContext extends AssignmentContext {
		public TerminalNode ASSIGN() { return getToken(ZetarianoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentSimpleContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentIncrementContext extends AssignmentContext {
		public TerminalNode INCREMENT() { return getToken(ZetarianoParser.INCREMENT, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentIncrementContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentPlusContext extends AssignmentContext {
		public TerminalNode PLUS_ASSIGN() { return getToken(ZetarianoParser.PLUS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentPlusContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentMinusContext extends AssignmentContext {
		public TerminalNode MINUS_ASSIGN() { return getToken(ZetarianoParser.MINUS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentMinusContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentSplitContext extends AssignmentContext {
		public TerminalNode SPLIT_ASSIGN() { return getToken(ZetarianoParser.SPLIT_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public AssignmentSplitContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAssignmentSplit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAssignmentSplit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAssignmentSplit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AssignmentSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(264);
					match(ID);
					}
					break;
				case 2:
					{
					setState(265);
					array_access();
					}
					break;
				case 3:
					{
					setState(266);
					struct_access();
					}
					break;
				}
				setState(269);
				match(ASSIGN);
				setState(270);
				expression(0);
				}
				break;
			case 2:
				_localctx = new AssignmentPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(271);
					match(ID);
					}
					break;
				case 2:
					{
					setState(272);
					array_access();
					}
					break;
				case 3:
					{
					setState(273);
					struct_access();
					}
					break;
				}
				setState(276);
				match(PLUS_ASSIGN);
				setState(277);
				expression(0);
				}
				break;
			case 3:
				_localctx = new AssignmentMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(278);
					match(ID);
					}
					break;
				case 2:
					{
					setState(279);
					array_access();
					}
					break;
				case 3:
					{
					setState(280);
					struct_access();
					}
					break;
				}
				setState(283);
				match(MINUS_ASSIGN);
				setState(284);
				expression(0);
				}
				break;
			case 4:
				_localctx = new AssignmentMultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(285);
					match(ID);
					}
					break;
				case 2:
					{
					setState(286);
					array_access();
					}
					break;
				case 3:
					{
					setState(287);
					struct_access();
					}
					break;
				}
				setState(290);
				match(MULT_ASSIGN);
				setState(291);
				expression(0);
				}
				break;
			case 5:
				_localctx = new AssignmentSplitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(292);
					match(ID);
					}
					break;
				case 2:
					{
					setState(293);
					array_access();
					}
					break;
				case 3:
					{
					setState(294);
					struct_access();
					}
					break;
				}
				setState(297);
				match(SPLIT_ASSIGN);
				setState(298);
				expression(0);
				}
				break;
			case 6:
				_localctx = new AssignmentIncrementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(299);
					match(ID);
					}
					break;
				case 2:
					{
					setState(300);
					array_access();
					}
					break;
				case 3:
					{
					setState(301);
					struct_access();
					}
					break;
				}
				setState(304);
				match(INCREMENT);
				}
				break;
			case 7:
				_localctx = new AssignmentDecrementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(305);
					match(ID);
					}
					break;
				case 2:
					{
					setState(306);
					array_access();
					}
					break;
				case 3:
					{
					setState(307);
					struct_access();
					}
					break;
				}
				setState(310);
				match(DECREMENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ParserRuleContext {
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
	 
		public Array_accessContext() { }
		public void copyFrom(Array_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends Array_accessContext {
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public List<TerminalNode> LEFT_CLASP() { return getTokens(ZetarianoParser.LEFT_CLASP); }
		public TerminalNode LEFT_CLASP(int i) {
			return getToken(ZetarianoParser.LEFT_CLASP, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_CLASP() { return getTokens(ZetarianoParser.RIGHT_CLASP); }
		public TerminalNode RIGHT_CLASP(int i) {
			return getToken(ZetarianoParser.RIGHT_CLASP, i);
		}
		public ArrayAccessContext(Array_accessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_access);
		try {
			int _alt;
			_localctx = new ArrayAccessContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(314);
					match(LEFT_CLASP);
					setState(315);
					expression(0);
					setState(316);
					match(RIGHT_CLASP);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_accessContext extends ParserRuleContext {
		public Struct_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_access; }
	 
		public Struct_accessContext() { }
		public void copyFrom(Struct_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAccessContext extends Struct_accessContext {
		public List<TerminalNode> ID() { return getTokens(ZetarianoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ZetarianoParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ZetarianoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ZetarianoParser.DOT, i);
		}
		public StructAccessContext(Struct_accessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterStructAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitStructAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitStructAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_accessContext struct_access() throws RecognitionException {
		Struct_accessContext _localctx = new Struct_accessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct_access);
		try {
			int _alt;
			_localctx = new StructAccessContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ID);
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(323);
					match(DOT);
					setState(324);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends If_statementContext {
		public TerminalNode IF() { return getToken(ZetarianoParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ZetarianoParser.ELSE, 0); }
		public IfStatementContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			match(LEFT_PAREN);
			setState(331);
			expression(0);
			setState(332);
			match(RIGHT_PAREN);
			setState(333);
			statement();
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(334);
				match(ELSE);
				setState(335);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	 
		public Switch_statementContext() { }
		public void copyFrom(Switch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends Switch_statementContext {
		public TerminalNode SWITCH() { return getToken(ZetarianoParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(ZetarianoParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ZetarianoParser.RIGHT_BRACE, 0); }
		public List<Case_statementContext> case_statement() {
			return getRuleContexts(Case_statementContext.class);
		}
		public Case_statementContext case_statement(int i) {
			return getRuleContext(Case_statementContext.class,i);
		}
		public Default_statementContext default_statement() {
			return getRuleContext(Default_statementContext.class,0);
		}
		public SwitchStatementContext(Switch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_statement);
		int _la;
		try {
			_localctx = new SwitchStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SWITCH);
			setState(339);
			match(LEFT_PAREN);
			setState(340);
			expression(0);
			setState(341);
			match(RIGHT_PAREN);
			setState(342);
			match(LEFT_BRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(343);
				case_statement();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(349);
				default_statement();
				}
			}

			setState(352);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_statementContext extends ParserRuleContext {
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
	 
		public Case_statementContext() { }
		public void copyFrom(Case_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementContext extends Case_statementContext {
		public TerminalNode CASE() { return getToken(ZetarianoParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(ZetarianoParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ZetarianoParser.INTEGER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ZetarianoParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ZetarianoParser.CHAR_LITERAL, 0); }
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode BREAK() { return getToken(ZetarianoParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public CaseStatementContext(Case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_statement);
		int _la;
		try {
			_localctx = new CaseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(CASE);
			setState(355);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(356);
			match(COLON);
			setState(357);
			block();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(358);
				match(BREAK);
				setState(359);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Default_statementContext extends ParserRuleContext {
		public Default_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_statement; }
	 
		public Default_statementContext() { }
		public void copyFrom(Default_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultStatementContext extends Default_statementContext {
		public TerminalNode DEFAULT() { return getToken(ZetarianoParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(ZetarianoParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ZetarianoParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public DefaultStatementContext(Default_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_statementContext default_statement() throws RecognitionException {
		Default_statementContext _localctx = new Default_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_default_statement);
		int _la;
		try {
			_localctx = new DefaultStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(DEFAULT);
			setState(363);
			match(COLON);
			setState(364);
			block();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(365);
				match(BREAK);
				setState(366);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	 
		public For_statementContext() { }
		public void copyFrom(For_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends For_statementContext {
		public TerminalNode FOR() { return getToken(ZetarianoParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public For_initializationContext for_initialization() {
			return getRuleContext(For_initializationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ZetarianoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ZetarianoParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public ForStatementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_statement);
		int _la;
		try {
			_localctx = new ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(FOR);
			setState(370);
			match(LEFT_PAREN);
			setState(371);
			for_initialization();
			setState(372);
			match(SEMICOLON);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
				{
				setState(373);
				for_condition();
				}
			}

			setState(376);
			match(SEMICOLON);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
				{
				setState(377);
				for_update();
				}
			}

			setState(380);
			match(RIGHT_PAREN);
			setState(381);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_initializationContext extends ParserRuleContext {
		public For_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initialization; }
	 
		public For_initializationContext() { }
		public void copyFrom(For_initializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitEmptyContext extends For_initializationContext {
		public ForInitEmptyContext(For_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForInitEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForInitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForInitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitVariableContext extends For_initializationContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public ForInitVariableContext(For_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForInitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitAssignmentContext extends For_initializationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForInitAssignmentContext(For_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForInitAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForInitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForInitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializationContext for_initialization() throws RecognitionException {
		For_initializationContext _localctx = new For_initializationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_initialization);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ForInitVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new ForInitAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				assignment();
				}
				break;
			case 3:
				_localctx = new ForInitEmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_conditionContext extends ParserRuleContext {
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
	 
		public For_conditionContext() { }
		public void copyFrom(For_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends For_conditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(For_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_condition);
		try {
			_localctx = new ForConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_updateContext extends ParserRuleContext {
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
	 
		public For_updateContext() { }
		public void copyFrom(For_updateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateExpressionContext extends For_updateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateExpressionContext(For_updateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForUpdateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForUpdateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForUpdateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateAssignmentContext extends For_updateContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForUpdateAssignmentContext(For_updateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterForUpdateAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitForUpdateAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitForUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_update);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ForUpdateAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				assignment();
				}
				break;
			case 2:
				_localctx = new ForUpdateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends While_statementContext {
		public TerminalNode WHILE() { return getToken(ZetarianoParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_statement);
		try {
			_localctx = new WhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(WHILE);
			setState(395);
			match(LEFT_PAREN);
			setState(396);
			expression(0);
			setState(397);
			match(RIGHT_PAREN);
			setState(398);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_statementContext extends ParserRuleContext {
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
	 
		public Do_while_statementContext() { }
		public void copyFrom(Do_while_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends Do_while_statementContext {
		public TerminalNode DO() { return getToken(ZetarianoParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ZetarianoParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ZetarianoParser.SEMICOLON, 0); }
		public DoWhileStatementContext(Do_while_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_do_while_statement);
		try {
			_localctx = new DoWhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DO);
			setState(401);
			statement();
			setState(402);
			match(WHILE);
			setState(403);
			match(LEFT_PAREN);
			setState(404);
			expression(0);
			setState(405);
			match(RIGHT_PAREN);
			setState(406);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	 
		public Return_statementContext() { }
		public void copyFrom(Return_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Return_statementContext {
		public TerminalNode RETURN() { return getToken(ZetarianoParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_statement);
		int _la;
		try {
			_localctx = new ReturnStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(RETURN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
				{
				setState(409);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	 
		public Break_statementContext() { }
		public void copyFrom(Break_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends Break_statementContext {
		public TerminalNode BREAK() { return getToken(ZetarianoParser.BREAK, 0); }
		public BreakStatementContext(Break_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_break_statement);
		try {
			_localctx = new BreakStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	 
		public Continue_statementContext() { }
		public void copyFrom(Continue_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends Continue_statementContext {
		public TerminalNode CONTINUE() { return getToken(ZetarianoParser.CONTINUE, 0); }
		public ContinueStatementContext(Continue_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continue_statement);
		try {
			_localctx = new ContinueStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CONTINUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnStatementContext extends Print_statementContext {
		public TerminalNode PRINTLN() { return getToken(ZetarianoParser.PRINTLN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnStatementContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(ZetarianoParser.PRINT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_print_statement);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				_localctx = new PrintlnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(PRINTLN);
				setState(417);
				match(LEFT_PAREN);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
					{
					setState(418);
					expression(0);
					}
				}

				setState(421);
				match(RIGHT_PAREN);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(PRINT);
				setState(423);
				match(LEFT_PAREN);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
					{
					setState(424);
					expression(0);
					}
				}

				setState(427);
				match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Read_statementContext extends ParserRuleContext {
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
	 
		public Read_statementContext() { }
		public void copyFrom(Read_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadlnStatementContext extends Read_statementContext {
		public TerminalNode READLN() { return getToken(ZetarianoParser.READLN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public ReadlnStatementContext(Read_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterReadlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitReadlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitReadlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_read_statement);
		try {
			_localctx = new ReadlnStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(READLN);
			setState(431);
			match(LEFT_PAREN);
			setState(432);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimaryContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprPrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTernaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(ZetarianoParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ZetarianoParser.COLON, 0); }
		public ExprTernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public ExprParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultiplicativeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(ZetarianoParser.MULT, 0); }
		public TerminalNode SPLIT() { return getToken(ZetarianoParser.SPLIT, 0); }
		public TerminalNode MODULO() { return getToken(ZetarianoParser.MODULO, 0); }
		public ExprMultiplicativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ZetarianoParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(ZetarianoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ZetarianoParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(ZetarianoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ZetarianoParser.DECREMENT, 0); }
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ZetarianoParser.OR, 0); }
		public ExprLogicalOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MAJOR() { return getToken(ZetarianoParser.MAJOR, 0); }
		public TerminalNode MINOR() { return getToken(ZetarianoParser.MINOR, 0); }
		public TerminalNode MAJORTO() { return getToken(ZetarianoParser.MAJORTO, 0); }
		public TerminalNode MINORTO() { return getToken(ZetarianoParser.MINORTO, 0); }
		public ExprRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualityContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIC() { return getToken(ZetarianoParser.IDENTIC, 0); }
		public TerminalNode DIFF() { return getToken(ZetarianoParser.DIFF, 0); }
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAdditiveContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ZetarianoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ZetarianoParser.MINUS, 0); }
		public ExprAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ZetarianoParser.AND, 0); }
		public ExprLogicalAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostfixContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(ZetarianoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ZetarianoParser.DECREMENT, 0); }
		public ExprPostfixContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterExprPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitExprPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitExprPostfix(this);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(435);
				match(LEFT_PAREN);
				setState(436);
				expression(0);
				setState(437);
				match(RIGHT_PAREN);
				}
				break;
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case INTEGER:
			case DECIMAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				primary();
				}
				break;
			case PLUS:
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(440);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680088L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				expression(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(470);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultiplicativeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(445);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(446);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(448);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(449);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(451);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(452);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(453);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(454);
						_la = _input.LA(1);
						if ( !(_la==IDENTIC || _la==DIFF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(455);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprLogicalAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(457);
						match(AND);
						setState(458);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprLogicalOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(460);
						match(OR);
						setState(461);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(463);
						match(QUESTION);
						setState(464);
						expression(0);
						setState(465);
						match(COLON);
						setState(466);
						expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExprPostfixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(469);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
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
				setState(474);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStructAccessContext extends PrimaryContext {
		public Struct_accessContext struct_access() {
			return getRuleContext(Struct_accessContext.class,0);
		}
		public PrimaryStructAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryStructAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryStructAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryStructAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryIntegerContext extends PrimaryContext {
		public TerminalNode INTEGER() { return getToken(ZetarianoParser.INTEGER, 0); }
		public PrimaryIntegerContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryMethodCallContext extends PrimaryContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public PrimaryMethodCallContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryStringContext extends PrimaryContext {
		public TerminalNode STRING_LITERAL() { return getToken(ZetarianoParser.STRING_LITERAL, 0); }
		public PrimaryStringContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryCharContext extends PrimaryContext {
		public TerminalNode CHAR_LITERAL() { return getToken(ZetarianoParser.CHAR_LITERAL, 0); }
		public PrimaryCharContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryTrueContext extends PrimaryContext {
		public TerminalNode TRUE() { return getToken(ZetarianoParser.TRUE, 0); }
		public PrimaryTrueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNullContext extends PrimaryContext {
		public TerminalNode NULL() { return getToken(ZetarianoParser.NULL, 0); }
		public PrimaryNullContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryDecimalContext extends PrimaryContext {
		public TerminalNode DECIMAL() { return getToken(ZetarianoParser.DECIMAL, 0); }
		public PrimaryDecimalContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryFalseContext extends PrimaryContext {
		public TerminalNode FALSE() { return getToken(ZetarianoParser.FALSE, 0); }
		public PrimaryFalseContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryObjectCreationContext extends PrimaryContext {
		public Object_creationContext object_creation() {
			return getRuleContext(Object_creationContext.class,0);
		}
		public PrimaryObjectCreationContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryObjectCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryObjectCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryArrayAccessContext extends PrimaryContext {
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public PrimaryArrayAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryIdContext extends PrimaryContext {
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public PrimaryIdContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPrimaryId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPrimaryId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPrimaryId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new PrimaryIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new PrimaryDecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(DECIMAL);
				}
				break;
			case 3:
				_localctx = new PrimaryStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new PrimaryCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				match(CHAR_LITERAL);
				}
				break;
			case 5:
				_localctx = new PrimaryTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new PrimaryFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				match(FALSE);
				}
				break;
			case 7:
				_localctx = new PrimaryNullContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(481);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new PrimaryArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(482);
				array_access();
				}
				break;
			case 9:
				_localctx = new PrimaryStructAccessContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(483);
				struct_access();
				}
				break;
			case 10:
				_localctx = new PrimaryMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(484);
				method_call();
				}
				break;
			case 11:
				_localctx = new PrimaryIdContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(485);
				match(ID);
				}
				break;
			case 12:
				_localctx = new PrimaryObjectCreationContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(486);
				object_creation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_orContext extends ParserRuleContext {
		public Logical_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or; }
	 
		public Logical_orContext() { }
		public void copyFrom(Logical_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends Logical_orContext {
		public List<Logical_andContext> logical_and() {
			return getRuleContexts(Logical_andContext.class);
		}
		public Logical_andContext logical_and(int i) {
			return getRuleContext(Logical_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ZetarianoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ZetarianoParser.OR, i);
		}
		public LogicalOrContext(Logical_orContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_orContext logical_or() throws RecognitionException {
		Logical_orContext _localctx = new Logical_orContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logical_or);
		int _la;
		try {
			_localctx = new LogicalOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			logical_and();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(490);
				match(OR);
				setState(491);
				logical_and();
				}
				}
				setState(496);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_andContext extends ParserRuleContext {
		public Logical_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and; }
	 
		public Logical_andContext() { }
		public void copyFrom(Logical_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends Logical_andContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ZetarianoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ZetarianoParser.AND, i);
		}
		public LogicalAndContext(Logical_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_andContext logical_and() throws RecognitionException {
		Logical_andContext _localctx = new Logical_andContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logical_and);
		int _la;
		try {
			_localctx = new LogicalAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			equality();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(498);
				match(AND);
				setState(499);
				equality();
				}
				}
				setState(504);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityRelationalContext extends EqualityContext {
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public List<TerminalNode> IDENTIC() { return getTokens(ZetarianoParser.IDENTIC); }
		public TerminalNode IDENTIC(int i) {
			return getToken(ZetarianoParser.IDENTIC, i);
		}
		public List<TerminalNode> DIFF() { return getTokens(ZetarianoParser.DIFF); }
		public TerminalNode DIFF(int i) {
			return getToken(ZetarianoParser.DIFF, i);
		}
		public EqualityRelationalContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterEqualityRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitEqualityRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitEqualityRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equality);
		int _la;
		try {
			_localctx = new EqualityRelationalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			relational();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIC || _la==DIFF) {
				{
				setState(510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIC:
					{
					setState(506);
					match(IDENTIC);
					setState(507);
					relational();
					}
					break;
				case DIFF:
					{
					setState(508);
					match(DIFF);
					setState(509);
					relational();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(514);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ParserRuleContext {
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	 
		public RelationalContext() { }
		public void copyFrom(RelationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalAdditiveContext extends RelationalContext {
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public List<TerminalNode> MAJOR() { return getTokens(ZetarianoParser.MAJOR); }
		public TerminalNode MAJOR(int i) {
			return getToken(ZetarianoParser.MAJOR, i);
		}
		public List<TerminalNode> MINOR() { return getTokens(ZetarianoParser.MINOR); }
		public TerminalNode MINOR(int i) {
			return getToken(ZetarianoParser.MINOR, i);
		}
		public List<TerminalNode> MAJORTO() { return getTokens(ZetarianoParser.MAJORTO); }
		public TerminalNode MAJORTO(int i) {
			return getToken(ZetarianoParser.MAJORTO, i);
		}
		public List<TerminalNode> MINORTO() { return getTokens(ZetarianoParser.MINORTO); }
		public TerminalNode MINORTO(int i) {
			return getToken(ZetarianoParser.MINORTO, i);
		}
		public RelationalAdditiveContext(RelationalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterRelationalAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitRelationalAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitRelationalAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relational);
		int _la;
		try {
			_localctx = new RelationalAdditiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			additive();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) {
				{
				setState(524);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAJOR:
					{
					setState(516);
					match(MAJOR);
					setState(517);
					additive();
					}
					break;
				case MINOR:
					{
					setState(518);
					match(MINOR);
					setState(519);
					additive();
					}
					break;
				case MAJORTO:
					{
					setState(520);
					match(MAJORTO);
					setState(521);
					additive();
					}
					break;
				case MINORTO:
					{
					setState(522);
					match(MINORTO);
					setState(523);
					additive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(528);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
	 
		public AdditiveContext() { }
		public void copyFrom(AdditiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveMultiplicativeContext extends AdditiveContext {
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ZetarianoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ZetarianoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ZetarianoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ZetarianoParser.MINUS, i);
		}
		public AdditiveMultiplicativeContext(AdditiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterAdditiveMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitAdditiveMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitAdditiveMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_additive);
		int _la;
		try {
			_localctx = new AdditiveMultiplicativeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			multiplicative();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				multiplicative();
				}
				}
				setState(536);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeContext extends ParserRuleContext {
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
	 
		public MultiplicativeContext() { }
		public void copyFrom(MultiplicativeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeUnaryContext extends MultiplicativeContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ZetarianoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ZetarianoParser.MULT, i);
		}
		public List<TerminalNode> SPLIT() { return getTokens(ZetarianoParser.SPLIT); }
		public TerminalNode SPLIT(int i) {
			return getToken(ZetarianoParser.SPLIT, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(ZetarianoParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(ZetarianoParser.MODULO, i);
		}
		public MultiplicativeUnaryContext(MultiplicativeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterMultiplicativeUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitMultiplicativeUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitMultiplicativeUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicative);
		int _la;
		try {
			_localctx = new MultiplicativeUnaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			unary();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
				{
				{
				setState(538);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				unary();
				}
				}
				setState(544);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPostfixContext extends UnaryContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public UnaryPostfixContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterUnaryPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitUnaryPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitUnaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPrefixContext extends UnaryContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ZetarianoParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(ZetarianoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ZetarianoParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(ZetarianoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ZetarianoParser.DECREMENT, 0); }
		public UnaryPrefixContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterUnaryPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitUnaryPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitUnaryPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unary);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				_localctx = new UnaryPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680088L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				unary();
				}
				break;
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case INTEGER:
			case DECIMAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
				_localctx = new UnaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				postfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPrimaryContext extends PostfixContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(ZetarianoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ZetarianoParser.DECREMENT, 0); }
		public PostfixPrimaryContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterPostfixPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitPostfixPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitPostfixPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postfix);
		int _la;
		try {
			_localctx = new PostfixPrimaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			primary();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends Method_callContext {
		public TerminalNode ID() { return getToken(ZetarianoParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(ZetarianoParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(ZetarianoParser.RIGHT_PAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public MethodCallContext(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_method_call);
		int _la;
		try {
			_localctx = new MethodCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(ID);
			setState(555);
			match(LEFT_PAREN);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 8943022978306408451L) != 0)) {
				{
				setState(556);
				argument_list();
				}
			}

			setState(559);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	 
		public Argument_listContext() { }
		public void copyFrom(Argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends Argument_listContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ZetarianoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZetarianoParser.COMMA, i);
		}
		public ArgumentListContext(Argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZetarianoParserListener ) ((ZetarianoParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZetarianoParserVisitor ) return ((ZetarianoParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument_list);
		int _la;
		try {
			_localctx = new ArgumentListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			expression(0);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(562);
				match(COMMA);
				setState(563);
				expression(0);
				}
				}
				setState(568);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u023a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"f\b\u0002\n\u0002\f\u0002i\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"s\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0082\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u009a\b\b\u0001\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c3\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cf\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00de\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00eb\b\f\n\f\f\f\u00ee\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ff\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0105"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010c"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0113\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u011a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0128\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012f\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0135\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0138\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u013f\b\u000f\u000b\u000f\f\u000f\u0140"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0146\b\u0010\u000b\u0010"+
		"\f\u0010\u0147\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0151\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0159\b\u0012"+
		"\n\u0012\f\u0012\u015c\t\u0012\u0001\u0012\u0003\u0012\u015f\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0169\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0170\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0177\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u017b\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0183\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0189\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u019b\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01a4\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01aa\b\u001e\u0001\u001e\u0003\u001e\u01ad\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01bb\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u01d7\b \n \f \u01da\t \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01e8\b!\u0001\"\u0001\"\u0001\"\u0005\"\u01ed\b\"\n\"\f\"\u01f0\t\""+
		"\u0001#\u0001#\u0001#\u0005#\u01f5\b#\n#\f#\u01f8\t#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u01ff\b$\n$\f$\u0202\t$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u020d\b%\n%\f%\u0210\t%\u0001"+
		"&\u0001&\u0001&\u0005&\u0215\b&\n&\f&\u0218\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u021d\b\'\n\'\f\'\u0220\t\'\u0001(\u0001(\u0001(\u0003(\u0225"+
		"\b(\u0001)\u0001)\u0003)\u0229\b)\u0001*\u0001*\u0001*\u0003*\u022e\b"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u0235\b+\n+\f+\u0238\t+\u0001"+
		"+\u0000\u0001@,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0007"+
		"\u0002\u0000=>@A\u0002\u0000\u0003\u0004\u0015\u0017\u0001\u0000\u0005"+
		"\u0007\u0001\u0000\u0003\u0004\u0001\u0000\u000f\u0012\u0001\u0000\r\u000e"+
		"\u0001\u0000\u0016\u0017\u027a\u0000X\u0001\u0000\u0000\u0000\u0002[\u0001"+
		"\u0000\u0000\u0000\u0004g\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000"+
		"\u0000\bn\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0088\u0001"+
		"\u0000\u0000\u0000\u000e\u0090\u0001\u0000\u0000\u0000\u0010\u0099\u0001"+
		"\u0000\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000\u0014\u00c2\u0001"+
		"\u0000\u0000\u0000\u0016\u00e4\u0001\u0000\u0000\u0000\u0018\u00fe\u0001"+
		"\u0000\u0000\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0137\u0001"+
		"\u0000\u0000\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u0142\u0001\u0000"+
		"\u0000\u0000\"\u0149\u0001\u0000\u0000\u0000$\u0152\u0001\u0000\u0000"+
		"\u0000&\u0162\u0001\u0000\u0000\u0000(\u016a\u0001\u0000\u0000\u0000*"+
		"\u0171\u0001\u0000\u0000\u0000,\u0182\u0001\u0000\u0000\u0000.\u0184\u0001"+
		"\u0000\u0000\u00000\u0188\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000"+
		"\u00004\u0190\u0001\u0000\u0000\u00006\u0198\u0001\u0000\u0000\u00008"+
		"\u019c\u0001\u0000\u0000\u0000:\u019e\u0001\u0000\u0000\u0000<\u01ac\u0001"+
		"\u0000\u0000\u0000>\u01ae\u0001\u0000\u0000\u0000@\u01ba\u0001\u0000\u0000"+
		"\u0000B\u01e7\u0001\u0000\u0000\u0000D\u01e9\u0001\u0000\u0000\u0000F"+
		"\u01f1\u0001\u0000\u0000\u0000H\u01f9\u0001\u0000\u0000\u0000J\u0203\u0001"+
		"\u0000\u0000\u0000L\u0211\u0001\u0000\u0000\u0000N\u0219\u0001\u0000\u0000"+
		"\u0000P\u0224\u0001\u0000\u0000\u0000R\u0226\u0001\u0000\u0000\u0000T"+
		"\u022a\u0001\u0000\u0000\u0000V\u0231\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0002\u0001\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001\u0000\u0000"+
		"\u0000[\\\u0005#\u0000\u0000\\]\u0005$\u0000\u0000]^\u0005=\u0000\u0000"+
		"^_\u0005\u001f\u0000\u0000_`\u0003\u0004\u0002\u0000`a\u0005 \u0000\u0000"+
		"a\u0003\u0001\u0000\u0000\u0000bf\u0003\u0006\u0003\u0000cf\u0003\b\u0004"+
		"\u0000df\u0003\n\u0005\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0003\u0010\b\u0000kl\u0005=\u0000\u0000"+
		"lm\u0005\u001b\u0000\u0000m\u0007\u0001\u0000\u0000\u0000no\u0005#\u0000"+
		"\u0000op\u0005=\u0000\u0000pr\u0005!\u0000\u0000qs\u0003\f\u0006\u0000"+
		"rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0005\"\u0000\u0000uv\u0005\u001f\u0000\u0000vw\u0003\u0012\t"+
		"\u0000wx\u0005 \u0000\u0000x\t\u0001\u0000\u0000\u0000y|\u0005#\u0000"+
		"\u0000z}\u0005&\u0000\u0000{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"=\u0000\u0000\u007f\u0081\u0005!\u0000\u0000\u0080\u0082\u0003\f\u0006"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\"\u0000\u0000"+
		"\u0084\u0085\u0005\u001f\u0000\u0000\u0085\u0086\u0003\u0012\t\u0000\u0086"+
		"\u0087\u0005 \u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088\u008d"+
		"\u0003\u000e\u0007\u0000\u0089\u008a\u0005\u0019\u0000\u0000\u008a\u008c"+
		"\u0003\u000e\u0007\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0005="+
		"\u0000\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u009a\u00058\u0000"+
		"\u0000\u0094\u009a\u00059\u0000\u0000\u0095\u009a\u0005:\u0000\u0000\u0096"+
		"\u009a\u0005;\u0000\u0000\u0097\u009a\u0005<\u0000\u0000\u0098\u009a\u0005"+
		"=\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000"+
		"\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0014"+
		"\n\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005\u001b\u0000"+
		"\u0000\u00a3\u00c3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u001c\u000e"+
		"\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00c3\u0001\u0000\u0000"+
		"\u0000\u00a7\u00c3\u0003\"\u0011\u0000\u00a8\u00c3\u0003$\u0012\u0000"+
		"\u00a9\u00c3\u0003*\u0015\u0000\u00aa\u00c3\u00032\u0019\u0000\u00ab\u00c3"+
		"\u00034\u001a\u0000\u00ac\u00ad\u00036\u001b\u0000\u00ad\u00ae\u0005\u001b"+
		"\u0000\u0000\u00ae\u00c3\u0001\u0000\u0000\u0000\u00af\u00b0\u00038\u001c"+
		"\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0003:\u001d\u0000\u00b3\u00b4\u0005\u001b\u0000\u0000"+
		"\u00b4\u00c3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003<\u001e\u0000\u00b6"+
		"\u00b7\u0005\u001b\u0000\u0000\u00b7\u00c3\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0003>\u001f\u0000\u00b9\u00ba\u0005\u001b\u0000\u0000\u00ba\u00c3"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u001a\r\u0000\u00bc\u00bd\u0005"+
		"\u001b\u0000\u0000\u00bd\u00c3\u0001\u0000\u0000\u0000\u00be\u00bf\u0003"+
		"@ \u0000\u00bf\u00c0\u0005\u001b\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0005\u001b\u0000\u0000\u00c2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00c2\u00a4\u0001\u0000\u0000\u0000\u00c2\u00a7\u0001\u0000\u0000"+
		"\u0000\u00c2\u00a8\u0001\u0000\u0000\u0000\u00c2\u00a9\u0001\u0000\u0000"+
		"\u0000\u00c2\u00aa\u0001\u0000\u0000\u0000\u00c2\u00ab\u0001\u0000\u0000"+
		"\u0000\u00c2\u00ac\u0001\u0000\u0000\u0000\u00c2\u00af\u0001\u0000\u0000"+
		"\u0000\u00c2\u00b2\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c2\u00b8\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0010\b\u0000"+
		"\u00c5\u00c8\u0005=\u0000\u0000\u00c6\u00c7\u0005\b\u0000\u0000\u00c7"+
		"\u00c9\u0003@ \u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00e5\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003"+
		"\u0010\b\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc\u00ce\u0005\u001d"+
		"\u0000\u0000\u00cd\u00cf\u0005>\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0005\u001e\u0000\u0000\u00d1\u00d2\u0005\b\u0000\u0000"+
		"\u00d2\u00d4\u0003\u0018\f\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00e5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0003\u0010\b\u0000\u00d6\u00d7\u0005=\u0000\u0000\u00d7\u00d8"+
		"\u0005\u001d\u0000\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9\u00da"+
		"\u0005\u001e\u0000\u0000\u00da\u00dd\u0005\u001e\u0000\u0000\u00db\u00dc"+
		"\u0005\b\u0000\u0000\u00dc\u00de\u0003\u0018\f\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e5\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0003\u0010\b\u0000\u00e0\u00e1\u0005="+
		"\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u00e3\u0003\u001a\r"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00c4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00ca\u0001\u0000\u0000\u0000\u00e4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00df\u0001\u0000\u0000\u0000\u00e5\u0017\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u001f\u0000\u0000\u00e7\u00ec\u0003@ \u0000\u00e8"+
		"\u00e9\u0005\u0019\u0000\u0000\u00e9\u00eb\u0003@ \u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		" \u0000\u0000\u00f0\u00ff\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005%\u0000"+
		"\u0000\u00f2\u00f3\u0003\u0010\b\u0000\u00f3\u00f4\u0005\u001d\u0000\u0000"+
		"\u00f4\u00f5\u0005>\u0000\u0000\u00f5\u00f6\u0005\u001e\u0000\u0000\u00f6"+
		"\u00ff\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8\u00f9"+
		"\u0003\u0010\b\u0000\u00f9\u00fa\u0005\u001d\u0000\u0000\u00fa\u00fb\u0005"+
		"\u001d\u0000\u0000\u00fb\u00fc\u0005\u001e\u0000\u0000\u00fc\u00fd\u0005"+
		"\u001e\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00e6\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f1\u0001\u0000\u0000\u0000\u00fe\u00f7\u0001"+
		"\u0000\u0000\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"%\u0000\u0000\u0101\u0102\u0005=\u0000\u0000\u0102\u0104\u0005!\u0000"+
		"\u0000\u0103\u0105\u0003V+\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\"\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u010c"+
		"\u0005=\u0000\u0000\u0109\u010c\u0003\u001e\u000f\u0000\u010a\u010c\u0003"+
		" \u0010\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\b\u0000\u0000\u010e\u0138\u0003@ \u0000"+
		"\u010f\u0113\u0005=\u0000\u0000\u0110\u0113\u0003\u001e\u000f\u0000\u0111"+
		"\u0113\u0003 \u0010\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005\t\u0000\u0000\u0115\u0138\u0003"+
		"@ \u0000\u0116\u011a\u0005=\u0000\u0000\u0117\u011a\u0003\u001e\u000f"+
		"\u0000\u0118\u011a\u0003 \u0010\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005\n\u0000\u0000\u011c"+
		"\u0138\u0003@ \u0000\u011d\u0121\u0005=\u0000\u0000\u011e\u0121\u0003"+
		"\u001e\u000f\u0000\u011f\u0121\u0003 \u0010\u0000\u0120\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u000b"+
		"\u0000\u0000\u0123\u0138\u0003@ \u0000\u0124\u0128\u0005=\u0000\u0000"+
		"\u0125\u0128\u0003\u001e\u000f\u0000\u0126\u0128\u0003 \u0010\u0000\u0127"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\f\u0000\u0000\u012a\u0138\u0003@ \u0000\u012b\u012f\u0005"+
		"=\u0000\u0000\u012c\u012f\u0003\u001e\u000f\u0000\u012d\u012f\u0003 \u0010"+
		"\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0138\u0005\u0016\u0000\u0000\u0131\u0135\u0005=\u0000\u0000"+
		"\u0132\u0135\u0003\u001e\u000f\u0000\u0133\u0135\u0003 \u0010\u0000\u0134"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0005\u0017\u0000\u0000\u0137\u010b\u0001\u0000\u0000\u0000\u0137"+
		"\u0112\u0001\u0000\u0000\u0000\u0137\u0119\u0001\u0000\u0000\u0000\u0137"+
		"\u0120\u0001\u0000\u0000\u0000\u0137\u0127\u0001\u0000\u0000\u0000\u0137"+
		"\u012e\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138"+
		"\u001d\u0001\u0000\u0000\u0000\u0139\u013e\u0005=\u0000\u0000\u013a\u013b"+
		"\u0005\u001d\u0000\u0000\u013b\u013c\u0003@ \u0000\u013c\u013d\u0005\u001e"+
		"\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013a\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u001f\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0005=\u0000\u0000\u0143\u0144\u0005\u001a\u0000"+
		"\u0000\u0144\u0146\u0005=\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148!\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005(\u0000\u0000\u014a\u014b\u0005!\u0000\u0000\u014b\u014c\u0003"+
		"@ \u0000\u014c\u014d\u0005\"\u0000\u0000\u014d\u0150\u0003\u0014\n\u0000"+
		"\u014e\u014f\u0005)\u0000\u0000\u014f\u0151\u0003\u0014\n\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"#\u0001\u0000\u0000\u0000\u0152\u0153\u0005*\u0000\u0000\u0153\u0154\u0005"+
		"!\u0000\u0000\u0154\u0155\u0003@ \u0000\u0155\u0156\u0005\"\u0000\u0000"+
		"\u0156\u015a\u0005\u001f\u0000\u0000\u0157\u0159\u0003&\u0013\u0000\u0158"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d"+
		"\u015f\u0003(\u0014\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0005 \u0000\u0000\u0161%\u0001\u0000\u0000\u0000\u0162\u0163\u0005+"+
		"\u0000\u0000\u0163\u0164\u0007\u0000\u0000\u0000\u0164\u0165\u0005\u0018"+
		"\u0000\u0000\u0165\u0168\u0003\u0012\t\u0000\u0166\u0167\u0005-\u0000"+
		"\u0000\u0167\u0169\u0005\u001b\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\'\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0005,\u0000\u0000\u016b\u016c\u0005\u0018\u0000\u0000\u016c"+
		"\u016f\u0003\u0012\t\u0000\u016d\u016e\u0005-\u0000\u0000\u016e\u0170"+
		"\u0005\u001b\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170)\u0001\u0000\u0000\u0000\u0171\u0172\u0005"+
		"/\u0000\u0000\u0172\u0173\u0005!\u0000\u0000\u0173\u0174\u0003,\u0016"+
		"\u0000\u0174\u0176\u0005\u001b\u0000\u0000\u0175\u0177\u0003.\u0017\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0005\u001b\u0000\u0000"+
		"\u0179\u017b\u00030\u0018\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005\"\u0000\u0000\u017d\u017e\u0003\u0014\n\u0000\u017e+\u0001"+
		"\u0000\u0000\u0000\u017f\u0183\u0003\u0016\u000b\u0000\u0180\u0183\u0003"+
		"\u001c\u000e\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u017f\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001"+
		"\u0000\u0000\u0000\u0183-\u0001\u0000\u0000\u0000\u0184\u0185\u0003@ "+
		"\u0000\u0185/\u0001\u0000\u0000\u0000\u0186\u0189\u0003\u001c\u000e\u0000"+
		"\u0187\u0189\u0003@ \u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u01891\u0001\u0000\u0000\u0000\u018a\u018b\u0005"+
		"0\u0000\u0000\u018b\u018c\u0005!\u0000\u0000\u018c\u018d\u0003@ \u0000"+
		"\u018d\u018e\u0005\"\u0000\u0000\u018e\u018f\u0003\u0014\n\u0000\u018f"+
		"3\u0001\u0000\u0000\u0000\u0190\u0191\u00051\u0000\u0000\u0191\u0192\u0003"+
		"\u0014\n\u0000\u0192\u0193\u00050\u0000\u0000\u0193\u0194\u0005!\u0000"+
		"\u0000\u0194\u0195\u0003@ \u0000\u0195\u0196\u0005\"\u0000\u0000\u0196"+
		"\u0197\u0005\u001b\u0000\u0000\u01975\u0001\u0000\u0000\u0000\u0198\u019a"+
		"\u0005\'\u0000\u0000\u0199\u019b\u0003@ \u0000\u019a\u0199\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b7\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005-\u0000\u0000\u019d9\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005.\u0000\u0000\u019f;\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005"+
		"2\u0000\u0000\u01a1\u01a3\u0005!\u0000\u0000\u01a2\u01a4\u0003@ \u0000"+
		"\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01ad\u0005\"\u0000\u0000\u01a6"+
		"\u01a7\u00053\u0000\u0000\u01a7\u01a9\u0005!\u0000\u0000\u01a8\u01aa\u0003"+
		"@ \u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005\"\u0000\u0000"+
		"\u01ac\u01a0\u0001\u0000\u0000\u0000\u01ac\u01a6\u0001\u0000\u0000\u0000"+
		"\u01ad=\u0001\u0000\u0000\u0000\u01ae\u01af\u00054\u0000\u0000\u01af\u01b0"+
		"\u0005!\u0000\u0000\u01b0\u01b1\u0005\"\u0000\u0000\u01b1?\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0006 \uffff\uffff\u0000\u01b3\u01b4\u0005!\u0000"+
		"\u0000\u01b4\u01b5\u0003@ \u0000\u01b5\u01b6\u0005\"\u0000\u0000\u01b6"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b7\u01bb\u0003B!\u0000\u01b8\u01b9\u0007"+
		"\u0001\u0000\u0000\u01b9\u01bb\u0003@ \b\u01ba\u01b2\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bb\u01d8\u0001\u0000\u0000\u0000\u01bc\u01bd\n\u0007\u0000\u0000"+
		"\u01bd\u01be\u0007\u0002\u0000\u0000\u01be\u01d7\u0003@ \b\u01bf\u01c0"+
		"\n\u0006\u0000\u0000\u01c0\u01c1\u0007\u0003\u0000\u0000\u01c1\u01d7\u0003"+
		"@ \u0007\u01c2\u01c3\n\u0005\u0000\u0000\u01c3\u01c4\u0007\u0004\u0000"+
		"\u0000\u01c4\u01d7\u0003@ \u0006\u01c5\u01c6\n\u0004\u0000\u0000\u01c6"+
		"\u01c7\u0007\u0005\u0000\u0000\u01c7\u01d7\u0003@ \u0005\u01c8\u01c9\n"+
		"\u0003\u0000\u0000\u01c9\u01ca\u0005\u0013\u0000\u0000\u01ca\u01d7\u0003"+
		"@ \u0004\u01cb\u01cc\n\u0002\u0000\u0000\u01cc\u01cd\u0005\u0014\u0000"+
		"\u0000\u01cd\u01d7\u0003@ \u0003\u01ce\u01cf\n\u0001\u0000\u0000\u01cf"+
		"\u01d0\u0005\u001c\u0000\u0000\u01d0\u01d1\u0003@ \u0000\u01d1\u01d2\u0005"+
		"\u0018\u0000\u0000\u01d2\u01d3\u0003@ \u0002\u01d3\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\n\t\u0000\u0000\u01d5\u01d7\u0007\u0006\u0000\u0000"+
		"\u01d6\u01bc\u0001\u0000\u0000\u0000\u01d6\u01bf\u0001\u0000\u0000\u0000"+
		"\u01d6\u01c2\u0001\u0000\u0000\u0000\u01d6\u01c5\u0001\u0000\u0000\u0000"+
		"\u01d6\u01c8\u0001\u0000\u0000\u0000\u01d6\u01cb\u0001\u0000\u0000\u0000"+
		"\u01d6\u01ce\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9A\u0001\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01db\u01e8\u0005>\u0000\u0000\u01dc\u01e8"+
		"\u0005?\u0000\u0000\u01dd\u01e8\u0005@\u0000\u0000\u01de\u01e8\u0005A"+
		"\u0000\u0000\u01df\u01e8\u00055\u0000\u0000\u01e0\u01e8\u00056\u0000\u0000"+
		"\u01e1\u01e8\u00057\u0000\u0000\u01e2\u01e8\u0003\u001e\u000f\u0000\u01e3"+
		"\u01e8\u0003 \u0010\u0000\u01e4\u01e8\u0003T*\u0000\u01e5\u01e8\u0005"+
		"=\u0000\u0000\u01e6\u01e8\u0003\u001a\r\u0000\u01e7\u01db\u0001\u0000"+
		"\u0000\u0000\u01e7\u01dc\u0001\u0000\u0000\u0000\u01e7\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e7\u01de\u0001\u0000\u0000\u0000\u01e7\u01df\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e0\u0001\u0000\u0000\u0000\u01e7\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e7\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8C\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ee\u0003F#\u0000\u01ea\u01eb\u0005\u0014\u0000\u0000\u01eb"+
		"\u01ed\u0003F#\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01efE\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f6\u0003H$\u0000\u01f2\u01f3\u0005\u0013\u0000\u0000"+
		"\u01f3\u01f5\u0003H$\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7G\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f9\u0200\u0003J%\u0000\u01fa\u01fb\u0005\r\u0000"+
		"\u0000\u01fb\u01ff\u0003J%\u0000\u01fc\u01fd\u0005\u000e\u0000\u0000\u01fd"+
		"\u01ff\u0003J%\u0000\u01fe\u01fa\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201I\u0001\u0000"+
		"\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u020e\u0003L&\u0000"+
		"\u0204\u0205\u0005\u0012\u0000\u0000\u0205\u020d\u0003L&\u0000\u0206\u0207"+
		"\u0005\u0011\u0000\u0000\u0207\u020d\u0003L&\u0000\u0208\u0209\u0005\u000f"+
		"\u0000\u0000\u0209\u020d\u0003L&\u0000\u020a\u020b\u0005\u0010\u0000\u0000"+
		"\u020b\u020d\u0003L&\u0000\u020c\u0204\u0001\u0000\u0000\u0000\u020c\u0206"+
		"\u0001\u0000\u0000\u0000\u020c\u0208\u0001\u0000\u0000\u0000\u020c\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020fK\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0216\u0003"+
		"N\'\u0000\u0212\u0213\u0007\u0003\u0000\u0000\u0213\u0215\u0003N\'\u0000"+
		"\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000"+
		"\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000"+
		"\u0217M\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219"+
		"\u021e\u0003P(\u0000\u021a\u021b\u0007\u0002\u0000\u0000\u021b\u021d\u0003"+
		"P(\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000"+
		"\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000"+
		"\u0000\u021fO\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0007\u0001\u0000\u0000\u0222\u0225\u0003P(\u0000\u0223\u0225"+
		"\u0003R)\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000"+
		"\u0000\u0000\u0225Q\u0001\u0000\u0000\u0000\u0226\u0228\u0003B!\u0000"+
		"\u0227\u0229\u0007\u0006\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229S\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005=\u0000\u0000\u022b\u022d\u0005!\u0000\u0000\u022c\u022e\u0003"+
		"V+\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0005\"\u0000\u0000"+
		"\u0230U\u0001\u0000\u0000\u0000\u0231\u0236\u0003@ \u0000\u0232\u0233"+
		"\u0005\u0019\u0000\u0000\u0233\u0235\u0003@ \u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237W\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u00008egr|\u0081\u008d\u0099\u009e"+
		"\u00c2\u00c8\u00ce\u00d3\u00dd\u00e4\u00ec\u00fe\u0104\u010b\u0112\u0119"+
		"\u0120\u0127\u012e\u0134\u0137\u0140\u0147\u0150\u015a\u015e\u0168\u016f"+
		"\u0176\u017a\u0182\u0188\u019a\u01a3\u01a9\u01ac\u01ba\u01d6\u01d8\u01e7"+
		"\u01ee\u01f6\u01fe\u0200\u020c\u020e\u0216\u021e\u0224\u0228\u022d\u0236";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}