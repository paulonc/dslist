package com.paulo.dslist.dto;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {
	}

	public GameListDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
