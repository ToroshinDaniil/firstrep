package foo.bar1;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Данил on 03.03.2016.
 */
@Configuration
public class Config {
    @Bean
    public Drums drums(){
        return new Drums();
    }
    @Bean
    public Bass bass(){
        return new Bass();
    }
    @Bean
    public Guitar guitar(){
        return new Guitar();
    }
    @Bean
    public Song1 song1(){
        return new Song1("song1", "fjdsnf irnfi qnd");
    }
    @Bean
    public Song2 song2(){
        return new Song2("song2", "fcabdfbr ynrndg");
    }
    @Bean
    public Song3 song3(){return  new Song3("song3", "sdacsdg gsgrg"); }
    @Bean
    public BassPlayer bassplayer(){return new BassPlayer(bass());}
    @Bean
    public DrumsPlayer drumsplayer(){return new DrumsPlayer(drums());}
    @Bean
    public GuitarPlayer guitarplayer(){return new GuitarPlayer(guitar());}
    @Bean
    public Vocal vocalist(){return new Vocal(guitar(),song1());}
    @Bean
    public CollectiveOne collectiveone(){
        Collection<Uchast> colone=new ArrayList<Uchast>();
        colone.add(bassplayer());
        colone.add(vocalist());
        Collection<Song> songs=new ArrayList<Song>();
        songs.add(song1());
        songs.add(song3());
        return new CollectiveOne(colone, songs);
    }
    @Bean
    public CollectiveTwo collectivetwo(){
        Collection<Uchast> colone=new ArrayList<Uchast>();
        colone.add(drumsplayer());
        colone.add(vocalist());
        colone.add(bassplayer());
        Collection<Song> songs=new ArrayList<Song>();
        songs.add(song2());
        songs.add(song3());
        return new CollectiveTwo(colone, songs);
    }
    @Bean
    public Konf konf(){
        Collection<Collective> collectives=new ArrayList<Collective>();
        collectives.add(collectiveone());
        collectives.add(collectivetwo());
        return new Konf(collectives);
    }
}
