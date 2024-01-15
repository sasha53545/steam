package com.akazakov.steam_db;

import com.akazakov.steam_db.model.Genre;
import com.akazakov.steam_db.repository.GenreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SteamDbApplicationTests {
    @Autowired
    GenreRepository genreRepository;

    @Test
    void testFailWithoutTransactional() {
        Genre genre1 = Genre.builder().name("Test1").build();
        genreRepository.save(genre1);

        System.out.println(10 / 0);

        Genre genre2 = Genre.builder().name("Test2").build();
        genreRepository.save(genre2);
    }

    @Test
    @Transactional
    @Rollback
    void testFailWithTransactional() {
        Genre genre1 = Genre.builder().name("Test1").build();
        genreRepository.save(genre1);

        System.out.println(10 / 0);

        Genre genre2 = Genre.builder().name("Test2").build();
        genreRepository.save(genre2);
    }
}
