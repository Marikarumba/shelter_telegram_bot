package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

/*
Инфо меню STEP_3
Меню в которое попадаешь после нажатия 1 кнопки в главном меню STEP_0 (Как взять животное)
*/
public enum TakeAnimalHomeMenuCatEnum {
    TAKE_HOME_BUTTON1(SOCIAL_CAT_CMD, "Знакомство с кошкой"),
    TAKE_HOME_BUTTON2(DOCUMENTATION_CAT_CMD, "Список документов"),
    TAKE_HOME_BUTTON3(TRANSPORTATION_CAT_CMD, "Рекомендаций по транспортировке"),
    TAKE_HOME_BUTTON4(COMFORT_CAT_CMD, "Обустройство дома для кошки"),
    //TAKE_HOME_BUTTON7(KINOLOG_ADVICE_CMD, "Советы кинолога"),
    //TAKE_HOME_BUTTON8(COMPILATION_KINOLOG_CMD, "Рекомендации по  кинологам"),
    TAKE_HOME_BUTTON5(WHY_DISCLAIMER_CMD, "Причины отказа"),
    TAKE_HOME_BUTTON6(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    TAKE_HOME_BUTTON7(CALL_BACK_CMD, "Заказать обратный звонок");

    @Getter
    private final String commandTakeHomeCat;

    @Getter
    private final String buttonNameTakeHomeCat;

    TakeAnimalHomeMenuCatEnum(String commandTakeHomeCat, String buttonNameTakeHomeCat) {
        this.commandTakeHomeCat = commandTakeHomeCat;
        this.buttonNameTakeHomeCat = buttonNameTakeHomeCat;
    }
}
