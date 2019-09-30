package com.codeclan.jurassicpark.back_end.repositories.PaddockRepository;

import com.codeclan.jurassicpark.back_end.models.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaddockRepository extends JpaRepository <Paddock, Long>, PaddockRepositoryCustom {

    List<Paddock> findPaddockByParkId(Long id);
}
