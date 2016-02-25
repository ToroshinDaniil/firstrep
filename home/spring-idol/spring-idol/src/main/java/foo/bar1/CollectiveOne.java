package foo.bar1;

import java.util.Collection;

/**
 * Created by Данил on 25.02.2016.
 */
public class CollectiveOne implements Collective {
    Collection<Uchast> colone=null;
    Collection<Song> songs=null;

    public CollectiveOne(){};

    public CollectiveOne(Collection<Uchast> colone, Collection<Song> songs){
        this.colone=colone;
        this.songs=songs;
    }
    @Override
    public void vistuplenie(){
        for(Song s:songs) {
            System.out.printf("Collective one, song name is "+s.getname());
            for (Uchast uch : colone)
                uch.play();
        }
    }

    public void setColone(Collection colone) {
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
