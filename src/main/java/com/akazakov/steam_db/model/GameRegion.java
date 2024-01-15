package com.akazakov.steam_db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameRegion {
    @Id
    @GeneratedValue
    Integer id;
    BigDecimal price;
    Integer discount;

    @ManyToOne
    Game game;

    @ManyToOne
    Region region;
}
