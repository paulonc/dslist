package com.paulo.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.dslist.dto.GameMinDTO;
import com.paulo.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	public ModelMapper modelMapper;

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		return gameRepository.findAll()
				.stream()
				.map(game -> modelMapper.map(game, GameMinDTO.class))
				.collect(Collectors.toList());
	}

}
