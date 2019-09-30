import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock paddock;
    Paddock paddock2;
    Paddock paddock3;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500);
        paddock = new Paddock("East Paddock", 50, 5, park);
        paddock2 = new Paddock("l", 50, 5, park);
        paddock3 = new Paddock("b", 50, 5, park);

    }

    @Test
    public void canGetAllPaddocks(){
        park.addPaddock(paddock);
        park.addPaddock(paddock2);
        park.addPaddock(paddock3);
        assertEquals(3, park.getPaddock().size());
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
        assertEquals(3, park.parkPaddockCapacity());
    }

    @Test
    public void canAddPaddockToParkTrue(){
        park.addPaddock(paddock);
        assertEquals(1, park.paddocksCount());
    }

    @Test
    public void canAddPaddockToParkFalse(){
        park.addPaddock(paddock);
        park.addPaddock(paddock2);
        park.addPaddock(paddock3);
        assertEquals(2, park.paddocksCount());
    }

}
