package com.codeclan.jurassicpark.back_end.controllers;


import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/parks")
public class ParkController {

    @Autowired
    ParkRepository parkRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @GetMapping(value="/paddocks")
    public List<Paddock> getAllPaddocks(){
        return paddockRepository.findAll();
    }



}
