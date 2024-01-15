package com.akazakov.steam_db.api;

import com.akazakov.steam_db.api.mapper.GameMapper;
import com.akazakov.steam_db.dto.GameDTO;
import com.akazakov.steam_db.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/games")
@RequiredArgsConstructor
public class GameAPI {
    private final GameService gameService;
    private final GameMapper gameMapper;

    @GetMapping
    public List<GameDTO> getAll() {
        return gameMapper.toDTO(gameService.getAll());
    }

    @GetMapping("/{id}")
    public GameDTO getById(@PathVariable int id) {
        return gameMapper.toDTO(gameService.getById(id));
    }
}
