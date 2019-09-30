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

        Park jurassicPark = new Park("Jurassic Park", 10);
        parkRepository.save(jurassicPark);

        Paddock paddock1 = new Paddock("Swampy Copse", 50, 2, jurassicPark);
        paddockRepository.save(paddock1);

        Paddock paddock2 = new Paddock("T-Rex Meadow", 20, 1, jurassicPark);
        paddockRepository.save(paddock2);

        Paddock paddock3 = new Paddock("Stony Grassland", 30, 5, jurassicPark);
        paddockRepository.save(paddock3);

        Paddock paddock4 = new Paddock("DUP Party", 30, 10, jurassicPark);
        paddockRepository.save(paddock4);

        Paddock paddock5 = new Paddock("Central view", 40, 5, jurassicPark);
        paddockRepository.save(paddock5);

        Paddock paddock6 = new Paddock("Herb Valley", 50, 7, jurassicPark);
        paddockRepository.save(paddock6);

        Paddock paddock7 = new Paddock("Grassy Knoll", 30, 4, jurassicPark);
        paddockRepository.save(paddock7);

        Paddock paddock8 = new Paddock("Nublar", 20, 4, jurassicPark);
        paddockRepository.save(paddock8);



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