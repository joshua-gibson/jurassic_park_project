package com.codeclan.jurassicpark.back_end.components;


import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.enums.EHerbivore;
import com.codeclan.jurassicpark.back_end.enums.EOmnivore;
import com.codeclan.jurassicpark.back_end.models.*;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ParkRepository parkRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    SpeciesRepository speciesRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Park jurassicPark = new Park("Jurassic Park", 10, 2 );
        parkRepository.save(jurassicPark);

        Paddock paddock1 = new Paddock("paddock1", 1, 2, jurassicPark);
        paddockRepository.save(paddock1);

        speciesRepository.save(new Species("Indosuchus", DietType.CARNIVORE, 7.0, "Indosuchus had a flattened crest on its skull.", "http://images.dinosaurpictures.org/Indosuchus_7076.jpg"));
        speciesRepository.save(new Species( "Apatosaurus", DietType.HERBIVORE, 21.0, "Named the 'deceptive lizard' because its skull was confused with those of other sauropods until 1909.", "http://images.dinosaurpictures.org/apatosaurus_33e1.jpg"));

        Dinosaur carn1 = new Dinosaur("Carl", paddock1, speciesRepository.findSpeciesByType("Indosuchus"));
        dinosaurRepository.save(carn1);

        Dinosaur herb1 = new Dinosaur("Harry", paddock1, speciesRepository.findSpeciesByType("Indosuchus"));
        dinosaurRepository.save(herb1);

        Dinosaur omni1 = new Dinosaur("Olly", paddock1, speciesRepository.findSpeciesByType("Apatosaurus"));
        dinosaurRepository.save(omni1);




    }
}