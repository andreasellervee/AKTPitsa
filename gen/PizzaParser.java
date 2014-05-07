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
		"<INVALID>", "'showMenu();'", "','", "'showWithType(\"'", "'createMenu();'", 
		"':'", "'showWithoutIngredient(\"'", "'='", "';'", "'add new pizza'", 
		"'SetMenuName(\"'", "'hind:'", "'{'", "'nimi'", "'showWithoutType(\"'", 
		"'add new ingredient'", "'add'", "'}'", "'createIngredients();'", "'\");'", 
		"'showWithIngredient(\"'", "Nimi", "Arv", "WS"
	};
	public static final int
		RULE_pizza = 0, RULE_pizza2 = 1, RULE_show = 2, RULE_createM = 3, RULE_setName = 4, 
		RULE_createIn = 5, RULE_addi = 6, RULE_addp = 7, RULE_add = 8, RULE_showm = 9, 
		RULE_showwithouti = 10, RULE_showwithi = 11, RULE_showwithoutt = 12, RULE_showwitht = 13;
	public static final String[] ruleNames = {
		"pizza", "pizza2", "show", "createM", "setName", "createIn", "addi", "addp", 
		"add", "showm", "showwithouti", "showwithi", "showwithoutt", "showwitht"
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
			setState(28); pizza2();
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
			int _alt;
			_localctx = new Pizza2RContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30); createM();
			setState(32);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(31); setName();
				}
			}

			setState(35);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 6) | (1L << 14) | (1L << 20))) != 0)) {
				{
				setState(34); show();
				}
			}

			setState(37); createIn();
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); addi();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==15 );
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(43); addp();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(49); show();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public ShowwithouttContext showwithoutt() {
			return getRuleContext(ShowwithouttContext.class,0);
		}
		public ShowwithiContext showwithi() {
			return getRuleContext(ShowwithiContext.class,0);
		}
		public ShowwithtContext showwitht() {
			return getRuleContext(ShowwithtContext.class,0);
		}
		public ShowmContext showm() {
			return getRuleContext(ShowmContext.class,0);
		}
		public ShowwithoutiContext showwithouti() {
			return getRuleContext(ShowwithoutiContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_show);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); showwithouti();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); showwithi();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); showwithoutt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); showwitht();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); showm();
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
			setState(62); match(4);
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
			setState(64); match(10);
			setState(65); match(Nimi);
			setState(66); match(19);
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
			setState(68); match(18);
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
			setState(70); match(15);
			setState(71); match(7);
			setState(72); match(12);
			setState(73); match(Nimi);
			setState(74); match(2);
			setState(75); match(Nimi);
			setState(76); match(17);
			setState(77); match(8);
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
			setState(79); match(9);
			setState(80); match(7);
			setState(81); match(12);
			setState(82); match(13);
			setState(83); match(5);
			setState(84); match(Nimi);
			setState(85); match(2);
			setState(86); match(11);
			setState(87); match(Arv);
			setState(88); match(2);
			setState(89); add();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(90); match(2);
					setState(91); add();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(97); match(17);
			setState(98); match(8);
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
			setState(100); match(16);
			setState(101); match(5);
			setState(102); match(Nimi);
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

	public static class ShowmContext extends ParserRuleContext {
		public ShowmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showm; }
	 
		public ShowmContext() { }
		public void copyFrom(ShowmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaMenuuContext extends ShowmContext {
		public NaitaMenuuContext(ShowmContext ctx) { copyFrom(ctx); }
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

	public final ShowmContext showm() throws RecognitionException {
		ShowmContext _localctx = new ShowmContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_showm);
		try {
			_localctx = new NaitaMenuuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(1);
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

	public static class ShowwithoutiContext extends ParserRuleContext {
		public ShowwithoutiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showwithouti; }
	 
		public ShowwithoutiContext() { }
		public void copyFrom(ShowwithoutiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaKoostisetaContext extends ShowwithoutiContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaKoostisetaContext(ShowwithoutiContext ctx) { copyFrom(ctx); }
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

	public final ShowwithoutiContext showwithouti() throws RecognitionException {
		ShowwithoutiContext _localctx = new ShowwithoutiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_showwithouti);
		try {
			_localctx = new NaitaKoostisetaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(6);
			setState(107); match(Nimi);
			setState(108); match(19);
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

	public static class ShowwithiContext extends ParserRuleContext {
		public ShowwithiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showwithi; }
	 
		public ShowwithiContext() { }
		public void copyFrom(ShowwithiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaKoostisegaContext extends ShowwithiContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaKoostisegaContext(ShowwithiContext ctx) { copyFrom(ctx); }
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

	public final ShowwithiContext showwithi() throws RecognitionException {
		ShowwithiContext _localctx = new ShowwithiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_showwithi);
		try {
			_localctx = new NaitaKoostisegaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(20);
			setState(111); match(Nimi);
			setState(112); match(19);
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

	public static class ShowwithouttContext extends ParserRuleContext {
		public ShowwithouttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showwithoutt; }
	 
		public ShowwithouttContext() { }
		public void copyFrom(ShowwithouttContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaTuubitaContext extends ShowwithouttContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaTuubitaContext(ShowwithouttContext ctx) { copyFrom(ctx); }
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

	public final ShowwithouttContext showwithoutt() throws RecognitionException {
		ShowwithouttContext _localctx = new ShowwithouttContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_showwithoutt);
		try {
			_localctx = new NaitaTuubitaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(14);
			setState(115); match(Nimi);
			setState(116); match(19);
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

	public static class ShowwithtContext extends ParserRuleContext {
		public ShowwithtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showwitht; }
	 
		public ShowwithtContext() { }
		public void copyFrom(ShowwithtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NaitaTuubigaContext extends ShowwithtContext {
		public TerminalNode Nimi() { return getToken(PizzaParser.Nimi, 0); }
		public NaitaTuubigaContext(ShowwithtContext ctx) { copyFrom(ctx); }
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

	public final ShowwithtContext showwitht() throws RecognitionException {
		ShowwithtContext _localctx = new ShowwithtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_showwitht);
		try {
			_localctx = new NaitaTuubigaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(3);
			setState(119); match(Nimi);
			setState(120); match(19);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\5\3#\n\3\3\3\5\3&\n"+
		"\3\3\3\3\3\6\3*\n\3\r\3\16\3+\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\7\3\65"+
		"\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\4\66`\2\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\2x\2\36\3\2\2\2\4 \3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\f"+
		"F\3\2\2\2\16H\3\2\2\2\20Q\3\2\2\2\22f\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2"+
		"\30p\3\2\2\2\32t\3\2\2\2\34x\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 \"\5\b"+
		"\5\2!#\5\n\6\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\5\6\4\2%$\3\2\2\2%&\3"+
		"\2\2\2&\'\3\2\2\2\')\5\f\7\2(*\5\16\b\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,\60\3\2\2\2-/\5\20\t\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\65"+
		"8\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29?\5\26"+
		"\f\2:?\5\30\r\2;?\5\32\16\2<?\5\34\17\2=?\5\24\13\2>9\3\2\2\2>:\3\2\2"+
		"\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\6\2\2A\t\3\2\2\2BC\7\f"+
		"\2\2CD\7\27\2\2DE\7\25\2\2E\13\3\2\2\2FG\7\24\2\2G\r\3\2\2\2HI\7\21\2"+
		"\2IJ\7\t\2\2JK\7\16\2\2KL\7\27\2\2LM\7\4\2\2MN\7\27\2\2NO\7\23\2\2OP\7"+
		"\n\2\2P\17\3\2\2\2QR\7\13\2\2RS\7\t\2\2ST\7\16\2\2TU\7\17\2\2UV\7\7\2"+
		"\2VW\7\27\2\2WX\7\4\2\2XY\7\r\2\2YZ\7\30\2\2Z[\7\4\2\2[`\5\22\n\2\\]\7"+
		"\4\2\2]_\5\22\n\2^\\\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b"+
		"`\3\2\2\2cd\7\23\2\2de\7\n\2\2e\21\3\2\2\2fg\7\22\2\2gh\7\7\2\2hi\7\27"+
		"\2\2i\23\3\2\2\2jk\7\3\2\2k\25\3\2\2\2lm\7\b\2\2mn\7\27\2\2no\7\25\2\2"+
		"o\27\3\2\2\2pq\7\26\2\2qr\7\27\2\2rs\7\25\2\2s\31\3\2\2\2tu\7\20\2\2u"+
		"v\7\27\2\2vw\7\25\2\2w\33\3\2\2\2xy\7\5\2\2yz\7\27\2\2z{\7\25\2\2{\35"+
		"\3\2\2\2\t\"%+\60\66>`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}