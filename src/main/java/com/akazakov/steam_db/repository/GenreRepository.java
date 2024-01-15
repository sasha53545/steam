package com.akazakov.steam_db.repository;

import com.akazakov.steam_db.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    Genre findByName(String name);
}
