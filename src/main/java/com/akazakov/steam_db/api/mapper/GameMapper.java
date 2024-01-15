package com.akazakov.steam_db.api.mapper;

import com.akazakov.steam_db.dto.GameDTO;
import com.akazakov.steam_db.model.Game;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameMapper {
    public GameDTO toDTO(Game game) {
        return GameDTO.builder()
                .id(game.getId())
                .name(game.getName())
                .description(game.getDescription())
                .genre(game.getGenre().getName())
                .build();
    }

    public List<GameDTO> toDTO(List<Game> games) {
        return games.stream().map(this::toDTO).toList();
    }
}
