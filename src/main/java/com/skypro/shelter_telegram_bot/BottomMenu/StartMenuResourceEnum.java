package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;



public enum StartMenuResourceEnum {

    STEP_1( INFO_SHELTER_CMD,"Информация о приюте"),
    STEP_2("K2", "Как взять животное"),
    STEP_3("K3", "Прислать отчет"),
    STEP_4("К4", "Позвать волонтера"),
    STEP_5(FINAL_CMD, "Заказать обратный звонок");

    private final String command;
    @Getter
    private final String buttonName;

    StartMenuResourceEnum(String command, String buttonName) {
        this.command = command;
        this.buttonName = buttonName;
    }

    public String getCommand() {
        return command;
    }

    public String getButtonName() {
        return buttonName;
    }
}


