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
            throw new UnexpectedException("NO ingredients.");
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
            JPitsaMenyyParser a = new JPitsaMenyyParser("createMenu(); SetMenuName(\"\"); createIngredients(); add new ingredient = {sink, liha}; add new ingredient = {sibul, muu};"
                    + "add new ingredient = {tomat, muu};"
                    + "add new ingredient = {salaami, liha};"
                    + "add new pizza = {nimi:Singipitsa, hind:5, add:tomat};"
                    + "add new pizza = {nimi:Juustupitsa, hind: 6, add: sibul};"
                    + "showWithIngredient(kurk);");
            System.out.println("Menüü nimi: " + a.menuName);
            populate(a.tyybid);
            for(String x : a.tyybid.keySet()){
                System.out.print(x + ": ");
                for(String y : a.tyybid.get(x)){
                    System.out.print(y + " ");
                }
                System.out.println();
            }
            System.out.println(a.pitsad.toString());
            for(String x : a.pitsad.keySet()){
                System.out.println("Nimi: " + x);
                for(int i = 0; i < a.pitsad.get(x).size(); i++){
                    if(i == 0){
                        System.out.println("    Hind: " + a.pitsad.get(x).get(i));
                        System.out.println("    Komponendid:");
                    }
                    else{
                        System.out.println("        " + a.pitsad.get(x).get(i));
                    }
                }
            }
            if(a.showWithI){
                if(a.koostisega.size() == 0){
                    throw new UnexpectedException("Error -> Ühelgi pitsal pole komponenti " + a.koostisegaString);
                }
                else {
                    System.out.println("Pitsa(d) komponendiga " + a.koostisegaString + " : ");
                    for(String x : a.koostisega.keySet()){
                        System.out.println(x);
                    }
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
