import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andreas on 7.05.2014.
 */

public class JPitsaMenyyParser {

    String programm;
    public static boolean showmenu = false;

    String menuName;


    public JPitsaMenyyParser(String program){
        this.programm = program;
        createParseTree();
    }

    public Map<String, List<String>> tyybid = new HashMap<String, List<String>>();
    public Map<String, List<String>> pitsad = new HashMap<String, List<String>>();
    public List<String> a;

    private ParseTree createParseTree() {
        ANTLRInputStream antlrInput = new ANTLRInputStream(programm);
        PizzaLexer lexer = new PizzaLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PizzaParser parser = new PizzaParser(tokens);
        ParseTree tree = parser.pizza();
        puuRonimine(tree);
        System.out.println(tree.toStringTree(parser));
        return tree;
    }

    private void puuRonimine(ParseTree tree){
        System.out.println("Puu: " + tree.toStringTree());
        if(tree instanceof PizzaParser.PizzaRContext){
            System.out.println(tree.getChildCount());
            puuRonimine(tree.getChild(0));
        }

        else if(tree instanceof PizzaParser.Pizza2RContext){
            System.out.println(tree.getChildCount());
            //child0 - createmenu, child1 - createingredients, child2 - addingredients,
            for(int j = 0; j < tree.getChildCount(); j++){
                puuRonimine(tree.getChild(j));
            }
        }

        else if(tree instanceof PizzaParser.LoomenuuContext){
            if(tree.getText().equals("createMenu();")){
                this.showmenu = true;
            }
            else{
                throw new UnsupportedOperationException();
            }
        }

        else if(tree instanceof PizzaParser.MenuuNimiContext){
            System.out.println(tree.getText() + "; " + tree.getChildCount());
            this.menuName = tree.getChild(1).getText();
        }

        else if(tree instanceof PizzaParser.LooKoostisContext){

        }

        else if(tree instanceof PizzaParser.LisaKoostisListiContext){
            //child0 - addnew, child1 - =, child2 = {, child3 - tähtis, child5 - tähtis
            System.out.println(tree.getChildCount());
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
            String pitsahind = tree.getChild(8).getText();
            a = new ArrayList<String>();
            a.add(pitsahind);
            for(int i = 10; i < tree.getChildCount() - 2; i = i + 2){
                ParseTree tree2 = tree.getChild(i);
                a.add(tree2.getChild(2).getText());
            }
            pitsad.put(pitsanimi, a);
        }

        else if(tree instanceof PizzaParser.LisaKoostisContext){

        }

        else if(tree instanceof PizzaParser.NaitaMenuuContext){

        }

        else if(tree instanceof PizzaParser.NaitaKoostisetaContext){

        }

        else if(tree instanceof PizzaParser.NaitaKoostisegaContext){

        }

        else if(tree instanceof PizzaParser.NaitaTuubigaContext){

        }

        else if(tree instanceof PizzaParser.NaitaTuubitaContext){

        }

        else {
            throw new UnsupportedOperationException();
        }
    }

}
