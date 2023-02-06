package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

public enum StartMenuResourceEnum {

    /*
    Главное меню STEP_0
     */

    STEP_1( INFO_SHELTER_CMD,"Информация о приюте"),
    STEP_2(TAKE_HOME_MENU_CMD, "Как взять животное"),
    STEP_3(FINAL_CMD, "Прислать отчет"),
    STEP_4(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    STEP_5(CALL_BACK_CMD, "Заказать обратный звонок");
    @Getter
    private final String command;
    @Getter
    private final String buttonName;

    StartMenuResourceEnum(String command, String buttonName) {
        this.command = command;
        this.buttonName = buttonName;
    }
}


