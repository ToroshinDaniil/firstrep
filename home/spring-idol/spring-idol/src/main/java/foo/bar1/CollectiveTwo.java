package foo.bar1;

import java.util.Collection;
import java.util.List;

/**
 * Created by Данил on 25.02.2016.
 */
public class CollectiveTwo implements Collective {
    Collection<Uchast> colone=null;


    public CollectiveTwo(){}
    @Override
    public void vistuplenie(){
        for(Song s:songs) {
            System.out.printf("Collective two, song name is "+s.getname());
            System.out.println();
            for (Uchast uch : colone)
                uch.play();
        }
    }
    Collection<Song> songs=null;
    public CollectiveTwo(Collection<Uchast> colone, Collection<Song> songs){
        this.colone=colone;
        this.songs=songs;
    }

    public void setColone(List colone) {
        this.colone = colone;
    }

    public Collection getColone() {
        return colone;
    }

    public void setSongs(Collection songs) {
        this.songs = songs;
    }

    public Collection getSongs() {
        return songs;
    }
}
