package com.akazakov.steam_db.repository;

import com.akazakov.steam_db.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Integer> {

}