package com.codeclan.jurassicpark.back_end.components;


import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.enums.EHerbivore;
import com.codeclan.jurassicpark.back_end.enums.EOmnivore;
import com.codeclan.jurassicpark.back_end.models.*;
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

        Carnivore carn1 = new Carnivore("Carl", paddock1, ECarnivore.INDOSUCHUS);
        dinosaurRepository.save(carn1);

        Herbivore herb1 = new Herbivore("Harry", paddock1, EHerbivore.APATOSAURUS);
        dinosaurRepository.save(herb1);

        Omnivore omni1 = new Omnivore("Olly", paddock1, EOmnivore.KHAAN);
        dinosaurRepository.save(omni1);


    }
}