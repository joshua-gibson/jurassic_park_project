import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.models.Carnivore;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarnivoreTest {

    Park park;
    Paddock paddock;
    Carnivore carnivore;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, false, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        carnivore = new Carnivore("Richard",paddock, ECarnivore.TYRANNOSAURUS);
    }

    @Test
    public void hasName(){
        assertEquals("Richard", carnivore.getName());
    }


    @Test
    public void hasPaddock(){
        assertEquals(paddock, carnivore.getPaddock());
    }

}
