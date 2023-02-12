package com.skypro.shelter_telegram_bot.service;

import com.skypro.shelter_telegram_bot.repository.UserCatRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserService {

    public UserService(UserCatRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserCatRepository userRepository;

}
