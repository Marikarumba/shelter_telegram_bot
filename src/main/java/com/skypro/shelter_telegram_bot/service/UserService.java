package com.skypro.shelter_telegram_bot.service;

import com.skypro.shelter_telegram_bot.exception.WrongInputFormatException;
import com.skypro.shelter_telegram_bot.model.User;
import com.skypro.shelter_telegram_bot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class UserService {

        private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public Collection<User> getAllUsers() {
            return this.userRepository.findAll();
        }

        public User createUser(User user) {
            if (user.getName().isBlank() || user.getName().isBlank()) {
                throw new WrongInputFormatException("Имя пользователя не найдено");
            }
            if (user.getPhoneNumber() != null) {
                user.setPhoneNumber(checkPhoneNumber(user.getPhoneNumber()));
            } else {
                throw new WrongInputFormatException("Телефон пользователя не указан или не соответсвует формату");
            }
            return this.userRepository.save(user);
        }

        public String checkPhoneNumber(String number) {
            if (number.chars().filter(Character::isDigit).count() == 11) {
                return number;
            } else {
                return "Вы ввели не верный формат телефона, введите пожалуйста в формате 89999999999";
            }
        }


}
