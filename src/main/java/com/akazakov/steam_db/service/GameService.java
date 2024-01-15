package com.akazakov.steam_db.service;

import com.akazakov.steam_db.model.Game;
import com.akazakov.steam_db.repository.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    /**
     * Get game by id
     * @param id id
     * @return Game from database
     * @throws EntityNotFoundException If game not found
     */
    public Game getById(int id) throws EntityNotFoundException {
        return gameRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Game with ID = " + id + " not found"));
    }
}
