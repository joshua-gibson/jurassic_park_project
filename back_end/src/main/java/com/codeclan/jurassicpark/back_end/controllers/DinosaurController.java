package com.codeclan.jurassicpark.back_end.controllers;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.enums.ECarnivore;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Species;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(value = "/dinosaurs")
public class DinosaurController {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @GetMapping
    public List<Dinosaur> getAllDinosaurs(){
        return dinosaurRepository.findAll();
    }

    @GetMapping(value = "/paddock/{paddock_id}")
    public List<Dinosaur> getDinosaursForPaddock(@PathVariable Long paddock_id){
        return dinosaurRepository.getAllDinosaursWithPaddockId(paddock_id);
    }

    @GetMapping(value = "/diet/{diet_type}")
    public List<Dinosaur> getDinosaursForDietType(@PathVariable String diet_type){
        return dinosaurRepository.findDinosaursByDietType(DietType.valueOf(diet_type));
    }
}
