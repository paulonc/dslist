package com.paulo.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulo.dslist.dto.GameListDTO;
import com.paulo.dslist.dto.GameMinDTO;
import com.paulo.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	public ModelMapper modelMapper;

	@Autowired
	private GameListRepository gameListRepository;


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		return gameListRepository.findAll().stream().map(game -> modelMapper.map(game, GameListDTO.class))
				.collect(Collectors.toList());
	}

}
