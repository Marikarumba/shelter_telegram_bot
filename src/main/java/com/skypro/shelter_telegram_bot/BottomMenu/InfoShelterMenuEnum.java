package com.skypro.shelter_telegram_bot.BottomMenu;

import lombok.Getter;

import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;

public enum InfoShelterMenuEnum {


    /*
      Это меню в которое попадаешь после нажатия 1 кнопки в главном меню(Информация о приюте)
     */
    INFO_BOTTOM_1( INFO_SHELTER_CMD_2_MENU, "Узнать о приюте"),
    INFO_BOTTOM_2(ADDRESS_CMD, "Расписание работы, как нас найти"),
    INFO_BOTTOM_3(RULES_CMD, "Технике безопасности на территории"),
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
