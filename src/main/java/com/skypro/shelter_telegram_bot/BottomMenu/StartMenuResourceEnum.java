package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

public enum StartMenuResourceEnum {

    /*
    Главное меню STEP_0
     */

    STEP_1( INFO_SHELTER_CMD,"Информация о приюте"),
    STEP_2(TAKE_HOME_MENU_DOG_CMD, "Как взять собаку"),
    STEP_3(TAKE_HOME_MENU_CAT_CMD, "Как взять кошку"),
    STEP_4(FINAL_CMD, "Прислать отчет"),
    STEP_5(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    STEP_6(CALL_BACK_CMD, "Заказать обратный звонок");
    @Getter
    private final String command;
    @Getter
    private final String buttonName;

    StartMenuResourceEnum(String command, String buttonName) {
        this.command = command;
        this.buttonName = buttonName;
    }
}


