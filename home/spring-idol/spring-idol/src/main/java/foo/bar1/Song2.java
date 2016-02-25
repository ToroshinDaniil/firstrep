package foo.bar1;

/**
 * Created by Данил on 25.02.2016.
 */
public class Song2 implements Song {
    String name, text;
    public Song2(String name, String text){
        this.name=name;
        this.text=text;
    }
    public void songp(){
        //System.out.println(name);
        System.out.println(text);
    }
    public String getname(){
        return name;
    }
}
