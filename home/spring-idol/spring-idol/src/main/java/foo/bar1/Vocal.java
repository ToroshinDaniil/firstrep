package foo.bar1;

/**
 * Created by Данил on 25.02.2016.
 */
public class Vocal implements Uchast {
    @Override
    public void play() {
        ins.perform();
        s.songp();
    }
    Instrument ins=null;
    Song s=null;
    public Vocal(Instrument ins, Song s){
        this.ins=ins;
        this.s=s;
    }
}
