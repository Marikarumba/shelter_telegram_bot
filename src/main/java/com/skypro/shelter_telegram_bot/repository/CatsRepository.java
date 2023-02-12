package com.skypro.shelter_telegram_bot.repository;

import com.skypro.shelter_telegram_bot.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatsRepository extends JpaRepository<Cat, Long> {
}
