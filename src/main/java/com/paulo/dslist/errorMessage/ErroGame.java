package com.paulo.dslist.errorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroGame {

	static final String GAME_NOT_FOUND = "O game com id %s não está cadastrado no sistema";

	public static ResponseEntity<?> erroGameNOTFOUND(String id) {
		return new ResponseEntity<CustomErrorType>(
				new CustomErrorType(String.format(ErroGame.GAME_NOT_FOUND, id)),
				HttpStatus.NOT_FOUND);
	}

}
