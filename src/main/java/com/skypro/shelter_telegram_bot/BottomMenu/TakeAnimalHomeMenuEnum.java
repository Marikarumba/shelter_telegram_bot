package com.skypro.shelter_telegram_bot.BottomMenu;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

import lombok.Getter;

public enum TakeAnimalHomeMenuEnum {
    TAKE_HOME_BUTTON1(SOCIAL_CMD, "Знакомство с собакой"),
    TAKE_HOME_BUTTON2(DOCUMENTATION_CMD, "Список документов"),
    TAKE_HOME_BUTTON3(TRANSPORTATION_CMD, "Рекомендаций по транспортировке"),
    TAKE_HOME_BUTTON4(COMFORT_PUPPY_CMD, "Обустройство дома для щенка"),
    TAKE_HOME_BUTTON5(COMFORT_DOG_CMD, "Обустройству дома для собаки"),
    TAKE_HOME_BUTTON6(COMFORT_INV_DOG_CMD, "Обустройству дома для собаки с ограниченными возможностями"),
    TAKE_HOME_BUTTON7(KINOLOG_ADVICE_CMD, "Советы кинолога"),
    TAKE_HOME_BUTTON8(COMPILATION_KINOLOG_CMD, "Рекомендации по  кинологам"),
    TAKE_HOME_BUTTON9(WHY_DISCLAIMER_CMD, "Причины отказа"),
    TAKE_HOME_BUTTON10(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    TAKE_HOME_BUTTON11(CALL_BACK_CMD, "Заказать обратный звонок");

    @Getter
    private final String commandTakeHome;

    @Getter
    private final String buttonNameTakeHome;

    TakeAnimalHomeMenuEnum(String commandTakeHome, String buttonNameTakeHome) {
        this.commandTakeHome = commandTakeHome;
        this.buttonNameTakeHome = buttonNameTakeHome;
    }
}
