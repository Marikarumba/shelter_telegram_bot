package com.skypro.shelter_telegram_bot.model;

public enum UserStatus {

    NEW_PERSON("Новый клиент"),
    POTENTIAL_PARENT("Потенциальный усыновитель"),
    PARENT("Усыновитель");

    private final String status;

    UserStatus(String status) {
        this.status = status;
    }
}
