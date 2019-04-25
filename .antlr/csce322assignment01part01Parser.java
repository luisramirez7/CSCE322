// Generated from /Users/lramirez5/Documents/csce322/csce322assignment01part01.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGIN=2, END=3, MOVETITLE=4, GAMETITLE=5, MOVE=6, GAME=7, ROWEND=8, 
		GAMEBEGIN=9, GAMEEND=10, MOVEBEGIN=11, MOVEENDING=12, WS=13, ERRORTOKEN=14;
	public static final int
		RULE_connectFour = 0, RULE_moves = 1, RULE_game = 2, RULE_row = 3, RULE_lastrow = 4, 
		RULE_column = 5, RULE_gameNum = 6, RULE_hyphen = 7, RULE_move = 8, RULE_moveTitle = 9, 
		RULE_gameTitle = 10, RULE_endRow = 11, RULE_beginSection = 12, RULE_endSection = 13, 
		RULE_beginGame = 14, RULE_endGame = 15, RULE_beginMoves = 16, RULE_endMoves = 17, 
		RULE_error = 18;
	public static final String[] ruleNames = {
		"connectFour", "moves", "game", "row", "lastrow", "column", "gameNum", 
		"hyphen", "move", "moveTitle", "gameTitle", "endRow", "beginSection", 
		"endSection", "beginGame", "endGame", "beginMoves", "endMoves", "error"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'/*'", "'*/'", "'moves'", "'game'", null, "'-'", "'|'", 
		"'['", "']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BEGIN", "END", "MOVETITLE", "GAMETITLE", "MOVE", "GAME", 
		"ROWEND", "GAMEBEGIN", "GAMEEND", "MOVEBEGIN", "MOVEENDING", "WS", "ERRORTOKEN"
	};
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
	public String getGrammarFileName() { return "csce322assignment01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322assignment01part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConnectFourContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322assignment01part01Parser.EOF, 0); }
		public GameContext game() {
			return getRuleContext(GameContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ConnectFourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectFour; }
	}

	public final ConnectFourContext connectFour() throws RecognitionException {
		ConnectFourContext _localctx = new ConnectFourContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_connectFour);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(38);
					game();
					setState(39);
					moves();
					}
					}
					break;
				case 2:
					{
					{
					setState(41);
					moves();
					setState(42);
					game();
					}
					}
					break;
				}
				setState(46);
				match(EOF);
				System.out.println("End of File");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				error();
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

	public static class MovesContext extends ParserRuleContext {
		public MoveTitleContext moveTitle() {
			return getRuleContext(MoveTitleContext.class,0);
		}
		public BeginSectionContext beginSection() {
			return getRuleContext(BeginSectionContext.class,0);
		}
		public BeginMovesContext beginMoves() {
			return getRuleContext(BeginMovesContext.class,0);
		}
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public EndMovesContext endMoves() {
			return getRuleContext(EndMovesContext.class,0);
		}
		public EndSectionContext endSection() {
			return getRuleContext(EndSectionContext.class,0);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moves);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			moveTitle();
			setState(53);
			beginSection();
			setState(54);
			beginMoves();
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					move();
					setState(56);
					match(T__0);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			move();
			setState(64);
			endMoves();
			setState(65);
			endSection();
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

	public static class GameContext extends ParserRuleContext {
		public GameTitleContext gameTitle() {
			return getRuleContext(GameTitleContext.class,0);
		}
		public BeginSectionContext beginSection() {
			return getRuleContext(BeginSectionContext.class,0);
		}
		public BeginGameContext beginGame() {
			return getRuleContext(BeginGameContext.class,0);
		}
		public LastrowContext lastrow() {
			return getRuleContext(LastrowContext.class,0);
		}
		public EndGameContext endGame() {
			return getRuleContext(EndGameContext.class,0);
		}
		public EndSectionContext endSection() {
			return getRuleContext(EndSectionContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_game);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			gameTitle();
			setState(68);
			beginSection();
			setState(69);
			beginGame();
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					row();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(76);
			lastrow();
			setState(77);
			endGame();
			setState(78);
			endSection();
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

	public static class RowContext extends ParserRuleContext {
		public EndRowContext endRow() {
			return getRuleContext(EndRowContext.class,0);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					column();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(85);
			endRow();
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

	public static class LastrowContext extends ParserRuleContext {
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public LastrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastrow; }
	}

	public final LastrowContext lastrow() throws RecognitionException {
		LastrowContext _localctx = new LastrowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lastrow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(87);
					column();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ColumnContext extends ParserRuleContext {
		public GameNumContext gameNum() {
			return getRuleContext(GameNumContext.class,0);
		}
		public HyphenContext hyphen() {
			return getRuleContext(HyphenContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(92);
				gameNum();
				}
				break;
			case 2:
				{
				setState(93);
				hyphen();
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

	public static class GameNumContext extends ParserRuleContext {
		public Token MOVE;
		public TerminalNode MOVE() { return getToken(csce322assignment01part01Parser.MOVE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public GameNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameNum; }
	}

	public final GameNumContext gameNum() throws RecognitionException {
		GameNumContext _localctx = new GameNumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gameNum);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((GameNumContext)_localctx).MOVE = match(MOVE);
				System.out.println("Number: " + (((GameNumContext)_localctx).MOVE!=null?((GameNumContext)_localctx).MOVE.getText():null));
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				error();
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

	public static class HyphenContext extends ParserRuleContext {
		public TerminalNode GAME() { return getToken(csce322assignment01part01Parser.GAME, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public HyphenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen; }
	}

	public final HyphenContext hyphen() throws RecognitionException {
		HyphenContext _localctx = new HyphenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hyphen);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(GAME);
				System.out.println("Space: Empty");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				error();
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

	public static class MoveContext extends ParserRuleContext {
		public Token MOVE;
		public TerminalNode MOVE() { return getToken(csce322assignment01part01Parser.MOVE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_move);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((MoveContext)_localctx).MOVE = match(MOVE);
				System.out.println("Number: " + (((MoveContext)_localctx).MOVE!=null?((MoveContext)_localctx).MOVE.getText():null));
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				error();
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

	public static class MoveTitleContext extends ParserRuleContext {
		public TerminalNode MOVETITLE() { return getToken(csce322assignment01part01Parser.MOVETITLE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MoveTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveTitle; }
	}

	public final MoveTitleContext moveTitle() throws RecognitionException {
		MoveTitleContext _localctx = new MoveTitleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moveTitle);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVETITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(MOVETITLE);
				System.out.println("Moves Section");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				error();
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

	public static class GameTitleContext extends ParserRuleContext {
		public TerminalNode GAMETITLE() { return getToken(csce322assignment01part01Parser.GAMETITLE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public GameTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameTitle; }
	}

	public final GameTitleContext gameTitle() throws RecognitionException {
		GameTitleContext _localctx = new GameTitleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_gameTitle);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMETITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(GAMETITLE);
				System.out.println("Game Section");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				error();
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

	public static class EndRowContext extends ParserRuleContext {
		public TerminalNode ROWEND() { return getToken(csce322assignment01part01Parser.ROWEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endRow; }
	}

	public final EndRowContext endRow() throws RecognitionException {
		EndRowContext _localctx = new EndRowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endRow);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ROWEND);
				System.out.println("End of Row");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				error();
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

	public static class BeginSectionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(csce322assignment01part01Parser.BEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public BeginSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginSection; }
	}

	public final BeginSectionContext beginSection() throws RecognitionException {
		BeginSectionContext _localctx = new BeginSectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_beginSection);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(BEGIN);
				System.out.println("Beginning of Section");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				error();
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

	public static class EndSectionContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(csce322assignment01part01Parser.END, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endSection; }
	}

	public final EndSectionContext endSection() throws RecognitionException {
		EndSectionContext _localctx = new EndSectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endSection);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(END);
				System.out.println("End of Section");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				error();
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

	public static class BeginGameContext extends ParserRuleContext {
		public TerminalNode GAMEBEGIN() { return getToken(csce322assignment01part01Parser.GAMEBEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public BeginGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginGame; }
	}

	public final BeginGameContext beginGame() throws RecognitionException {
		BeginGameContext _localctx = new BeginGameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_beginGame);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(GAMEBEGIN);
				System.out.println("Start of Game");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				error();
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

	public static class EndGameContext extends ParserRuleContext {
		public TerminalNode GAMEEND() { return getToken(csce322assignment01part01Parser.GAMEEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endGame; }
	}

	public final EndGameContext endGame() throws RecognitionException {
		EndGameContext _localctx = new EndGameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endGame);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMEEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(GAMEEND);
				System.out.println("End of Game");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				error();
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

	public static class BeginMovesContext extends ParserRuleContext {
		public TerminalNode MOVEBEGIN() { return getToken(csce322assignment01part01Parser.MOVEBEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public BeginMovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginMoves; }
	}

	public final BeginMovesContext beginMoves() throws RecognitionException {
		BeginMovesContext _localctx = new BeginMovesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_beginMoves);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(MOVEBEGIN);
				 System.out.println("Beginning of List");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				error();
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

	public static class EndMovesContext extends ParserRuleContext {
		public TerminalNode MOVEENDING() { return getToken(csce322assignment01part01Parser.MOVEENDING, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndMovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endMoves; }
	}

	public final EndMovesContext endMoves() throws RecognitionException {
		EndMovesContext _localctx = new EndMovesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_endMoves);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVEENDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(MOVEENDING);
				System.out.println("End of List");
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				error();
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

	public static class ErrorContext extends ParserRuleContext {
		public Token ERRORTOKEN;
		public TerminalNode ERRORTOKEN() { return getToken(csce322assignment01part01Parser.ERRORTOKEN, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((ErrorContext)_localctx).ERRORTOKEN = match(ERRORTOKEN);
			System.out.println("SYNTAX PROBLEM ON LINE " + (((ErrorContext)_localctx).ERRORTOKEN!=null?((ErrorContext)_localctx).ERRORTOKEN.getLine():0)); System.exit(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\2\3\2\3\2\3\2"+
		"\5\2\65\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\4\3\4\3\5\6\5"+
		"T\n\5\r\5\16\5U\3\5\3\5\3\6\6\6[\n\6\r\6\16\6\\\3\7\3\7\5\7a\n\7\3\b\3"+
		"\b\3\b\5\bf\n\b\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3"+
		"\13\5\13u\n\13\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16"+
		"\3\16\5\16\u0084\n\16\3\17\3\17\3\17\5\17\u0089\n\17\3\20\3\20\3\20\5"+
		"\20\u008e\n\20\3\21\3\21\3\21\5\21\u0093\n\21\3\22\3\22\3\22\5\22\u0098"+
		"\n\22\3\23\3\23\3\23\5\23\u009d\n\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00a1\2\64\3\2\2\2\4\66\3"+
		"\2\2\2\6E\3\2\2\2\bS\3\2\2\2\nZ\3\2\2\2\f`\3\2\2\2\16e\3\2\2\2\20j\3\2"+
		"\2\2\22o\3\2\2\2\24t\3\2\2\2\26y\3\2\2\2\30~\3\2\2\2\32\u0083\3\2\2\2"+
		"\34\u0088\3\2\2\2\36\u008d\3\2\2\2 \u0092\3\2\2\2\"\u0097\3\2\2\2$\u009c"+
		"\3\2\2\2&\u009e\3\2\2\2()\5\6\4\2)*\5\4\3\2*/\3\2\2\2+,\5\4\3\2,-\5\6"+
		"\4\2-/\3\2\2\2.(\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60\61\7\2\2\3\61\62\b\2"+
		"\1\2\62\65\3\2\2\2\63\65\5&\24\2\64.\3\2\2\2\64\63\3\2\2\2\65\3\3\2\2"+
		"\2\66\67\5\24\13\2\678\5\32\16\28>\5\"\22\29:\5\22\n\2:;\7\3\2\2;=\3\2"+
		"\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\5\22"+
		"\n\2BC\5$\23\2CD\5\34\17\2D\5\3\2\2\2EF\5\26\f\2FG\5\32\16\2GK\5\36\20"+
		"\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NO\5\n\6\2OP\5 \21\2PQ\5\34\17\2Q\7\3\2\2\2RT\5\f\7\2SR\3\2\2\2TU\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\30\r\2X\t\3\2\2\2Y[\5\f\7\2Z"+
		"Y\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^a\5\16\b\2_a\5"+
		"\20\t\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bc\7\b\2\2cf\b\b\1\2df\5&\24\2e"+
		"b\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\7\t\2\2hk\b\t\1\2ik\5&\24\2jg\3\2\2"+
		"\2ji\3\2\2\2k\21\3\2\2\2lm\7\b\2\2mp\b\n\1\2np\5&\24\2ol\3\2\2\2on\3\2"+
		"\2\2p\23\3\2\2\2qr\7\6\2\2ru\b\13\1\2su\5&\24\2tq\3\2\2\2ts\3\2\2\2u\25"+
		"\3\2\2\2vw\7\7\2\2wz\b\f\1\2xz\5&\24\2yv\3\2\2\2yx\3\2\2\2z\27\3\2\2\2"+
		"{|\7\n\2\2|\177\b\r\1\2}\177\5&\24\2~{\3\2\2\2~}\3\2\2\2\177\31\3\2\2"+
		"\2\u0080\u0081\7\4\2\2\u0081\u0084\b\16\1\2\u0082\u0084\5&\24\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084\33\3\2\2\2\u0085\u0086\7\5\2"+
		"\2\u0086\u0089\b\17\1\2\u0087\u0089\5&\24\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\35\3\2\2\2\u008a\u008b\7\13\2\2\u008b\u008e\b\20"+
		"\1\2\u008c\u008e\5&\24\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\37\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0093\b\21\1\2\u0091\u0093\5&\24"+
		"\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093!\3\2\2\2\u0094\u0095"+
		"\7\r\2\2\u0095\u0098\b\22\1\2\u0096\u0098\5&\24\2\u0097\u0094\3\2\2\2"+
		"\u0097\u0096\3\2\2\2\u0098#\3\2\2\2\u0099\u009a\7\16\2\2\u009a\u009d\b"+
		"\23\1\2\u009b\u009d\5&\24\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"%\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\b\24\1\2\u00a0\'\3\2\2\2\25"+
		".\64>KU\\`ejoty~\u0083\u0088\u008d\u0092\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}