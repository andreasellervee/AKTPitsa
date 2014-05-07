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
		"'showMenu();'", "'pizza'", "','", "'showWithType(\"'", "'createMenu();'", 
		"'add: '", "'showWithoutIngredient(\"'", "'};'", "'='", "', hind:'", "'ingredient'", 
		"'SetMenuName(\"'", "'{'", "'showWithoutType(\"'", "'new'", "'add'", "'createIngredients();'", 
		"'{ nimi:'", "'\");'", "'showWithIngredient(\"'", "Nimi", "Arv", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00fb\n\26"+
		"\f\26\16\26\u00fe\13\26\3\27\3\27\3\27\7\27\u0103\n\27\f\27\16\27\u0106"+
		"\13\27\5\27\u0108\n\27\3\27\3\27\6\27\u010c\n\27\r\27\16\27\u010d\5\27"+
		"\u0110\n\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\6\4\2C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u0119\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2"+
		"\2\2\5=\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13T\3\2\2\2\rb\3\2\2\2\17h\3\2\2"+
		"\2\21\u0080\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u008d\3\2\2\2"+
		"\31\u0098\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00ba\3\2\2\2!"+
		"\u00be\3\2\2\2#\u00c2\3\2\2\2%\u00d7\3\2\2\2\'\u00df\3\2\2\2)\u00e3\3"+
		"\2\2\2+\u00f8\3\2\2\2-\u0107\3\2\2\2/\u0111\3\2\2\2\61\62\7u\2\2\62\63"+
		"\7j\2\2\63\64\7q\2\2\64\65\7y\2\2\65\66\7O\2\2\66\67\7g\2\2\678\7p\2\2"+
		"89\7w\2\29:\7*\2\2:;\7+\2\2;<\7=\2\2<\4\3\2\2\2=>\7r\2\2>?\7k\2\2?@\7"+
		"|\2\2@A\7|\2\2AB\7c\2\2B\6\3\2\2\2CD\7.\2\2D\b\3\2\2\2EF\7u\2\2FG\7j\2"+
		"\2GH\7q\2\2HI\7y\2\2IJ\7Y\2\2JK\7k\2\2KL\7v\2\2LM\7j\2\2MN\7V\2\2NO\7"+
		"{\2\2OP\7r\2\2PQ\7g\2\2QR\7*\2\2RS\7$\2\2S\n\3\2\2\2TU\7e\2\2UV\7t\2\2"+
		"VW\7g\2\2WX\7c\2\2XY\7v\2\2YZ\7g\2\2Z[\7O\2\2[\\\7g\2\2\\]\7p\2\2]^\7"+
		"w\2\2^_\7*\2\2_`\7+\2\2`a\7=\2\2a\f\3\2\2\2bc\7c\2\2cd\7f\2\2de\7f\2\2"+
		"ef\7<\2\2fg\7\"\2\2g\16\3\2\2\2hi\7u\2\2ij\7j\2\2jk\7q\2\2kl\7y\2\2lm"+
		"\7Y\2\2mn\7k\2\2no\7v\2\2op\7j\2\2pq\7q\2\2qr\7w\2\2rs\7v\2\2st\7K\2\2"+
		"tu\7p\2\2uv\7i\2\2vw\7t\2\2wx\7g\2\2xy\7f\2\2yz\7k\2\2z{\7g\2\2{|\7p\2"+
		"\2|}\7v\2\2}~\7*\2\2~\177\7$\2\2\177\20\3\2\2\2\u0080\u0081\7\177\2\2"+
		"\u0081\u0082\7=\2\2\u0082\22\3\2\2\2\u0083\u0084\7?\2\2\u0084\24\3\2\2"+
		"\2\u0085\u0086\7.\2\2\u0086\u0087\7\"\2\2\u0087\u0088\7j\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b\u008c\7<\2\2\u008c"+
		"\26\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7i\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7f\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\30\3\2"+
		"\2\2\u0098\u0099\7U\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7O\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7P\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a4\7*\2\2\u00a4\u00a5\7$\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7"+
		"}\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7Y\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7v\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		"\36\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7y\2\2\u00bd"+
		" \3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7f\2\2\u00c1"+
		"\"\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7K\2\2"+
		"\u00c9\u00ca\7p\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7*\2\2"+
		"\u00d4\u00d5\7+\2\2\u00d5\u00d6\7=\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7}\2"+
		"\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7o\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7<\2\2\u00de&\3\2\2\2\u00df\u00e0"+
		"\7$\2\2\u00e0\u00e1\7+\2\2\u00e1\u00e2\7=\2\2\u00e2(\3\2\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7y\2\2\u00e7"+
		"\u00e8\7Y\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7j\2\2"+
		"\u00eb\u00ec\7K\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7*\2\2"+
		"\u00f6\u00f7\7$\2\2\u00f7*\3\2\2\2\u00f8\u00fc\t\2\2\2\u00f9\u00fb\t\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd,\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0108\7\62\2\2"+
		"\u0100\u0104\t\3\2\2\u0101\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0108\u010f\3\2"+
		"\2\2\u0109\u010b\7\60\2\2\u010a\u010c\t\4\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u0109\3\2\2\2\u010f\u0110\3\2\2\2\u0110.\3\2\2\2\u0111\u0112"+
		"\t\5\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\30\2\2\u0114\60\3\2\2\2\b\2"+
		"\u00fc\u0104\u0107\u010d\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}