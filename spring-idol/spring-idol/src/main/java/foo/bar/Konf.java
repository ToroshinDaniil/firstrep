package foo.bar;

import java.util.Collection;

/**
 * Created by Данил on 15.02.2016.
 */
public class Konf {
    Juggler jug=null;
    //Performer p=null;
    Collection<Performer> jugglers=null;
    public Collection<Performer> getJugglers(){return jugglers;}
    public void setJugglers(Collection<Performer> jugglers){this.jugglers=jugglers;}
    //public Konf(Performer p){this.p=p;}
    public void perform(){
        for(Performer p: jugglers)
        {
            System.out.println("Жонглер выходит на сцену");
            p.perform();
        }
    }
}
