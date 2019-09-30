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
    Dinosaur carnivore;
    Dinosaur herbivore;

    @Autowired
    SpeciesRepository speciesRepository;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500, 5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        carnivore = new Dinosaur("Dave", paddock, speciesRepository.findAll().get(0));

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
        paddock.addDinosaurToPaddock(carnivore);
        assertEquals(1, paddock.getDinosaurCount());
    }

}
