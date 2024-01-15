package com.akazakov.steam_db.test;

import com.akazakov.steam_db.model.Genre;
import com.akazakov.steam_db.repository.GenreRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class MyBeanOne {
    private final GenreRepository genreRepository;

    @Transactional
    public void test() {
        Genre genre1 = Genre.builder().name("Test1").build();
        genreRepository.save(genre1);

        System.out.println(10 / 0);

        Genre genre2 = Genre.builder().name("Test2").build();
        genreRepository.save(genre2);
    }

    public void test2() {
        System.out.println("Test");
    }

    @PostConstruct
    public void init() {
        try {
            this.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
