import com.sun.xml.internal.bind.v2.TODO;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.rmi.UnexpectedException;
import java.util.*;

/**
 * Created by Andreas on 7.05.2014.
 */

public class JPitsaMenyyParser {

    public static boolean isNumeric(String str){
        try {
            double d = Double.parseDouble(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    String programm;
    boolean showmenu = false;
    boolean showWithI = false;
    boolean showWithoutI = false;
    boolean showWithT = false;
    boolean showWithoutT = false;

    String menuName;

    public static List<String> koostisOsadKoos = new ArrayList<String>();

    public static void komponendid(Map<String, List<String>> map) throws UnexpectedException {
        if(map.size() == 0){
            throw new UnexpectedException("Error -> Komponendid puuduvad.");
        }
        else {
            for(String x : map.keySet()){
                for(String y : map.get(x)){
                    koostisOsadKoos.add((y));
                }
            }
        }
    }

    public Map<String, List<String>> koostisega = null;
    public Map<String, List<String>> koostiseta = null;
    public String koostisegaString = null;
    public String koostisetaString = null;
    public void naitaKoostisegaVoiIlma(String komponent){
        this.koostisegaString = komponent;
        this.koostisetaString = komponent;
        koostisega = new HashMap<String, List<String>>();
        koostiseta = new HashMap<String, List<String>>();
        for(String x : pitsad.keySet()){
            for(String y : pitsad.get(x)){
                if(y.equals(komponent)){
                    koostisega.put(x, pitsad.get(x));
                }
            }
        }
        for(String x : pitsad.keySet()){
            if(!koostisega.containsKey(x)){
                koostiseta.put(x, pitsad.get(x));
            }
        }
    }

    public Map<String, List<String>> tyybiga = null;
    public Map<String, List<String>> tyybita = null;
    public String tyybigaString = null;
    public void naitaTyybigaVoiIlma(String tyybinimi) throws UnexpectedException {
        if(!tyybid.containsKey(tyybinimi)){
            throw new UnexpectedException("Error -> Sellist komponentide tüübi ei ole (" + tyybinimi + ")");
        }
        else{
            this.tyybigaString = tyybinimi;
            System.out.println(tyybid.toString());
            List<String> tyybiKomponendid = tyybid.get(tyybinimi);
            for(String x : tyybiKomponendid){
                System.out.println("KOMPONENDID: " + x);
            }
            tyybiga = new HashMap<String, List<String>>();
            //TODO
            for(String x : pitsad.keySet()){
                for(String y : pitsad.get(x)){

                    if(tyybiKomponendid.contains(y)){
                        System.out.println(x + " SISALDAB "  + y);
                        if(!tyybiga.containsKey(x)){
                            System.out.println("TÜÜBIGA: " + x);
                            tyybiga.put(x, pitsad.get(x));
                        }
                    }
                }
            }
            tyybita = new HashMap<String, List<String>>();
            for(String x : pitsad.keySet()){
                if(!tyybiga.containsKey(x)){
                    tyybita.put(x, pitsad.get(x));
                    System.out.println("TÜÜBITA: " + x);
                }
            }
        }
    }

    private void ingredientsInPizzas() throws UnexpectedException {
        for(String x : pitsad.keySet()){
            for(int i = 1; i < pitsad.get(x).size(); i++){
                if(koostisOsadKoos.contains(pitsad.get(x).get(i)) != true){
                    throw new UnexpectedException("ERROR -> " + pitsad.get(x).get(i) + " ei ole komponendina välja toodud.");
                }
            }
        }

    }


    public JPitsaMenyyParser(String program) throws UnexpectedException {
        this.programm = program;
        createParseTree();
    }

    public Map<String, List<String>> tyybid = new HashMap<String, List<String>>();
    public Map<String, List<String>> pitsad = new HashMap<String, List<String>>();
    public List<String> a;

    private void createParseTree() throws UnexpectedException {
            ANTLRInputStream antlrInput = new ANTLRInputStream(programm);
            PizzaLexer lexer = new PizzaLexer(antlrInput);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PizzaParser parser = new PizzaParser(tokens);
            ParseTree tree = parser.pizza();
            puuRonimine(tree);
            komponendid(tyybid);
            ingredientsInPizzas();
    }

    private void puuRonimine(ParseTree tree) throws UnexpectedException {
        if(tree instanceof PizzaParser.PizzaRContext){
            puuRonimine(tree.getChild(0));
        }

        else if(tree instanceof PizzaParser.Pizza2RContext){
            //child0 - createmenu, child1 - createingredients, child2 - addingredients,
            for(int j = 0; j < tree.getChildCount(); j++){
                puuRonimine(tree.getChild(j));
            }
        }

        else if(tree instanceof PizzaParser.LoomenuuContext){
            if(tree.getText().equals("<missing 'createMenu();'>")){
                throw new IllegalArgumentException("Error -> Puudub createMenu();");
            }
            else if(tree.getText().equals("createMenu();") != true){
                System.out.println(programm.indexOf(tree.getText()));
                throw new IllegalArgumentException("Error -> Ootasin createMenu(); aga sain -> " + tree.getText());
            }
        }

        else if(tree instanceof PizzaParser.MenuuNimiContext){
            this.menuName = tree.getChild(1).getText();
            if(this.menuName.equals("<missing Nimi>")){
                this.menuName = "Default";
            }
        }

        else if(tree instanceof PizzaParser.LooKoostisContext){
            if(!tree.getText().equals("createIngredients();")){
                throw new UnexpectedException("Error -> ootasin createIngredients(); aga sain -> " + tree.getText() + ". " + programm.indexOf(tree.getText()));
            }
        }

        else if(tree instanceof PizzaParser.LisaKoostisListiContext){
            //child0 - addnew, child1 - =, child2 = {, child3 - tähtis, child5 - tähtis
            List<String> ingredients;
            if(tyybid.get(tree.getChild(5).getText()) != null){
                ingredients = tyybid.get(tree.getChild(5).getText());
                ingredients.add(tree.getChild(3).getText());
            }
            else{
                ingredients = new ArrayList<String>();
                ingredients.add(tree.getChild(3).getText());
            }
            tyybid.put(tree.getChild(5).getText(), ingredients);
        }

        else if(tree instanceof PizzaParser.LisaPitsaContext){
            //6 - nimi, 9 - hind, 11, 13, 15, ... va 2 viimast
            String pitsanimi = tree.getChild(5).getText();
            if(!tree.getChild(7).getText().equals("hind:")){
                throw new UnexpectedException("Error -> ootasin hind: , aga sain -> " + tree.getChild(7).getText());
            }
            if(tree.getChild(8).getText().equals("<missing Arv>")){
                throw new UnexpectedException("Error -> Puudub hind.");
            }
            if(!isNumeric(tree.getChild(8).getText())){
                throw new UnexpectedException("Error -> " + tree.getChild(8).getText() + " ei ole number");
            }
            String pitsahind = tree.getChild(8).getText();
            a = new ArrayList<String>();
            a.add(pitsahind);
            for(int i = 10; i < tree.getChildCount() - 2; i = i + 2){
                ParseTree tree2 = tree.getChild(i);
                System.out.println(tree2.getText());
                if(tree2 instanceof PizzaParser.LisaKoostisContext){
                    if(!tree2.getChild(0).getText().equals("add")
                            || !tree2.getChild(1).getText().equals(":")){
                        throw new UnexpectedException("Error -> Ootasin add:komponent aga sain -> " + tree2.getText());
                    }
                    else if(tree2.getChild(2).getText().equals("<missing Nimi>")){
                        throw new UnexpectedException("Error -> Puudub komponent");
                    }
                    else{
                        a.add(tree2.getChild(2).getText());
                    }
                }
                else{
                    throw new UnexpectedException("Error -> Ootasin add:komponent aga sain -> " + tree2.getText());
                }
            }
            pitsad.put(pitsanimi, a);
        }

        else if(tree instanceof PizzaParser.NaitaMenuuContext){
            if(tree.getText().equals("showMenu();")){
                this.showmenu = true;
            }
            else{
                throw new UnsupportedOperationException();
            }

        }

        else if(tree instanceof PizzaParser.NaitaKoostisetaContext){
            if(tree.getChild(1).getText().equals("<missing Nimi>")){
                throw new IllegalArgumentException("Error -> showWithoutIngredient(); peab võtma ühe argumendiks komponendi nime");
            }
            else if (tree.getChild(0).getText().equals("showWithoutIngredient(") == false
                    || tree.getChild(2).getText().equals(");") == false){
                throw new IllegalArgumentException("Error -> ootasin showWithoutIngredient(komponent); aga sain -> " + tree.getText());
            }
            else {
                this.showWithoutI = true;
                naitaKoostisegaVoiIlma(tree.getChild(1).getText());
            }

        }

        else if(tree instanceof PizzaParser.NaitaKoostisegaContext){
            //0 1 2
            if(tree.getChild(1).getText().equals("<missing Nimi>")){
                throw new IllegalArgumentException("Error -> showWithIngredient(); peab võtma ühe argumendiks komponendi nime");
            }
            else if (tree.getChild(0).getText().equals("showWithIngredient(") == false
                    || tree.getChild(2).getText().equals(");") == false){
                throw new IllegalArgumentException("Error -> ootasin showWithIngredient(komponent); aga sain -> " + tree.getText());
            }
            else {
                this.showWithI = true;
                naitaKoostisegaVoiIlma(tree.getChild(1).getText());
            }

        }

        else if(tree instanceof PizzaParser.NaitaTuubigaContext){
            if(tree.getChild(1).getText().equals("<missing Nimi>")){
                throw new IllegalArgumentException("Error -> showWithType(); peab võtma ühe argumendiks tüübi nime");
            }
            else if (tree.getChild(0).getText().equals("showWithType(") == false
                    || tree.getChild(2).getText().equals(");") == false){
                throw new IllegalArgumentException("Error -> ootasin showWithType(tüüp); aga sain -> " + tree.getText());
            }
            else {
                this.showWithT = true;
                naitaTyybigaVoiIlma(tree.getChild(1).getText());
            }
        }

        else if(tree instanceof PizzaParser.NaitaTuubitaContext){
            if(tree.getChild(1).getText().equals("<missing Nimi>")){
                throw new IllegalArgumentException("Error -> showWithoutType(); peab võtma ühe argumendiks tüübi nime");
            }
            else if (tree.getChild(0).getText().equals("showWithoutType(") == false
                    || tree.getChild(2).getText().equals(");") == false){
                throw new IllegalArgumentException("Error -> ootasin showWithoutType(tüüp); aga sain -> " + tree.getText());
            }
            else {
                this.showWithoutT = true;
                System.out.println("NÄITA TÜÜBIGA");
                naitaTyybigaVoiIlma(tree.getChild(1).getText());
            }
        }

        else {
            throw new IllegalArgumentException("Error -> Midagi ootamatut");
        }
    }

}
