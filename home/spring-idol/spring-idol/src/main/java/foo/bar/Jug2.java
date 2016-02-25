package foo.bar;

/**
 * Created by Данил on 15.02.2016.
 */
public class Jug2 implements Performer {
    int countOfBeanbags;

    Poem poem = null;
    String name="vasya";
    public Jug2(){}

    public Jug2(int countOfBeanbags){
        this.countOfBeanbags = countOfBeanbags;
    }

    public Jug2(int countOfBeanbags, Poem poem){
        this.countOfBeanbags = countOfBeanbags;
        this.poem = poem;
    }

    public void perform(){
        System.out.println("juggling with " + countOfBeanbags + " beanbags");
        poem.recite();
    }

}
