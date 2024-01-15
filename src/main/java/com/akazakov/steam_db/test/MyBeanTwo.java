package com.akazakov.steam_db.test;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyBeanTwo {
    private final MyBeanOne myBeanOne;

    @PostConstruct
    public void init() {
        try {
            myBeanOne.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
