package com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository;

import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Species;

import java.util.List;

public interface SpeciesRepositoryCustom {
    List<Species> getAllSpeciesWithDietType(String dietType);
}
