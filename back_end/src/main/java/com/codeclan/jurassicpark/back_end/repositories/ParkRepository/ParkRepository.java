package com.codeclan.jurassicpark.back_end.repositories.ParkRepository;

import com.codeclan.jurassicpark.back_end.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Long> {

}


