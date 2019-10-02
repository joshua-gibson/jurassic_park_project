package com.codeclan.jurassicpark.back_end.controllers;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/dinosaurs")
public class DinosaurController {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    ParkRepository parkRepository;

    @Autowired
    SpeciesRepository speciesRepository;

    @GetMapping(value = "/paddock/{paddock_id}")
    public List<Dinosaur> getDinosaursForPaddock(@PathVariable Long paddock_id){
        return dinosaurRepository.getAllDinosaursWithPaddockId(paddock_id);
    }

    @GetMapping(value = "/diet/{diet_type}")
    public List<Dinosaur> getDinosaursForDietType(@PathVariable String diet_type){
        return dinosaurRepository.findDinosaursByDietType(DietType.valueOf(diet_type));
    }


    @GetMapping(path = "/tidy")
    public List<Dinosaur> getAllDinosaurs(){
        return dinosaurRepository.findAll();
    }


}
