package foo.bar1;

/**
 * Created by Данил on 25.02.2016.
 */
public class Song1 implements Song {
    String name, text;
    public Song1(String name, String text){
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
