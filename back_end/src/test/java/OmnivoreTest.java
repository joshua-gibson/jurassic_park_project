import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.enums.EOmnivore;
import com.codeclan.jurassicpark.back_end.models.Carnivore;
import com.codeclan.jurassicpark.back_end.models.Omnivore;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmnivoreTest {

    Park park;
    Paddock paddock;
    Omnivore omnivore;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, false, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        omnivore = new Omnivore("Alex", paddock, EOmnivore.KHAAN);
    }

    @Test
    public void hasName(){
        assertEquals("Alex", omnivore.getName());
    }


    @Test
    public void hasPaddock(){
        assertEquals(paddock, omnivore.getPaddock());
    }
}
