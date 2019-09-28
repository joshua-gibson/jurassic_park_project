package com.codeclan.jurassicpark.back_end.controllers;

import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class DinosaurController {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @GetMapping(value = "/park/{id}")
    public List<Dinosaur> findByPark(@PathVariable Long id){
        return dinosaurRepository.findByPaddocksParkId(id);
    }

}
