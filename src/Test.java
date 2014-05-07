/**
 * Created by Andreas on 7.05.2014.
 */

public class Test {
    public static void main (String[] args){
        JPitsaMenyyParser a = new JPitsaMenyyParser("createMenu(); SetMenuName(\"jeee\"); createIngredients(); add new ingredient = {sink, liha}; add new ingredient = {peekon, liha};");
        System.out.println(a.menuName);
        for(String x : a.tyybid.keySet()){
            for(String y : a.tyybid.get(x)){
                System.out.println(x + ": " + y);
            }
        }
    }


}
