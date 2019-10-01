package com.codeclan.jurassicpark.back_end.controllers;


import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Species;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/species")
public class SpeciesController {

    @Autowired
    SpeciesRepository speciesRepository;


    @GetMapping(value = "/diet/{diet_type}")
    public List<Species> getSpeciesWithDietType(@PathVariable String diet_type){
        return speciesRepository.getAllSpeciesWithDietType(diet_type);
    }
}
