package com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository;

import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeciesRepository extends JpaRepository <Species, Long>, SpeciesRepositoryCustom {

    List<Species> getAllSpeciesWithDietType(String dietType);
    Species findSpeciesByType(String name);
}
