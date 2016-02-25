package foo.bar1;

import java.util.Collection;

/**
 * Created by Данил on 25.02.2016.
 */
public class Konf {
    Collection<Collective> collectives=null;
    public void setCollectives(Collection<Collective> collectives){
        this.collectives=collectives;
    }
    public void perfCollectives(){
        for(Collective c:collectives)
            c.vistuplenie();
    }
}
