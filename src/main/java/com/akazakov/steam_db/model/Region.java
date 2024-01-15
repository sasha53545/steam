package com.akazakov.steam_db.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    @Enumerated(EnumType.STRING)
    RegionType regionType;
}
