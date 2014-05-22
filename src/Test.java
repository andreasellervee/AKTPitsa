import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Andreas on 7.05.2014.
 */

public class Test {

    static List<String> koostisOsadKoos = new ArrayList<String>();
    public static void populate(Map<String, List<String>> map) throws UnexpectedException {
        if(map.size() == 0){
            throw new UnexpectedException("Error -> No ingredients.");
        }
        else {
            for(String x : map.keySet()){
                for(String y : map.get(x)){
                    koostisOsadKoos.add((y));
                }
            }
        }
    }
    public static void main (String[] args) throws UnexpectedException {
        try {
            JPitsaMenyyParser a = new JPitsaMenyyParser("createMenu(); setMenuName(); createIngredients(); add new ingredient = {sink, liha}; add new ingredient = {sibul, muu};"
                    + "add new ingredient = {tomat, muu};"
                    + "add new ingredient = {salaami, liha};"
                    + "add new pizza = {nimi:Tomatipitsa, hind:5, add:tomat, add:sibul};"
                    + "add new pizza = {nimi:T, hind:5, add:tomat};" +
                    "add new pizza = {nimi:S, hind:5, add:sink};"
                    + "add new pizza = {nimi:Singipitsa, hind: 6, add: sink};"
                    + "showWithIngredient(sibul);"
                    + "showWithType(muu);");
            if(a.showWithoutT){

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
