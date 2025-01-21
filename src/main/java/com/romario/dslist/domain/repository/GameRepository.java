package com.romario.dslist.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romario.dslist.domain.entites.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}
