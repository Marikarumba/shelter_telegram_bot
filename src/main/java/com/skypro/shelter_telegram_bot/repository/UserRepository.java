package com.skypro.shelter_telegram_bot.repository;

import com.skypro.shelter_telegram_bot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByChatId(Long id);
}
