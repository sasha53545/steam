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
public class AccountFriend {
    @Id
    @GeneratedValue
    Integer id;
    @Enumerated(EnumType.STRING)
    AccountFriendStatus status;

    @ManyToOne
    Account account1;

    @ManyToOne
    Account account2;
}
