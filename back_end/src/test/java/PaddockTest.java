import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.models.*;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class PaddockTest {

    Park park;
    Paddock paddock;
    Paddock paddock2;
    Dinosaur herbivore2;
    Dinosaur herbivore;
    Species species;

    @Autowired
    SpeciesRepository speciesRepository;


    @Before
    public void before(){

        park = new Park("Jurassic Park", 500);
        paddock = new Paddock("East Paddock", 50, 1, park);
        paddock2 = new Paddock("East Paddock", 50, 3, park);
        species = new Species("Indosuchus", DietType.CARNIVORE, 7.0, "Indosuchus had a flattened crest on its skull.", "http://images.dinosaurpictures.org/Indosuchus_7076.jpg");
        herbivore = new Dinosaur("harry", paddock, species);
        herbivore2 = new Dinosaur("bob", paddock, species);

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
        assertEquals(1, paddock.getDinosaurCapacity());
    }

    @Test
    public void hasPark(){
        assertEquals(park, paddock.getPark());
    }


    @Test
    public void canAddDinosaurTrue(){
        paddock.addDinosaurToPaddock(herbivore);
        assertEquals(1, paddock.dinosaurCount());
    }

    @Test
    public void canAddDinosaurFalse(){
        paddock.addDinosaurToPaddock(herbivore);
        paddock.addDinosaurToPaddock(herbivore2);
        assertEquals(1, paddock.dinosaurCount());
    }

    @Test
    public void canRemoveDinosaurFromPaddock(){
        paddock2.addDinosaurToPaddock(herbivore);
        paddock2.addDinosaurToPaddock(herbivore2);
        paddock2.removeDinosaurFromPaddock(herbivore);
        assertEquals(1, paddock2.dinosaurCount());
    }





}
