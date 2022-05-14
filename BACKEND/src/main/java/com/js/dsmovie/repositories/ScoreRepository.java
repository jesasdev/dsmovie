package com.js.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.dsmovie.entities.Score;
import com.js.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
