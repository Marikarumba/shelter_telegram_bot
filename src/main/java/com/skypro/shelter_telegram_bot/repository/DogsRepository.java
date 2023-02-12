package com.skypro.shelter_telegram_bot.repository;


import com.skypro.shelter_telegram_bot.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogsRepository extends JpaRepository <Dog, Long> {

}
