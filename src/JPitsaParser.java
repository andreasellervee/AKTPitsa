/**
 * Created by Andreas on 12.05.2014.
 */
public class JPitsaParser {
    String kood;
    int i;

    public JPitsaParser(String kood){
        this.kood = kood.replaceAll("[ ]*", "") + "$";
        System.out.println(this.kood);
        this.i = 0;
    }

    public boolean match (String alamsone){
        if(alamsone.equals(kood.substring(i, alamsone.length()))){
            return true;
        }
        else {
            return false;
        }
    }

    public void startParse(){
        pizza(this.kood);
        if(match("$")){
            System.out.println("Jee");
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void pizza(String programm){
        pizza2(programm);
    }

    public void pizza2(String programm){
        if(match("createMenu();")){

        }
        else{
            throw new IllegalArgumentException();
        }
    }

}
