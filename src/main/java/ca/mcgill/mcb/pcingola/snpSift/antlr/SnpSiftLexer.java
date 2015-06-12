// Generated from SnpSift.g by ANTLR 4.4
package ca.mcgill.mcb.pcingola.snpSift.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnpSiftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, WS=36, COMMENT_SL=37, COMMENT_HASH=38, 
		BOOL_LITERAL=39, INT_LITERAL=40, FLOAT_LITERAL=41, STRING_LITERAL=42, 
		ID=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "DIGIT", "NUMBER", "LETTER", "LOWER", "UPPER", "NEWLINE", 
		"ALPHANUM", "WS", "COMMENT_SL", "COMMENT_HASH", "BOOL_LITERAL", "INT_LITERAL", 
		"FLOAT_LITERAL", "STRING_LITERAL", "ID"
	};


	public SnpSiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SnpSift.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42: WS_action((RuleContext)_localctx, actionIndex); break;
		case 43: COMMENT_SL_action((RuleContext)_localctx, actionIndex); break;
		case 44: COMMENT_HASH_action((RuleContext)_localctx, actionIndex); break;
		case 48: STRING_LITERAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_HASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  skip();  break;
		}
	}
	private void STRING_LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  setText(getText().substring( 1, getText().length()-1 ) );  break;
		}
	}
	private void COMMENT_SL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3&\6"+
		"&\u00c9\n&\r&\16&\u00ca\3\'\3\'\5\'\u00cf\n\'\3(\3(\3)\3)\3*\6*\u00d6"+
		"\n*\r*\16*\u00d7\3+\3+\5+\u00dc\n+\3,\6,\u00df\n,\r,\16,\u00e0\3,\3,\3"+
		"-\3-\3-\3-\7-\u00e9\n-\f-\16-\u00ec\13-\3-\3-\3-\3.\3.\7.\u00f3\n.\f."+
		"\16.\u00f6\13.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0104\n/\3\60\3"+
		"\60\3\61\3\61\3\61\5\61\u010b\n\61\3\61\3\61\5\61\u010f\n\61\3\61\5\61"+
		"\u0112\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u011a\n\61\3\62\3\62\7"+
		"\62\u011e\n\62\f\62\16\62\u0121\13\62\3\62\3\62\3\62\3\63\3\63\6\63\u0128"+
		"\n\63\r\63\16\63\u0129\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O\2Q\2S\2U\2W&Y\'["+
		"(])_*a+c,e-\3\2\b\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2GGgg\4\2--//\5\2"+
		"\f\f\17\17))\4\2\60\60aa\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2"+
		"\2\7l\3\2\2\2\to\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2"+
		"\2\23{\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2"+
		"\2%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1"+
		"\3\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ab\3\2"+
		"\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2?\u00b7"+
		"\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00bf\3\2\2\2G\u00c1\3\2\2\2I"+
		"\u00c5\3\2\2\2K\u00c8\3\2\2\2M\u00ce\3\2\2\2O\u00d0\3\2\2\2Q\u00d2\3\2"+
		"\2\2S\u00d5\3\2\2\2U\u00db\3\2\2\2W\u00de\3\2\2\2Y\u00e4\3\2\2\2[\u00f0"+
		"\3\2\2\2]\u0103\3\2\2\2_\u0105\3\2\2\2a\u0119\3\2\2\2c\u011b\3\2\2\2e"+
		"\u0127\3\2\2\2gh\7\61\2\2h\4\3\2\2\2ij\7#\2\2jk\7?\2\2k\6\3\2\2\2lm\7"+
		"~\2\2mn\7~\2\2n\b\3\2\2\2op\7(\2\2pq\7(\2\2q\n\3\2\2\2rs\7?\2\2s\f\3\2"+
		"\2\2tu\7`\2\2u\16\3\2\2\2vw\7A\2\2w\20\3\2\2\2xy\7>\2\2yz\7?\2\2z\22\3"+
		"\2\2\2{|\7C\2\2|}\7N\2\2}~\7N\2\2~\24\3\2\2\2\177\u0080\7(\2\2\u0080\26"+
		"\3\2\2\2\u0081\u0082\7*\2\2\u0082\30\3\2\2\2\u0083\u0084\7,\2\2\u0084"+
		"\32\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7z\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7u\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7j\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7.\2\2\u0091 \3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7c\2\2\u0094"+
		"\"\3\2\2\2\u0095\u0096\7_\2\2\u0096\u0097\7\60\2\2\u0097$\3\2\2\2\u0098"+
		"\u0099\7<\2\2\u0099&\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c"+
		"(\3\2\2\2\u009d\u009e\7]\2\2\u009e*\3\2\2\2\u009f\u00a0\7~\2\2\u00a0,"+
		"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7\u0080\2\2\u00a8"+
		"\62\3\2\2\2\u00a9\u00aa\7_\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac"+
		"\66\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae8\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\u00b1\7\u0080\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3<\3\2\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7C\2\2\u00b8"+
		"\u00b9\7P\2\2\u00b9\u00ba\7[\2\2\u00ba@\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc"+
		"B\3\2\2\2\u00bd\u00be\7-\2\2\u00beD\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0F"+
		"\3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7V\2\2\u00c4"+
		"H\3\2\2\2\u00c5\u00c6\4\62;\2\u00c6J\3\2\2\2\u00c7\u00c9\5I%\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"L\3\2\2\2\u00cc\u00cf\5O(\2\u00cd\u00cf\5Q)\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cfN\3\2\2\2\u00d0\u00d1\4c|\2\u00d1P\3\2\2\2\u00d2\u00d3"+
		"\4C\\\2\u00d3R\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8T\3\2\2\2\u00d9"+
		"\u00dc\5M\'\2\u00da\u00dc\5I%\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2"+
		"\2\u00dcV\3\2\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\b,\2\2\u00e3X\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\7\61\2\2"+
		"\u00e6\u00ea\3\2\2\2\u00e7\u00e9\n\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\5S*\2\u00ee\u00ef\b-\3\2\u00efZ\3\2\2\2\u00f0"+
		"\u00f4\7%\2\2\u00f1\u00f3\n\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\5S*\2\u00f8\u00f9\b.\4\2\u00f9\\\3\2\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7w\2\2\u00fd\u0104\7g\2\2"+
		"\u00fe\u00ff\7h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101\u0102"+
		"\7u\2\2\u0102\u0104\7g\2\2\u0103\u00fa\3\2\2\2\u0103\u00fe\3\2\2\2\u0104"+
		"^\3\2\2\2\u0105\u0106\5K&\2\u0106`\3\2\2\2\u0107\u010a\5K&\2\u0108\u0109"+
		"\7\60\2\2\u0109\u010b\5K&\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0111\3\2\2\2\u010c\u010e\t\4\2\2\u010d\u010f\t\5\2\2\u010e\u010d\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\5K&\2\u0111\u010c"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011a\3\2\2\2\u0113\u0114\7P\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u011a\7P\2\2\u0116\u0117\7P\2\2\u0117\u0118\7C\2\2"+
		"\u0118\u011a\7P\2\2\u0119\u0107\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u011ab\3\2\2\2\u011b\u011f\7)\2\2\u011c\u011e\n\6\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7)\2\2\u0123\u0124\b\62"+
		"\5\2\u0124d\3\2\2\2\u0125\u0128\5U+\2\u0126\u0128\t\7\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012af\3\2\2\2\22\2\u00ca\u00ce\u00d7\u00db\u00e0\u00ea"+
		"\u00f4\u0103\u010a\u010e\u0111\u0119\u011f\u0127\u0129\6\3,\2\3-\3\3."+
		"\4\3\62\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}