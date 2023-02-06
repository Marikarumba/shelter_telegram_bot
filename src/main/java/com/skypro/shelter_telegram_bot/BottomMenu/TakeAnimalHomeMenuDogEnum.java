package com.skypro.shelter_telegram_bot.BottomMenu;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

import lombok.Getter;

    /*
    Инфо меню STEP_2
    Меню в которое попадаешь после нажатия 1 кнопки в главном меню STEP_0 (Как взять животное)
     */
public enum TakeAnimalHomeMenuDogEnum {
    TAKE_HOME_BUTTON1(SOCIAL_DOG_CMD, "Знакомство с собакой"),
    TAKE_HOME_BUTTON2(DOCUMENTATION_DOG_CMD, "Список документов"),
    TAKE_HOME_BUTTON3(TRANSPORTATION_DOG_CMD, "Рекомендаций по транспортировке"),
    TAKE_HOME_BUTTON4(COMFORT_PUPPY_DOG_CMD, "Обустройство дома для щенка"),
    TAKE_HOME_BUTTON5(COMFORT_DOG_CMD, "Обустройству дома для собаки"),
    TAKE_HOME_BUTTON6(COMFORT_INV_DOG_CMD, "Обустройству дома для собаки с ограниченными возможностями"),
    TAKE_HOME_BUTTON7(KINOLOG_ADVICE_CMD, "Советы кинолога"),
    TAKE_HOME_BUTTON8(COMPILATION_KINOLOG_CMD, "Рекомендации по  кинологам"),
    TAKE_HOME_BUTTON9(WHY_DISCLAIMER_CMD, "Причины отказа"),
    TAKE_HOME_BUTTON10(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    TAKE_HOME_BUTTON11(CALL_BACK_CMD, "Заказать обратный звонок");

    @Getter
    private final String commandTakeHomeDog;

    @Getter
    private final String buttonNameTakeHomeDog;

    TakeAnimalHomeMenuDogEnum(String commandTakeHomeDog, String buttonNameTakeHomeDog) {
        this.commandTakeHomeDog = commandTakeHomeDog;
        this.buttonNameTakeHomeDog = buttonNameTakeHomeDog;
    }
}
