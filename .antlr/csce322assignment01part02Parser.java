// Generated from /Users/lramirez5/Documents/csce322/csce322assignment01part02.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part02Parser extends Parser {
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
		RULE_error = 18, RULE_endOfFile = 19;
	public static final String[] ruleNames = {
		"connectFour", "moves", "game", "row", "lastrow", "column", "gameNum", 
		"hyphen", "move", "moveTitle", "gameTitle", "endRow", "beginSection", 
		"endSection", "beginGame", "endGame", "beginMoves", "endMoves", "error", 
		"endOfFile"
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
	public String getGrammarFileName() { return "csce322assignment01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int pieces = 0;
	    boolean inputValid = true;
	    int rowCounter = 1;
	    int colCounter = 0;
	    int numMoves = 0; 
	    int playersPresent = 0;

	public csce322assignment01part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConnectFourContext extends ParserRuleContext {
		public List<EndOfFileContext> endOfFile() {
			return getRuleContexts(EndOfFileContext.class);
		}
		public EndOfFileContext endOfFile(int i) {
			return getRuleContext(EndOfFileContext.class,i);
		}
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(40);
					game();
					setState(41);
					moves();
					}
					setState(43);
					endOfFile();
					}
					break;
				case 2:
					{
					{
					setState(45);
					moves();
					setState(46);
					game();
					}
					}
					break;
				}
				setState(50);
				endOfFile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				moveTitle();
				setState(56);
				beginSection();
				setState(57);
				beginMoves();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(58);
						move();
						setState(59);
						match(T__0);
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(66);
				move();
				setState(67);
				endMoves();
				setState(68);
				endSection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
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
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				gameTitle();
				setState(74);
				beginSection();
				setState(75);
				beginGame();
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(76);
						row();
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(82);
				lastrow();
				setState(83);
				endGame();
				setState(84);
				endSection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
			setState(90); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					column();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(94);
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
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					column();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				gameNum();
				}
				break;
			case 2:
				{
				setState(102);
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
		public TerminalNode MOVE() { return getToken(csce322assignment01part02Parser.MOVE, 0); }
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				((GameNumContext)_localctx).MOVE = match(MOVE);

				    colCounter++;
				    pieces++;
				    if(Integer.parseInt((((GameNumContext)_localctx).MOVE!=null?((GameNumContext)_localctx).MOVE.getText():null)) > playersPresent ){
				        playersPresent = Integer.parseInt((((GameNumContext)_localctx).MOVE!=null?((GameNumContext)_localctx).MOVE.getText():null));
				    }
				    
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		public TerminalNode GAME() { return getToken(csce322assignment01part02Parser.GAME, 0); }
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(GAME);
				colCounter++;
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
		public TerminalNode MOVE() { return getToken(csce322assignment01part02Parser.MOVE, 0); }
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((MoveContext)_localctx).MOVE = match(MOVE);

				    if(Integer.parseInt((((MoveContext)_localctx).MOVE!=null?((MoveContext)_localctx).MOVE.getText():null)) > numMoves){
				        numMoves = Integer.parseInt((((MoveContext)_localctx).MOVE!=null?((MoveContext)_localctx).MOVE.getText():null));
				    }

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
		public TerminalNode MOVETITLE() { return getToken(csce322assignment01part02Parser.MOVETITLE, 0); }
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVETITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(MOVETITLE);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
		public TerminalNode GAMETITLE() { return getToken(csce322assignment01part02Parser.GAMETITLE, 0); }
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMETITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(GAMETITLE);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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
		public TerminalNode ROWEND() { return getToken(csce322assignment01part02Parser.ROWEND, 0); }
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ROWEND);
				rowCounter++;
				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
		public TerminalNode BEGIN() { return getToken(csce322assignment01part02Parser.BEGIN, 0); }
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(BEGIN);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		public TerminalNode END() { return getToken(csce322assignment01part02Parser.END, 0); }
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(END);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		public TerminalNode GAMEBEGIN() { return getToken(csce322assignment01part02Parser.GAMEBEGIN, 0); }
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(GAMEBEGIN);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
		public TerminalNode GAMEEND() { return getToken(csce322assignment01part02Parser.GAMEEND, 0); }
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAMEEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(GAMEEND);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		public TerminalNode MOVEBEGIN() { return getToken(csce322assignment01part02Parser.MOVEBEGIN, 0); }
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(MOVEBEGIN);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
		public TerminalNode MOVEENDING() { return getToken(csce322assignment01part02Parser.MOVEENDING, 0); }
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVEENDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(MOVEENDING);

				}
				break;
			case ERRORTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		public TerminalNode ERRORTOKEN() { return getToken(csce322assignment01part02Parser.ERRORTOKEN, 0); }
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
			setState(165);
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

	public static class EndOfFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322assignment01part02Parser.EOF, 0); }
		public EndOfFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfFile; }
	}

	public final EndOfFileContext endOfFile() throws RecognitionException {
		EndOfFileContext _localctx = new EndOfFileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_endOfFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(EOF);

			    colCounter = colCounter / rowCounter;
			    if(playersPresent < 2){
			        System.out.println("SEMANTIC PROBLEM 1");
			        inputValid = false;
			    }
			    if(rowCounter < 6 || rowCounter > 10 ){
			        System.out.println("SEMANTIC PROBLEM 2");
			        inputValid = false;
			    }
			    if(colCounter < 6 || colCounter > 10){
			        System.out.println("SEMANTIC PROBLEM 3");
			        inputValid = false;
			    }
			    if(numMoves > colCounter){
			        System.out.println("SEMANTIC PROBLEM 4");
			        inputValid = false;
			    }
			    if(inputValid == true ){
			        System.out.println(pieces + " pieces have been played");
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\2\3\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\6\6\6"+
		"d\n\6\r\6\16\6e\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\5\t"+
		"t\n\t\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17"+
		"\3\17\5\17\u0092\n\17\3\20\3\20\3\20\5\20\u0097\n\20\3\21\3\21\3\21\5"+
		"\21\u009c\n\21\3\22\3\22\3\22\5\22\u00a1\n\22\3\23\3\23\3\23\5\23\u00a6"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\2\2\u00ae\2\67\3\2\2\2\4I\3\2\2\2\6Y\3\2\2\2\b"+
		"\\\3\2\2\2\nc\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20s\3\2\2\2\22x\3\2\2\2\24"+
		"}\3\2\2\2\26\u0082\3\2\2\2\30\u0087\3\2\2\2\32\u008c\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u0096\3\2\2\2 \u009b\3\2\2\2\"\u00a0\3\2\2\2$\u00a5\3\2\2"+
		"\2&\u00a7\3\2\2\2(\u00aa\3\2\2\2*+\5\6\4\2+,\5\4\3\2,-\3\2\2\2-.\5(\25"+
		"\2.\63\3\2\2\2/\60\5\4\3\2\60\61\5\6\4\2\61\63\3\2\2\2\62*\3\2\2\2\62"+
		"/\3\2\2\2\63\64\3\2\2\2\64\65\5(\25\2\658\3\2\2\2\668\5&\24\2\67\62\3"+
		"\2\2\2\67\66\3\2\2\28\3\3\2\2\29:\5\24\13\2:;\5\32\16\2;A\5\"\22\2<=\5"+
		"\22\n\2=>\7\3\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD"+
		"\3\2\2\2CA\3\2\2\2DE\5\22\n\2EF\5$\23\2FG\5\34\17\2GJ\3\2\2\2HJ\5&\24"+
		"\2I9\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\5\26\f\2LM\5\32\16\2MQ\5\36\20\2N"+
		"P\5\b\5\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2"+
		"TU\5\n\6\2UV\5 \21\2VW\5\34\17\2WZ\3\2\2\2XZ\5&\24\2YK\3\2\2\2YX\3\2\2"+
		"\2Z\7\3\2\2\2[]\5\f\7\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\5\30\r\2a\t\3\2\2\2bd\5\f\7\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2f\13\3\2\2\2gj\5\16\b\2hj\5\20\t\2ig\3\2\2\2ih\3\2\2\2j\r\3\2"+
		"\2\2kl\7\b\2\2lo\b\b\1\2mo\5&\24\2nk\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\7"+
		"\t\2\2qt\b\t\1\2rt\5&\24\2sp\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uv\7\b\2\2v"+
		"y\b\n\1\2wy\5&\24\2xu\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\7\6\2\2{~\b\13\1"+
		"\2|~\5&\24\2}z\3\2\2\2}|\3\2\2\2~\25\3\2\2\2\177\u0080\7\7\2\2\u0080\u0083"+
		"\b\f\1\2\u0081\u0083\5&\24\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\27\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0088\b\r\1\2\u0086\u0088\5&\24"+
		"\2\u0087\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a"+
		"\7\4\2\2\u008a\u008d\b\16\1\2\u008b\u008d\5&\24\2\u008c\u0089\3\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\33\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0092"+
		"\b\17\1\2\u0090\u0092\5&\24\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\35\3\2\2\2\u0093\u0094\7\13\2\2\u0094\u0097\b\20\1\2\u0095\u0097"+
		"\5&\24\2\u0096\u0093\3\2\2\2\u0096\u0095\3\2\2\2\u0097\37\3\2\2\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009c\b\21\1\2\u009a\u009c\5&\24\2\u009b\u0098\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c!\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u00a1"+
		"\b\22\1\2\u009f\u00a1\5&\24\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1#\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a6\b\23\1\2\u00a4\u00a6"+
		"\5&\24\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6%\3\2\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\b\24\1\2\u00a9\'\3\2\2\2\u00aa\u00ab\7\2\2"+
		"\3\u00ab\u00ac\b\25\1\2\u00ac)\3\2\2\2\27\62\67AIQY^einsx}\u0082\u0087"+
		"\u008c\u0091\u0096\u009b\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}