// Generated from C:/Veebirakendused/New folder/Pizza/grammar\Pizza.g4 by ANTLR 4.x
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
		"<INVALID>", "'showMenu();'", "'pizza'", "','", "'showWithType(\"'", "'createMenu();'", 
		"'add: '", "'showWithoutIngredient(\"'", "'};'", "'='", "', hind:'", "'ingredient'", 
		"'SetMenuName(\"'", "'{'", "'showWithoutType(\"'", "'new'", "'add'", "'createIngredients();'", 
		"'{ nimi:'", "'\");'", "'showWithIngredient(\"'", "Nimi", "Arv", "WS"
	};
	public static final int
		RULE_pizza = 0, RULE_pizza2 = 1, RULE_pizza1 = 2, RULE_show = 3, RULE_createM = 4, 
		RULE_setName = 5, RULE_createIn = 6, RULE_addi = 7, RULE_addp = 8, RULE_add = 9, 
		RULE_showm = 10, RULE_showwithouti = 11, RULE_showwithi = 12, RULE_showwithoutt = 13, 
		RULE_showwitht = 14;
	public static final String[] ruleNames = {
		"pizza", "pizza2", "pizza1", "show", "createM", "setName", "createIn", 
		"addi", "addp", "add", "showm", "showwithouti", "showwithi", "showwithoutt", 
		"showwitht"
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
		public Pizza2Context pizza2() {
			return getRuleContext(Pizza2Context.class,0);
		}
		public PizzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterPizza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitPizza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitPizza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PizzaContext pizza() throws RecognitionException {
		PizzaContext _localctx = new PizzaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pizza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); pizza2();
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
		public AddpContext addp(int i) {
			return getRuleContext(AddpContext.class,i);
		}
		public AddiContext addi(int i) {
			return getRuleContext(AddiContext.class,i);
		}
		public CreateInContext createIn() {
			return getRuleContext(CreateInContext.class,0);
		}
		public Pizza1Context pizza1() {
			return getRuleContext(Pizza1Context.class,0);
		}
		public List<AddiContext> addi() {
			return getRuleContexts(AddiContext.class);
		}
		public List<AddpContext> addp() {
			return getRuleContexts(AddpContext.class);
		}
		public Pizza2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizza2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterPizza2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitPizza2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitPizza2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pizza2Context pizza2() throws RecognitionException {
		Pizza2Context _localctx = new Pizza2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_pizza2);
		int _la;
		try {
			int _alt;
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); pizza1();
				setState(33); createIn();
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(34); addi();
						}
						} 
					}
					setState(39);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==16) {
					{
					{
					setState(40); addp();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); pizza1();
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

	public static class Pizza1Context extends ParserRuleContext {
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public SetNameContext setName(int i) {
			return getRuleContext(SetNameContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public List<SetNameContext> setName() {
			return getRuleContexts(SetNameContext.class);
		}
		public CreateMContext createM() {
			return getRuleContext(CreateMContext.class,0);
		}
		public Pizza1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pizza1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).enterPizza1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PizzaListener ) ((PizzaListener)listener).exitPizza1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PizzaVisitor ) return ((PizzaVisitor<? extends T>)visitor).visitPizza1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pizza1Context pizza1() throws RecognitionException {
		Pizza1Context _localctx = new Pizza1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_pizza1);
		try {
			int _alt;
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); createM();
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(50); show();
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(56); setName();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); createM();
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(63); setName();
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(69); show();
						}
						} 
					}
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
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
		enterRule(_localctx, 6, RULE_show);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); showwithouti();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); showwithi();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); showwithoutt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); showwitht();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 5);
				{
				setState(81); showm();
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
		enterRule(_localctx, 8, RULE_createM);
		try {
			_localctx = new LoomenuuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(5);
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
		enterRule(_localctx, 10, RULE_setName);
		try {
			_localctx = new MenuuNimiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(12);
			setState(87); match(Nimi);
			setState(88); match(19);
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
		enterRule(_localctx, 12, RULE_createIn);
		try {
			_localctx = new LooKoostisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(17);
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
		enterRule(_localctx, 14, RULE_addi);
		try {
			_localctx = new LisaKoostisListiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(16);
			setState(93); match(15);
			setState(94); match(11);
			setState(95); match(9);
			setState(96); match(13);
			setState(97); match(Nimi);
			setState(98); match(3);
			setState(99); match(Nimi);
			setState(100); match(8);
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
		enterRule(_localctx, 16, RULE_addp);
		try {
			int _alt;
			_localctx = new LisaPitsaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(16);
			setState(103); match(15);
			setState(104); match(2);
			setState(105); match(9);
			setState(106); match(18);
			setState(107); match(Nimi);
			setState(108); match(10);
			setState(109); match(Arv);
			setState(110); match(3);
			setState(111); add();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(112); match(3);
					setState(113); add();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(119); match(8);
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
		enterRule(_localctx, 18, RULE_add);
		try {
			_localctx = new LisaKoostisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(6);
			setState(122); match(Nimi);
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
		enterRule(_localctx, 20, RULE_showm);
		try {
			_localctx = new NaitaMenuuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(1);
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
		enterRule(_localctx, 22, RULE_showwithouti);
		try {
			_localctx = new NaitaKoostisetaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(7);
			setState(127); match(Nimi);
			setState(128); match(19);
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
		enterRule(_localctx, 24, RULE_showwithi);
		try {
			_localctx = new NaitaKoostisegaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(20);
			setState(131); match(Nimi);
			setState(132); match(19);
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
		enterRule(_localctx, 26, RULE_showwithoutt);
		try {
			_localctx = new NaitaTuubitaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(14);
			setState(135); match(Nimi);
			setState(136); match(19);
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
		enterRule(_localctx, 28, RULE_showwitht);
		try {
			_localctx = new NaitaTuubigaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(4);
			setState(139); match(Nimi);
			setState(140); match(19);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4"+
		"\7\4C\n\4\f\4\16\4F\13\4\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5U\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\nu\n\n\f\n\16\nx\13\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\7\67=DJv\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u008e\2 \3\2"+
		"\2\2\4\61\3\2\2\2\6M\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16\\\3\2"+
		"\2\2\20^\3\2\2\2\22h\3\2\2\2\24{\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2\2"+
		"\32\u0084\3\2\2\2\34\u0088\3\2\2\2\36\u008c\3\2\2\2 !\5\4\3\2!\3\3\2\2"+
		"\2\"#\5\6\4\2#\'\5\16\b\2$&\5\20\t\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\5\22\n\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\62\3\2\2\2/-\3\2\2\2\60\62\5\6\4\2\61\"\3\2\2\2\61\60\3"+
		"\2\2\2\62\5\3\2\2\2\63\67\5\n\6\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2"+
		"\2\2\678\3\2\2\2\67\65\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\f\7\2;:\3\2\2"+
		"\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>N\3\2\2\2?=\3\2\2\2@D\5\n\6\2AC\5\f\7"+
		"\2BA\3\2\2\2CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\b\5"+
		"\2HG\3\2\2\2IL\3\2\2\2JK\3\2\2\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2M\63\3\2"+
		"\2\2M@\3\2\2\2N\7\3\2\2\2OU\5\30\r\2PU\5\32\16\2QU\5\34\17\2RU\5\36\20"+
		"\2SU\5\26\f\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\t\3\2"+
		"\2\2VW\7\7\2\2W\13\3\2\2\2XY\7\16\2\2YZ\7\27\2\2Z[\7\25\2\2[\r\3\2\2\2"+
		"\\]\7\23\2\2]\17\3\2\2\2^_\7\22\2\2_`\7\21\2\2`a\7\r\2\2ab\7\13\2\2bc"+
		"\7\17\2\2cd\7\27\2\2de\7\5\2\2ef\7\27\2\2fg\7\n\2\2g\21\3\2\2\2hi\7\22"+
		"\2\2ij\7\21\2\2jk\7\4\2\2kl\7\13\2\2lm\7\24\2\2mn\7\27\2\2no\7\f\2\2o"+
		"p\7\30\2\2pq\7\5\2\2qv\5\24\13\2rs\7\5\2\2su\5\24\13\2tr\3\2\2\2ux\3\2"+
		"\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\n\2\2z\23\3\2\2\2{|\7"+
		"\b\2\2|}\7\27\2\2}\25\3\2\2\2~\177\7\3\2\2\177\27\3\2\2\2\u0080\u0081"+
		"\7\t\2\2\u0081\u0082\7\27\2\2\u0082\u0083\7\25\2\2\u0083\31\3\2\2\2\u0084"+
		"\u0085\7\26\2\2\u0085\u0086\7\27\2\2\u0086\u0087\7\25\2\2\u0087\33\3\2"+
		"\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\25\2\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7\27\2\2\u008e\u008f\7\25"+
		"\2\2\u008f\37\3\2\2\2\f\'-\61\67=DJMTv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}