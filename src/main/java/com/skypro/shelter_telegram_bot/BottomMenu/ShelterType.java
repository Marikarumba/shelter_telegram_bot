package com.skypro.shelter_telegram_bot.BottomMenu;

public enum ShelterType {

    CAT("Приют кошек"),
    DOG("Приют собак");

    ShelterType(String status) {
        this.status = status;
    }

    private final String status;

}
