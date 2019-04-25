// Generated from /Users/lramirez5/Documents/csce322/csce322assignment01part02.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGIN=2, END=3, MOVETITLE=4, GAMETITLE=5, MOVE=6, GAME=7, ROWEND=8, 
		GAMEBEGIN=9, GAMEEND=10, MOVEBEGIN=11, MOVEENDING=12, WS=13, ERRORTOKEN=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "BEGIN", "END", "MOVETITLE", "GAMETITLE", "MOVE", "GAME", "ROWEND", 
		"GAMEBEGIN", "GAMEEND", "MOVEBEGIN", "MOVEENDING", "WS", "ERRORTOKEN"
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


	public csce322assignment01part01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322assignment01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\6\7\64\n\7\r\7\16\7"+
		"\65\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16E\n\16"+
		"\r\16\16\16F\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\4\3\2\62;\5\2\13\f\17\17\""+
		"\"\2M\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7"+
		"$\3\2\2\2\t\'\3\2\2\2\13-\3\2\2\2\r\63\3\2\2\2\17\67\3\2\2\2\219\3\2\2"+
		"\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33D\3\2\2\2\35J\3\2"+
		"\2\2\37 \7a\2\2 \4\3\2\2\2!\"\7\61\2\2\"#\7,\2\2#\6\3\2\2\2$%\7,\2\2%"+
		"&\7\61\2\2&\b\3\2\2\2\'(\7o\2\2()\7q\2\2)*\7x\2\2*+\7g\2\2+,\7u\2\2,\n"+
		"\3\2\2\2-.\7i\2\2./\7c\2\2/\60\7o\2\2\60\61\7g\2\2\61\f\3\2\2\2\62\64"+
		"\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\16"+
		"\3\2\2\2\678\7/\2\28\20\3\2\2\29:\7~\2\2:\22\3\2\2\2;<\7]\2\2<\24\3\2"+
		"\2\2=>\7_\2\2>\26\3\2\2\2?@\7}\2\2@\30\3\2\2\2AB\7\177\2\2B\32\3\2\2\2"+
		"CE\t\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\16\2"+
		"\2I\34\3\2\2\2JK\13\2\2\2K\36\3\2\2\2\5\2\65F\3\3\16\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}