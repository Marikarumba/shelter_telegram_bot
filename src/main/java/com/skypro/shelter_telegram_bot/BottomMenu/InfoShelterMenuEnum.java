package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.CALL_BACK_CMD;
import static com.skypro.shelter_telegram_bot.constants.BotConstants.CALL_VOLUNTEER_CMD;

public enum InfoShelterMenuEnum {

    INFO_BOTTOM_1( "I1", "Узнать о приюте"),
    INFO_BOTTOM_2("I2", "Расписание работы, как нас найти"),
    INFO_BOTTOM_3("I3", "Технике безопасности на территории"),
    INFO_BOTTOM_4(CALL_VOLUNTEER_CMD, "Позвать волонтера"),
    INFO_BOTTOM_5(CALL_BACK_CMD, "Заказать обратный звонок");
    @Getter
    private final String commandInfo;

    @Getter
    private final String buttonNameInfo;


    InfoShelterMenuEnum(String commandInfo, String buttonNameInfo) {
        this.commandInfo = commandInfo;
        this.buttonNameInfo = buttonNameInfo;
    }




}
