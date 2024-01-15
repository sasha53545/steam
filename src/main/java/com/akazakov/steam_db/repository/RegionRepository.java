package com.akazakov.steam_db.repository;

import com.akazakov.steam_db.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {

}