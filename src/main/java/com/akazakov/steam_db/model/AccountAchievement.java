package com.akazakov.steam_db.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.ZonedDateTime;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountAchievement {
    @Id
    @GeneratedValue
    Integer id;
    @Enumerated(EnumType.STRING)
    AccountAchievementStatus accountAchievementStatus;
    ZonedDateTime dateEnd;
    ZonedDateTime dateStart;

    @ManyToOne
    Account account;

    @ManyToOne
    Achievement achievement;
}
