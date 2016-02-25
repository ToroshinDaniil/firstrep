package foo.bar1;

/**
 * Created by Данил on 25.02.2016.
 */
public class GuitarPlayer implements Uchast {
    @Override

    public void play() {
        ins.perform();
    }
    Instrument ins=null;
    public GuitarPlayer(Instrument ins){
        this.ins=ins;
    }
}
