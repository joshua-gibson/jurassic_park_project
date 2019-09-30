import com.codeclan.jurassicpark.back_end.BackEndApplication;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackEndApplication.class)
public class BackEndApplicationTest {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    ParkRepository parkRepository;

    @Test
    public void contextLoads(){}

    @Test
    public void canGetAllDinosaurs(){
        assertEquals(3, dinosaurRepository.findAll().size());
    }

    @Test
    public void findDinosaursByPaddock(){
        //List<Dinosaur> found = dinosaurRepository.getAllDinosaursWithPaddockId(1L);
        List<Dinosaur> found = dinosaurRepository.findDinosaursByPaddock(paddockRepository.findAll().get(0));
        assertEquals("Carl", found.get(0).getName());

    }


}
