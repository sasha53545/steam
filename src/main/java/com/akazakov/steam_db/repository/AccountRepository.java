package com.akazakov.steam_db.repository;

import com.akazakov.steam_db.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}