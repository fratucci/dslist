package com.thiagomatos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomatos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
