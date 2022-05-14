package com.js.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
