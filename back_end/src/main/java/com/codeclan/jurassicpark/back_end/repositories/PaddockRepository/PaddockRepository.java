package com.codeclan.jurassicpark.back_end.repositories.PaddockRepository;

import com.codeclan.jurassicpark.back_end.models.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaddockRepository extends JpaRepository <Paddock, Long> {
}
