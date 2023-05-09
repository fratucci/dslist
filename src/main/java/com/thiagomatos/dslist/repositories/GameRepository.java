package com.thiagomatos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
