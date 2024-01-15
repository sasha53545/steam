package com.akazakov.steam_db.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    // Нет ограничения по размеру строки.
    // @Lob
    // @Column(columnDefinition = "TEXT")
    @Column(columnDefinition = "varchar(5000)")
    String description;

    @ManyToOne
    Genre genre;
}
