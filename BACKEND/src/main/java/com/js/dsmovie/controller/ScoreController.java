package com.js.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.js.dsmovie.dto.MovieDTO;
import com.js.dsmovie.dto.ScoreDTO;
import com.js.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore (@RequestBody ScoreDTO dto){
		MovieDTO movieDto = service.saveScore(dto);
		return movieDto;
		
	}
}
