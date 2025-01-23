package com.romario.dslist.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.romario.dslist.domain.entites.GameList;
import com.romario.dslist.domain.repository.GameListRepository;
import com.romario.dslist.dto.GameListDTO;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	

}
