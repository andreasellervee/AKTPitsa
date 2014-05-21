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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Nimi=21, Arv=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'showMenu();'", "'showWithoutIngredient('", "','", "'createMenu();'", 
		"'showWithIngredient('", "'setMenuName('", "'showWithType('", "');'", 
		"':'", "'='", "';'", "'add new pizza'", "'hind:'", "'{'", "'showWithoutType('", 
		"'nimi'", "'add new ingredient'", "'add'", "'}'", "'createIngredients();'", 
		"Nimi", "Arv", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Nimi", "Arv", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0113\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13"+
		"\26\3\27\3\27\3\27\7\27\u0101\n\27\f\27\16\27\u0104\13\27\5\27\u0106\n"+
		"\27\3\27\3\27\6\27\u010a\n\27\r\27\16\27\u010b\5\27\u010e\n\27\3\30\3"+
		"\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\4\2"+
		"C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u0117\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5=\3\2\2"+
		"\2\7T\3\2\2\2\tV\3\2\2\2\13d\3\2\2\2\rx\3\2\2\2\17\u0085\3\2\2\2\21\u0093"+
		"\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3"+
		"\2\2\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00c3\3\2\2"+
		"\2#\u00c8\3\2\2\2%\u00db\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00f6"+
		"\3\2\2\2-\u0105\3\2\2\2/\u010f\3\2\2\2\61\62\7u\2\2\62\63\7j\2\2\63\64"+
		"\7q\2\2\64\65\7y\2\2\65\66\7O\2\2\66\67\7g\2\2\678\7p\2\289\7w\2\29:\7"+
		"*\2\2:;\7+\2\2;<\7=\2\2<\4\3\2\2\2=>\7u\2\2>?\7j\2\2?@\7q\2\2@A\7y\2\2"+
		"AB\7Y\2\2BC\7k\2\2CD\7v\2\2DE\7j\2\2EF\7q\2\2FG\7w\2\2GH\7v\2\2HI\7K\2"+
		"\2IJ\7p\2\2JK\7i\2\2KL\7t\2\2LM\7g\2\2MN\7f\2\2NO\7k\2\2OP\7g\2\2PQ\7"+
		"p\2\2QR\7v\2\2RS\7*\2\2S\6\3\2\2\2TU\7.\2\2U\b\3\2\2\2VW\7e\2\2WX\7t\2"+
		"\2XY\7g\2\2YZ\7c\2\2Z[\7v\2\2[\\\7g\2\2\\]\7O\2\2]^\7g\2\2^_\7p\2\2_`"+
		"\7w\2\2`a\7*\2\2ab\7+\2\2bc\7=\2\2c\n\3\2\2\2de\7u\2\2ef\7j\2\2fg\7q\2"+
		"\2gh\7y\2\2hi\7Y\2\2ij\7k\2\2jk\7v\2\2kl\7j\2\2lm\7K\2\2mn\7p\2\2no\7"+
		"i\2\2op\7t\2\2pq\7g\2\2qr\7f\2\2rs\7k\2\2st\7g\2\2tu\7p\2\2uv\7v\2\2v"+
		"w\7*\2\2w\f\3\2\2\2xy\7u\2\2yz\7g\2\2z{\7v\2\2{|\7O\2\2|}\7g\2\2}~\7p"+
		"\2\2~\177\7w\2\2\177\u0080\7P\2\2\u0080\u0081\7c\2\2\u0081\u0082\7o\2"+
		"\2\u0082\u0083\7g\2\2\u0083\u0084\7*\2\2\u0084\16\3\2\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7j\2\2\u0087\u0088\7q\2\2\u0088\u0089\7y\2\2\u0089"+
		"\u008a\7Y\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7j\2\2"+
		"\u008d\u008e\7V\2\2\u008e\u008f\7{\2\2\u008f\u0090\7r\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7*\2\2\u0092\20\3\2\2\2\u0093\u0094\7+\2\2\u0094\u0095"+
		"\7=\2\2\u0095\22\3\2\2\2\u0096\u0097\7<\2\2\u0097\24\3\2\2\2\u0098\u0099"+
		"\7?\2\2\u0099\26\3\2\2\2\u009a\u009b\7=\2\2\u009b\30\3\2\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7f\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7\"\2"+
		"\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7|\2\2\u00a7\u00a8"+
		"\7|\2\2\u00a8\u00a9\7c\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7<\2\2\u00af"+
		"\34\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7j\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7Y\2\2"+
		"\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7V\2\2\u00be"+
		"\u00bf\7{\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7*\2\2"+
		"\u00c2 \3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7o\2"+
		"\2\u00c6\u00c7\7k\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7"+
		"f\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\7k\2"+
		"\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da$\3\2\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7f\2\2\u00dd\u00de\7f\2\2\u00de&\3\2\2\2\u00df\u00e0\7\177\2\2"+
		"\u00e0(\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2"+
		"\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7K\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7i\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3"+
		"\7*\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\7=\2\2\u00f5*\3\2\2\2\u00f6\u00fa"+
		"\t\2\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb,\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fd\u0106\7\62\2\2\u00fe\u0102\t\3\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe\3\2"+
		"\2\2\u0106\u010d\3\2\2\2\u0107\u0109\7\60\2\2\u0108\u010a\t\4\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		".\3\2\2\2\u010f\u0110\t\5\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\30\2\2"+
		"\u0112\60\3\2\2\2\b\2\u00fa\u0102\u0105\u010b\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}