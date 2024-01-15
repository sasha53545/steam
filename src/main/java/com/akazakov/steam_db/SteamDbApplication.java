package com.akazakov.steam_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO Wish list (избранные не купленные игры). Наполнить данными все таблицы в базе данных.

@SpringBootApplication
public class SteamDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteamDbApplication.class, args);
    }

}
