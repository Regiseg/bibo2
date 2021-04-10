package genericclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    public void testCreate() {
        Container<Human> ch = new Container<>(new Human("Bibi"));
        assertEquals(ch.getValue().getClass(), Human.class);
        assertEquals("Bibi", ch.getName());

        Container<Subject> cs = new Container<>(new Subject("Java"));
        assertEquals(cs.getValue().getClass(), Subject.class);
        assertEquals("Java", cs.getName());

        Container<Trainer> ct = new Container<>(new Trainer("Lilike"));
        assertEquals("Lilike", ct.getName());
        assertEquals(new Trainer("Lilike"), ct.getValue());

        List<Container<Subject>> lc = Arrays.asList(cs);
        assertEquals(cs, lc.get(0));

    }
}