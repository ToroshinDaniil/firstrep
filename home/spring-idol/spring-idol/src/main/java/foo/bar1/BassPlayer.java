package foo.bar1;

/**
 * Created by Данил on 25.02.2016.
 */
public class BassPlayer implements Uchast {
    @Override

    public void play() {
        ins.perform();
    }
    Instrument ins=null;
    public BassPlayer(Instrument ins){
        this.ins=ins;
    }
}
