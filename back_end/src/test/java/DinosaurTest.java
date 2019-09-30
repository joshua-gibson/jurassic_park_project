import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
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
    Paddock paddock2;

    Dinosaur omnivore;


    @Before
    public void before(){

        park = new Park("Jurassic Park", 500);
        paddock = new Paddock("East Paddock", 50, 5, park);
        paddock2 = new Paddock("West Paddock", 50, 5, park);
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

//    @Test
//    public void canChangePaddock(){
//        paddock.addDinosaurToPaddock(omnivore);
//        omnivore.movePaddock(paddock2);
//        assertEquals("Alex", paddock2());
//    }


}
