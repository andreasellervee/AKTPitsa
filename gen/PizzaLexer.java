// Generated from C:/Veebirakendused/New folder/Pizza/grammar\Pizza.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PizzaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, Nimi=22, Arv=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'createIngredients()'", "')'", "','", "'showWithoutIngredient('", "'createMenu()'", 
		"'showWithIngredient('", "':'", "'showWithType('", "'='", "';'", "'add new pizza'", 
		"'showMenu()'", "'{'", "'nimi'", "'showWithoutType('", "'add new ingredient'", 
		"'hind'", "'add'", "'}'", "'\"'", "'SetMenuName('", "Nimi", "Arv", "WS"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "Nimi", "Arv", "WS"
	};


	public PizzaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pizza.g4"; }

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\7\27\u00f8\n\27\f\27\16\27\u00fb\13\27\3\30\3"+
		"\30\3\30\7\30\u0100\n\30\f\30\16\30\u0103\13\30\5\30\u0105\n\30\3\30\3"+
		"\30\6\30\u0109\n\30\r\30\16\30\u010a\5\30\u010d\n\30\3\31\3\31\3\31\3"+
		"\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\4\2C\\c|"+
		"\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2"+
		"\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13b\3\2\2\2\ro\3\2\2\2\17\u0083\3\2"+
		"\2\2\21\u0085\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2\2\2\27\u0097\3\2\2"+
		"\2\31\u00a5\3\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37\u00b7\3\2\2\2"+
		"!\u00c8\3\2\2\2#\u00db\3\2\2\2%\u00e0\3\2\2\2\'\u00e4\3\2\2\2)\u00e6\3"+
		"\2\2\2+\u00e8\3\2\2\2-\u00f5\3\2\2\2/\u0104\3\2\2\2\61\u010e\3\2\2\2\63"+
		"\64\7e\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7c\2\2\678\7v\2\289\7g\2\2"+
		"9:\7K\2\2:;\7p\2\2;<\7i\2\2<=\7t\2\2=>\7g\2\2>?\7f\2\2?@\7k\2\2@A\7g\2"+
		"\2AB\7p\2\2BC\7v\2\2CD\7u\2\2DE\7*\2\2EF\7+\2\2F\4\3\2\2\2GH\7+\2\2H\6"+
		"\3\2\2\2IJ\7.\2\2J\b\3\2\2\2KL\7u\2\2LM\7j\2\2MN\7q\2\2NO\7y\2\2OP\7Y"+
		"\2\2PQ\7k\2\2QR\7v\2\2RS\7j\2\2ST\7q\2\2TU\7w\2\2UV\7v\2\2VW\7K\2\2WX"+
		"\7p\2\2XY\7i\2\2YZ\7t\2\2Z[\7g\2\2[\\\7f\2\2\\]\7k\2\2]^\7g\2\2^_\7p\2"+
		"\2_`\7v\2\2`a\7*\2\2a\n\3\2\2\2bc\7e\2\2cd\7t\2\2de\7g\2\2ef\7c\2\2fg"+
		"\7v\2\2gh\7g\2\2hi\7O\2\2ij\7g\2\2jk\7p\2\2kl\7w\2\2lm\7*\2\2mn\7+\2\2"+
		"n\f\3\2\2\2op\7u\2\2pq\7j\2\2qr\7q\2\2rs\7y\2\2st\7Y\2\2tu\7k\2\2uv\7"+
		"v\2\2vw\7j\2\2wx\7K\2\2xy\7p\2\2yz\7i\2\2z{\7t\2\2{|\7g\2\2|}\7f\2\2}"+
		"~\7k\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\u0082\7"+
		"*\2\2\u0082\16\3\2\2\2\u0083\u0084\7<\2\2\u0084\20\3\2\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7j\2\2\u0087\u0088\7q\2\2\u0088\u0089\7y\2\2\u0089"+
		"\u008a\7Y\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7j\2\2"+
		"\u008d\u008e\7V\2\2\u008e\u008f\7{\2\2\u008f\u0090\7r\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7*\2\2\u0092\22\3\2\2\2\u0093\u0094\7?\2\2\u0094\24"+
		"\3\2\2\2\u0095\u0096\7=\2\2\u0096\26\3\2\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7f\2\2\u0099\u009a\7f\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7p\2"+
		"\2\u009c\u009d\7g\2\2\u009d\u009e\7y\2\2\u009e\u009f\7\"\2\2\u009f\u00a0"+
		"\7r\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7|\2\2\u00a2\u00a3\7|\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7O\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7p\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7*\2\2\u00ae\u00af"+
		"\7+\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1\34\3\2\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\36\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7y\2\2\u00bb\u00bc\7Y\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7j\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7V\2\2\u00c3\u00c4\7{\2\2\u00c4\u00c5\7r\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7*\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7c\2\2\u00c9"+
		"\u00ca\7f\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\7p\2"+
		"\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1"+
		"\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\"\3\2\2\2\u00db\u00dc\7j"+
		"\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7f\2\2\u00df$\3"+
		"\2\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7f\2\2\u00e3"+
		"&\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5(\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7"+
		"*\3\2\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7O\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7w\2\2"+
		"\u00ef\u00f0\7P\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7*\2\2\u00f4,\3\2\2\2\u00f5\u00f9\t\2\2\2\u00f6\u00f8"+
		"\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa.\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0105\7\62\2\2"+
		"\u00fd\u0101\t\3\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0105\u010c\3\2"+
		"\2\2\u0106\u0108\7\60\2\2\u0107\u0109\t\4\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u0106\3\2\2\2\u010c\u010d\3\2\2\2\u010d\60\3\2\2\2\u010e\u010f"+
		"\t\5\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b\31\2\2\u0111\62\3\2\2\2\b\2"+
		"\u00f9\u0101\u0104\u010a\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}