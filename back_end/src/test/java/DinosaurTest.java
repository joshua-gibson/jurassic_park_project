import com.codeclan.jurassicpark.back_end.enums.EOmnivore;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {


    @Autowired
    SpeciesRepository speciesRepository;

    Park park;
    Paddock paddock;
    Dinosaur omnivore;


    @Before
    public void before(){
        park = new Park("Jurassic Park", 500,  5);
        paddock = new Paddock("East Paddock", 50, 5, park);
        omnivore = new Dinosaur("Alex", paddock, speciesRepository.findAll().get(0));
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
