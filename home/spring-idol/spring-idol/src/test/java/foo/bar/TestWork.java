package foo.bar;
import static org.junit.Assert.*;

import foo.bar1.Song1;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Данил on 03.03.2016.
 */
public class TestWork {
    @Test
    public void AddTest(){

        Song1 qwe=new Song1("aaab","bbb");
        Song1 qwe1=new Song1("aaa","bbb");
        if(qwe.getname()!=qwe1.getname())
            fail("Not equals");
    }
}
