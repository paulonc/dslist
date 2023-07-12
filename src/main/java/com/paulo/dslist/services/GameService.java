package com.paulo.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulo.dslist.dto.GameDTO;
import com.paulo.dslist.dto.GameMinDTO;
import com.paulo.dslist.entities.Game;
import com.paulo.dslist.exception.GameNotFoundException;
import com.paulo.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	public ModelMapper modelMapper;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) throws GameNotFoundException {
		Game game = getGameId(id);
		return modelMapper.map(game, GameDTO.class);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(game -> modelMapper.map(game, GameMinDTO.class))
				.collect(Collectors.toList());
	}

	private Game getGameId(Long id) throws GameNotFoundException {
		return gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id.toString()));
	}

}
