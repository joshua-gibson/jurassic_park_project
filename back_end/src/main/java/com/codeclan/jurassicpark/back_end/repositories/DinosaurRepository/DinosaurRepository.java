package com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository;

import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DinosaurRepository extends JpaRepository <Dinosaur, Long> {

    List<Dinosaur> findByPark(Long id);

    List<Dinosaur> findByPaddocksParkId(Long id);
}
