package com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DinosaurRepository extends JpaRepository <Dinosaur, Long>, DinosaurRepositoryCustom {

    List<Dinosaur> findDinosaursByPaddock(Paddock paddock);
    List<Dinosaur> getAllDinosaursWithPaddockId(Long paddockId);
    List<Dinosaur> findDinosaursByDietType(DietType dietType);



}
