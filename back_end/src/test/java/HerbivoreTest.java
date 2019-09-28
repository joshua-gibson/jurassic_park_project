import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.enums.EHerbivore;
import com.codeclan.jurassicpark.back_end.models.Carnivore;
import com.codeclan.jurassicpark.back_end.models.Herbivore;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbivoreTest {

    Park park;
    Paddock paddock;
    Herbivore herbivore;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, false, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        herbivore = new Herbivore("Tim", paddock, EHerbivore.APATOSAURUS);
    }

    @Test
    public void hasName(){
        assertEquals("Richard", herbivore.getName());
    }


    @Test
    public void hasPaddock(){
        assertEquals(paddock, herbivore.getPaddock());
    }
}
