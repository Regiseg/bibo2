package genericclass.trainer;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameConcatenatorTest {

    @Test
    public void testConcat(){
        List<Human> humans = Arrays.asList(
                new Human("John"),
                new Human("Jack"),
                new Human("Jane")
        );

        String s = new NameConcatenator().concat(humans);
        System.out.println(s);
    }

    @Test
    public void testAdd(){
        List<Human> lh = new ArrayList<>();
        new NameConcatenator().add(lh);
        assertEquals("Jack", lh.get(0).getName());

        List<Trainer> lt = new ArrayList<>();
        new NameConcatenator().add(lt);
        assertEquals(new Trainer("Jack"), lt.get(0));

    }

}