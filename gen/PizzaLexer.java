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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, Nimi=18, Arv=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'showMenu();'", "'pizza'", "','", "'createMenu();'", "'add: '", "'showWith(\"'", 
		"'};'", "'='", "', hind:'", "'SetMenuName(\"'", "'{'", "'incredient'", 
		"'new'", "'add'", "'createIngredients();'", "'{ nimi:'", "'\");'", "Nimi", 
		"Arv", "WS"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"Nimi", "Arv", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\7\23\u00b2\n\23\f\23\16\23\u00b5\13\23\3\24\3\24\3\24\7\24\u00ba\n\24"+
		"\f\24\16\24\u00bd\13\24\5\24\u00bf\n\24\3\24\3\24\6\24\u00c3\n\24\r\24"+
		"\16\24\u00c4\5\24\u00c7\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\6\4\2C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u00d0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\67\3\2\2\2\7=\3\2"+
		"\2\2\t?\3\2\2\2\13M\3\2\2\2\rS\3\2\2\2\17^\3\2\2\2\21a\3\2\2\2\23c\3\2"+
		"\2\2\25k\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33\u0086\3\2\2\2\35\u008a\3\2"+
		"\2\2\37\u008e\3\2\2\2!\u00a3\3\2\2\2#\u00ab\3\2\2\2%\u00af\3\2\2\2\'\u00be"+
		"\3\2\2\2)\u00c8\3\2\2\2+,\7u\2\2,-\7j\2\2-.\7q\2\2./\7y\2\2/\60\7O\2\2"+
		"\60\61\7g\2\2\61\62\7p\2\2\62\63\7w\2\2\63\64\7*\2\2\64\65\7+\2\2\65\66"+
		"\7=\2\2\66\4\3\2\2\2\678\7r\2\289\7k\2\29:\7|\2\2:;\7|\2\2;<\7c\2\2<\6"+
		"\3\2\2\2=>\7.\2\2>\b\3\2\2\2?@\7e\2\2@A\7t\2\2AB\7g\2\2BC\7c\2\2CD\7v"+
		"\2\2DE\7g\2\2EF\7O\2\2FG\7g\2\2GH\7p\2\2HI\7w\2\2IJ\7*\2\2JK\7+\2\2KL"+
		"\7=\2\2L\n\3\2\2\2MN\7c\2\2NO\7f\2\2OP\7f\2\2PQ\7<\2\2QR\7\"\2\2R\f\3"+
		"\2\2\2ST\7u\2\2TU\7j\2\2UV\7q\2\2VW\7y\2\2WX\7Y\2\2XY\7k\2\2YZ\7v\2\2"+
		"Z[\7j\2\2[\\\7*\2\2\\]\7$\2\2]\16\3\2\2\2^_\7\177\2\2_`\7=\2\2`\20\3\2"+
		"\2\2ab\7?\2\2b\22\3\2\2\2cd\7.\2\2de\7\"\2\2ef\7j\2\2fg\7k\2\2gh\7p\2"+
		"\2hi\7f\2\2ij\7<\2\2j\24\3\2\2\2kl\7U\2\2lm\7g\2\2mn\7v\2\2no\7O\2\2o"+
		"p\7g\2\2pq\7p\2\2qr\7w\2\2rs\7P\2\2st\7c\2\2tu\7o\2\2uv\7g\2\2vw\7*\2"+
		"\2wx\7$\2\2x\26\3\2\2\2yz\7}\2\2z\30\3\2\2\2{|\7k\2\2|}\7p\2\2}~\7e\2"+
		"\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7f\2\2\u0081\u0082\7k\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\32\3\2"+
		"\2\2\u0086\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088\u0089\7y\2\2\u0089\34"+
		"\3\2\2\2\u008a\u008b\7c\2\2\u008b\u008c\7f\2\2\u008c\u008d\7f\2\2\u008d"+
		"\36\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7K\2\2"+
		"\u0095\u0096\7p\2\2\u0096\u0097\7i\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7f\2\2\u009a\u009b\7k\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7*\2\2"+
		"\u00a0\u00a1\7+\2\2\u00a1\u00a2\7=\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7}\2"+
		"\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7<\2\2\u00aa\"\3\2\2\2\u00ab\u00ac"+
		"\7$\2\2\u00ac\u00ad\7+\2\2\u00ad\u00ae\7=\2\2\u00ae$\3\2\2\2\u00af\u00b3"+
		"\t\2\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4&\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b6\u00bf\7\62\2\2\u00b7\u00bb\t\3\2\2\u00b8\u00ba\t\4\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2"+
		"\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c2\7\60\2\2\u00c1\u00c3\t\4\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"(\3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\25\2\2"+
		"\u00cb*\3\2\2\2\b\2\u00b3\u00bb\u00be\u00c4\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}