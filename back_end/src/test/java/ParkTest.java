import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock paddock;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);

    }


    @Test
    public void hasName(){
        assertEquals("Jurassic Park", park.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(500, park.getCapacity());
    }

    @Test
    public void checkPaddockCapacity(){
        assertEquals(5, park.getPaddockCapacity());
    }

    @Test
    public void canAddPaddock(){
        park.addPaddock(paddock);
        assertEquals(1, park.getPaddocksCount());

    }

}
