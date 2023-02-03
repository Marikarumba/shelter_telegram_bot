package com.skypro.shelter_telegram_bot.repository;

import com.skypro.shelter_telegram_bot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
