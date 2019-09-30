package com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;

import java.util.List;

public interface DinosaurRepositoryCustom {
    List<Dinosaur> getAllDinosaursWithPaddockId(Long paddockId);
    List<Dinosaur> findDinosaursByDietType(DietType dietType);
}
