// Generated from C:/Users/Andreas/Documents/kool/automaadid translaatorid/Projekt/grammar\Pizza.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PizzaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Nimi=21, Arv=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'showMenu();'", "'showWithoutIngredient('", "','", "'createMenu();'", 
		"'showWithIngredient('", "'setMenuName('", "'showWithType('", "');'", 
		"':'", "'='", "';'", "'add new pizza'", "'hind:'", "'{'", "'showWithoutType('", 
		"'nimi'", "'add new ingredient'", "'add'", "'}'", "'createIngredients();'", 
		"Nimi", "Arv", "WS"
	};
	public static final int
		RULE_pizza = 0, RULE_pizza2 = 1, RULE_show = 2, RULE_createM = 3, RULE_setName = 4, 
		RULE_createIn = 5, RULE_addi = 6, RULE_addp = 7, RULE_add = 8;
	public static final String[] ruleNames = {
		"pizza", "pizza2", "show", "createM", "setName", "createIn", "addi", "addp", 
		"add"
	};

	@Override
	public String getGrammarFileName() { return "Pizza.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PizzaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PizzaContext extends ParserRuleContext {
		public PizzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizza; }
	 
		public PizzaContext() { }
		public void copyFrom(PizzaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PizzaRContext extends PizzaContext {
		public Pizza2Context pizza2() {
			return getRuleContext(Pizza2Context.class,0);
		}
		public PizzaRContext(PizzaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterPizzaR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitPizzaR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitPizzaR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PizzaContext pizza() throws RecognitionException {
		PizzaContext _localctx = new PizzaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pizza);
		try {
			_localctx = new PizzaRContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18); pizza2();
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

	public static class Pizza2Context extends ParserRuleContext {
		public Pizza2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizza2; }
	 
		public Pizza2Context() { }
		public void copyFrom(Pizza2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Pizza2RContext extends Pizza2Context {
		public AddpContext addp(int i) {
			return getRuleContext(AddpContext.class,i);
		}
		public AddiContext addi(int i) {
			return getRuleContext(AddiContext.class,i);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public CreateInContext createIn() {
			return getRuleContext(CreateInContext.class,0);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public List<AddiContext> addi() {
			return getRuleContexts(AddiContext.class);
		}
		public CreateMContext createM() {
			return getRuleContext(CreateMContext.class,0);
		}
		public List<AddpContext> addp() {
			return getRuleContexts(AddpContext.class);
		}
		public Pizza2RContext(Pizza2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterPizza2R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitPizza2R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitPizza2R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pizza2Context pizza2() throws RecognitionException {
		Pizza2Context _localctx = new Pizza2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_pizza2);
		int _la;
		try {
			_localctx = new Pizza2RContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20); createM();
			setState(22);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(21); setName();
				}
			}

			setState(25);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__15) | (1L << T__13) | (1L << T__5))) != 0)) {
				{
				setState(24); show();
				}
			}

			setState(27); createIn();
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); addi();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(33); addp();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__15) | (1L << T__13) | (1L << T__5))) != 0)) {
				{
				{
				setState(39); show();
				}
				}
				setState(44);
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaKoostisegaContext extends ShowContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaKoostisegaContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterNaitaKoostisega(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitNaitaKoostisega(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitNaitaKoostisega(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaitaTuubitaContext extends ShowContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaTuubitaContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterNaitaTuubita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitNaitaTuubita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitNaitaTuubita(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaitaTuubigaContext extends ShowContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaTuubigaContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterNaitaTuubiga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitNaitaTuubiga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitNaitaTuubiga(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaitaMenuuContext extends ShowContext {
		public NaitaMenuuContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterNaitaMenuu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitNaitaMenuu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitNaitaMenuu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaitaKoostisetaContext extends ShowContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaKoostisetaContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterNaitaKoostiseta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitNaitaKoostiseta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitNaitaKoostiseta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_show);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new NaitaKoostisetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(T__18);
				setState(46); match(Nimi);
				setState(47); match(T__12);
				}
				break;
			case T__15:
				_localctx = new NaitaKoostisegaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(T__15);
				setState(49); match(Nimi);
				setState(50); match(T__12);
				}
				break;
			case T__5:
				_localctx = new NaitaTuubitaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(T__5);
				setState(52); match(Nimi);
				setState(53); match(T__12);
				}
				break;
			case T__13:
				_localctx = new NaitaTuubigaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54); match(T__13);
				setState(55); match(Nimi);
				setState(56); match(T__12);
				}
				break;
			case T__19:
				_localctx = new NaitaMenuuContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57); match(T__19);
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

	public static class CreateMContext extends ParserRuleContext {
		public CreateMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createM; }
	 
		public CreateMContext() { }
		public void copyFrom(CreateMContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoomenuuContext extends CreateMContext {
		public LoomenuuContext(CreateMContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterLoomenuu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitLoomenuu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitLoomenuu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateMContext createM() throws RecognitionException {
		CreateMContext _localctx = new CreateMContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createM);
		try {
			_localctx = new LoomenuuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(T__16);
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

	public static class SetNameContext extends ParserRuleContext {
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
	 
		public SetNameContext() { }
		public void copyFrom(SetNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MenuuNimiContext extends SetNameContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public MenuuNimiContext(SetNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterMenuuNimi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitMenuuNimi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitMenuuNimi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setName);
		try {
			_localctx = new MenuuNimiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(T__14);
			setState(63); match(Nimi);
			setState(64); match(T__12);
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

	public static class CreateInContext extends ParserRuleContext {
		public CreateInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIn; }
	 
		public CreateInContext() { }
		public void copyFrom(CreateInContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LooKoostisContext extends CreateInContext {
		public LooKoostisContext(CreateInContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterLooKoostis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitLooKoostis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitLooKoostis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateInContext createIn() throws RecognitionException {
		CreateInContext _localctx = new CreateInContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createIn);
		try {
			_localctx = new LooKoostisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(T__0);
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

	public static class AddiContext extends ParserRuleContext {
		public AddiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addi; }
	 
		public AddiContext() { }
		public void copyFrom(AddiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LisaKoostisListiContext extends AddiContext {
		public List<TerminalNode> Nimi() { return getTokens(PizzaParser.Nimi); }
		public TerminalNode Nimi(int i) {
			return getToken(PizzaParser.Nimi, i);
		}
		public LisaKoostisListiContext(AddiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterLisaKoostisListi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitLisaKoostisListi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitLisaKoostisListi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddiContext addi() throws RecognitionException {
		AddiContext _localctx = new AddiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addi);
		try {
			_localctx = new LisaKoostisListiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__3);
			setState(69); match(T__10);
			setState(70); match(T__6);
			setState(71); match(Nimi);
			setState(72); match(T__17);
			setState(73); match(Nimi);
			setState(74); match(T__1);
			setState(75); match(T__9);
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

	public static class AddpContext extends ParserRuleContext {
		public AddpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addp; }
	 
		public AddpContext() { }
		public void copyFrom(AddpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LisaPitsaContext extends AddpContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public TerminalNode Arv() { return getToken(PizzaParser.Arv, 0); }
		public LisaPitsaContext(AddpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterLisaPitsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitLisaPitsa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitLisaPitsa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddpContext addp() throws RecognitionException {
		AddpContext _localctx = new AddpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addp);
		try {
			int _alt;
			_localctx = new LisaPitsaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__8);
			setState(78); match(T__10);
			setState(79); match(T__6);
			setState(80); match(T__4);
			setState(81); match(T__11);
			setState(82); match(Nimi);
			setState(83); match(T__17);
			setState(84); match(T__7);
			setState(85); match(Arv);
			setState(86); match(T__17);
			setState(87); add();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(88); match(T__17);
					setState(89); add();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(95); match(T__1);
			setState(96); match(T__9);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LisaKoostisContext extends AddContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public LisaKoostisContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterLisaKoostis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitLisaKoostis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitLisaKoostis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_add);
		try {
			_localctx = new LisaKoostisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(T__2);
			setState(99); match(T__11);
			setState(100); match(Nimi);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\5\3\31\n\3\3\3\5\3\34\n\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\7\3%\n\3"+
		"\f\3\16\3(\13\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3^\2\13\2\4\6\b\n\f\16\20\22\2\2i\2\24\3\2\2\2\4\26\3\2\2\2\6<\3\2"+
		"\2\2\b>\3\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20O\3\2\2\2\22d\3\2"+
		"\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26\30\5\b\5\2\27\31\5\n\6\2\30\27\3\2"+
		"\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\33\34\3\2"+
		"\2\2\34\35\3\2\2\2\35\37\5\f\7\2\36 \5\16\b\2\37\36\3\2\2\2 !\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"&\3\2\2\2#%\5\20\t\2$#\3\2\2\2%(\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\',\3\2\2\2(&\3\2\2\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,"+
		"*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60\61\7\27\2\2\61"+
		"=\7\n\2\2\62\63\7\7\2\2\63\64\7\27\2\2\64=\7\n\2\2\65\66\7\21\2\2\66\67"+
		"\7\27\2\2\67=\7\n\2\289\7\t\2\29:\7\27\2\2:=\7\n\2\2;=\7\3\2\2</\3\2\2"+
		"\2<\62\3\2\2\2<\65\3\2\2\2<8\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7\6\2\2?\t"+
		"\3\2\2\2@A\7\b\2\2AB\7\27\2\2BC\7\n\2\2C\13\3\2\2\2DE\7\26\2\2E\r\3\2"+
		"\2\2FG\7\23\2\2GH\7\f\2\2HI\7\20\2\2IJ\7\27\2\2JK\7\5\2\2KL\7\27\2\2L"+
		"M\7\25\2\2MN\7\r\2\2N\17\3\2\2\2OP\7\16\2\2PQ\7\f\2\2QR\7\20\2\2RS\7\22"+
		"\2\2ST\7\13\2\2TU\7\27\2\2UV\7\5\2\2VW\7\17\2\2WX\7\30\2\2XY\7\5\2\2Y"+
		"^\5\22\n\2Z[\7\5\2\2[]\5\22\n\2\\Z\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2"+
		"\2\2_a\3\2\2\2`^\3\2\2\2ab\7\25\2\2bc\7\r\2\2c\21\3\2\2\2de\7\24\2\2e"+
		"f\7\13\2\2fg\7\27\2\2g\23\3\2\2\2\t\30\33!&,<^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}