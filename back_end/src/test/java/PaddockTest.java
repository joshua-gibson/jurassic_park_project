import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockTest {

    Park park;
    Paddock paddock;
    Carnivore carnivore;
    Herbivore herbivore;

    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, false, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        carnivore = new Carnivore("Dave", paddock, ECarnivore.TYRANNOSAURUS);

    }

    @Test
    public void hasName(){
        assertEquals("East Paddock", paddock.getName());
    }

    @Test
    public void checkVisitorCapacity(){
        assertEquals(50, paddock.getVisitorCapacity());
    }

    @Test
    public void checkDinosaurCapacity(){
        assertEquals(5, paddock.getDinosaurCapacity());
    }

    @Test
    public void hasPark(){
        assertEquals(park, paddock.getPark());
    }


    @Test
    public void canAddDinosaur(){
        paddock.addDinosaurs(carnivore);
        assertEquals(1, paddock.getDinosaurCount());
    }

}
