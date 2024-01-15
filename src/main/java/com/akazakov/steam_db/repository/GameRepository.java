package com.akazakov.steam_db.repository;

import com.akazakov.steam_db.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByName(String name);
}