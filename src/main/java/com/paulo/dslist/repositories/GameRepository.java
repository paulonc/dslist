package com.paulo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
