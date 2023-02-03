package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

public enum InfoShelterMenuEnum {

    INFO_BOTTOM_1( "I1", "Узнать о приюте"),
    INFO_BOTTOM_2("I2", "расписание работы приюта и адрес, схему проезда"),
    INFO_BOTTOM_3("I3", "общие рекомендации о технике безопасности на территории приюта"),
    INFO_BOTTOM_4("I4", "принять и записать контактные данные для связи"),
    INFO_BOTTOM_5("I5", "позвать волонтера");
    @Getter
    private final String commandInfo;

    @Getter
    private final String buttonNameInfo;


    InfoShelterMenuEnum(String commandInfo, String buttonNameInfo) {
        this.commandInfo = commandInfo;
        this.buttonNameInfo = buttonNameInfo;
    }




}
