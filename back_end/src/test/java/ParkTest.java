import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import com.codeclan.jurassicpark.back_end.models.Species;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock paddock;
    Paddock paddock2;
    Paddock paddock3;
    Species species;
    Dinosaur dinosaur;
    Dinosaur dinosaur2;
    Dinosaur dinosaur3;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500);
        paddock = new Paddock("East Paddock", 50, 5, park);
        paddock2 = new Paddock("l", 50, 5, park);
        paddock3 = new Paddock("b", 50, 5, park);
        species = new Species("Indosuchus", DietType.CARNIVORE, 7.0, "Indosuchus had a flattened crest on its skull.", "http://images.dinosaurpictures.org/Indosuchus_7076.jpg");
        dinosaur = new Dinosaur("harry", paddock, species);
        dinosaur2 = new Dinosaur("paul", paddock, species);
        dinosaur3 = new Dinosaur("ringo", paddock, species);
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

    @Test
    public void canFindPaddockById(){
        park.addPaddock(paddock);
        park.addPaddock(paddock2);
        park.addPaddock(paddock3);
        assertEquals(paddock2, park.findPaddockById(1));
    }

    @Test
    public void canMoveDinosaur(){
        paddock.addDinosaurToPaddock(dinosaur);
        paddock.addDinosaurToPaddock(dinosaur2);
        paddock.addDinosaurToPaddock(dinosaur3);
        park.moveDinosaur(dinosaur, paddock2);
        assertEquals(paddock2, dinosaur.getPaddock());
        assertEquals(paddock, dinosaur2.getPaddock());
        assertEquals(paddock, dinosaur3.getPaddock());
//        assertEquals(1, paddock2.dinosaurCount());
        assertEquals(2, paddock.dinosaurCount());

    }

//    @Test
//    public void canMoveDinoToNewPaddock(){
//        park.moveDinosaur(1, 2, paddock, park);
//        assertEquals(paddock3, );
//
//    }



}
