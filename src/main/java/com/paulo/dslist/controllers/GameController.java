package com.paulo.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.dslist.dto.GameDTO;
import com.paulo.dslist.dto.GameMinDTO;
import com.paulo.dslist.errorMessage.ErroGame;
import com.paulo.dslist.exception.GameNotFoundException;
import com.paulo.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<GameMinDTO> games = gameService.findAll();
		return new ResponseEntity<List<GameMinDTO>>(games, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id) {
		try {
			GameDTO game = gameService.findById(id);
			return new ResponseEntity<GameDTO>(game, HttpStatus.OK);
		} catch (GameNotFoundException e) {
			return ErroGame.erroGameNOTFOUND(id.toString());
		}
	}
	
	
	
	

}
