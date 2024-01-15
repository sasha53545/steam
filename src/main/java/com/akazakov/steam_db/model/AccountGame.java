package com.akazakov.steam_db.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.ZonedDateTime;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountGame {
    @Id
    @GeneratedValue
    Integer id;
    BigDecimal price;
    ZonedDateTime buyDateTime;
    Duration playTime;
    Boolean isFavorite;
    AccountGameStatus accountGameStatus;

    @ManyToOne
    Account account;

    @ManyToOne
    Game game;
}
