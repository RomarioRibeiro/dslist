package com.romario.dslist.dto;

import com.romario.dslist.domain.entites.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {

	}

	public GameListDTO(GameList entyti) {
		id = entyti.getId();
		name = entyti.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
}
