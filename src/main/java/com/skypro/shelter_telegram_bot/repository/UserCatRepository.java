package com.skypro.shelter_telegram_bot.repository;

import com.skypro.shelter_telegram_bot.model.UserCatShelter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCatRepository extends JpaRepository<UserCatShelter, Long> {
    UserCatShelter findUserCatShelterByChatId(Long chatId);
}
