package com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository;

import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinosaurRepository extends JpaRepository <Dinosaur, Long> {
}
