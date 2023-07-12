package com.paulo.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.dslist.dto.GameListDTO;
import com.paulo.dslist.dto.GameMinDTO;
import com.paulo.dslist.services.GameListService;
import com.paulo.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<GameListDTO> lists = gameListService.findAll();
		return new ResponseEntity<List<GameListDTO>>(lists, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{listId}/games")
	public ResponseEntity<?> findByList(@PathVariable("listId") Long listId) {
		List<GameMinDTO> games = gameService.findByList(listId);
		return new ResponseEntity<List<GameMinDTO>>(games, HttpStatus.OK);
	}
	
	
	

}
