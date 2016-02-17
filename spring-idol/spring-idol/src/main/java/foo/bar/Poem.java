package foo.bar;

/**
 * Created by etc on 20.03.2015.
 */
public class Poem {
    String text;
    public Poem(String text){
        this.text=text;
    }

    public void recite(){
        System.out.println(text);
    }

}
