package com.skypro.shelter_telegram_bot;

import com.skypro.shelter_telegram_bot.constants.StartMenuResourceEnum;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import java.util.ArrayList;
import java.util.List;

@Component
public class InlineKeyboardMaker {

    //Метод создания меню с кнопками
    public InlineKeyboardMarkup getInlineMessageButtons() {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (StartMenuResourceEnum startMenuResourceEnum : StartMenuResourceEnum.values()) {
            rowList.add(getButton(
                    startMenuResourceEnum.getButtonName(),
                    startMenuResourceEnum.getCommand()));
        }
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    //Метод создания кнопки
    private List<InlineKeyboardButton> getButton(String buttonName, String command) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(buttonName);
        button.setCallbackData(command);

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(button);
        return keyboardButtonsRow;
    }
}
