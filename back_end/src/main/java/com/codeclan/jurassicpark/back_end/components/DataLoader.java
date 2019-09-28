package com.codeclan.jurassicpark.back_end.components;


import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.models.Carnivore;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
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

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Park jurassicPark = new Park("Jurassic Park", 10, false, 2 );
        parkRepository.save(jurassicPark);

        Paddock paddock1 = new Paddock("paddock1", 1, 2, jurassicPark);
        paddockRepository.save(paddock1);

        Carnivore dino1 = new Carnivore("Dave", paddock1, ECarnivore.INDOSUCHUS);
        dinosaurRepository.save(dino1);


    }
}