package com.codeclan.jurassicpark.back_end.controllers;


import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paddocks")
public class PaddockController {

    @Autowired
    PaddockRepository paddockRepository;

    @GetMapping(path = "/tidy")
    public List<Paddock> getAllPaddocks(){
        return paddockRepository.findAll();
    }



}
