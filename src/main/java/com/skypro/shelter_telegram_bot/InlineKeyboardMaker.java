package com.skypro.shelter_telegram_bot;

import com.skypro.shelter_telegram_bot.BottomMenu.InfoShelterMenuEnum;
import com.skypro.shelter_telegram_bot.BottomMenu.StartMenuResourceEnum;
import com.skypro.shelter_telegram_bot.BottomMenu.TakeAnimalHomeMenuCatEnum;
import com.skypro.shelter_telegram_bot.BottomMenu.TakeAnimalHomeMenuDogEnum;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class InlineKeyboardMaker {

    /**
     * Метод для создания меню STEP_0
     * Вызывает метод создания кнопки
     * @see #getButton(String, String)
     * @return меню STEP_0
     */
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

    /**
     * Метод для создания инфо-меню STEP_1
     * Вызывает метод создания кнопки
     * @see #getButton(String, String)
     * @return меню STEP_1
     */
    public InlineKeyboardMarkup infoShelterMenu() {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (InfoShelterMenuEnum infoShelterMenuEnum : InfoShelterMenuEnum.values()) {
            rowList.add(getButton(
                    infoShelterMenuEnum.getButtonNameInfo(),
                    infoShelterMenuEnum.getCommandInfo()));
        }
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    /**
     * Метод для создания инфо-меню STEP_2
     * Вызывает метод создания кнопки
     * @see #getButton(String, String)
     * @return меню STEP_2
     */
    public InlineKeyboardMarkup animalHomeMenuDog() {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (TakeAnimalHomeMenuDogEnum animalHomeMenuDog : TakeAnimalHomeMenuDogEnum.values()) {
            rowList.add(getButton(
                    animalHomeMenuDog.getButtonNameTakeHomeDog(),
                    animalHomeMenuDog.getCommandTakeHomeDog()));
        }
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup animalHomeMenuCat() {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (TakeAnimalHomeMenuCatEnum animalHomeMenuCat : TakeAnimalHomeMenuCatEnum.values()) {
            rowList.add(getButton(
                    animalHomeMenuCat.getButtonNameTakeHomeCat(),
                    animalHomeMenuCat.getCommandTakeHomeCat()));
        }
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }
    // Тестовый метод кнопки по мапе
    public InlineKeyboardMarkup getInlineMessageButtonsByMap(Map<String,String> map) {
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        for (Map.Entry<String, String> item : map.entrySet()) {

            rowList.add(getButton(
                    map.keySet().toString(),
                    map.values().toString()));
        }
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            inlineKeyboardMarkup.setKeyboard(rowList);

            return inlineKeyboardMarkup;
        }

    /**
     * Создание кнопок, общий метод для всех меню
     * @param buttonName имя кнопки
     * @param command команда, которую выполняет
     * @return кнопку
     */
    private List<InlineKeyboardButton> getButton(String buttonName, String command) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(buttonName);
        button.setCallbackData(command);

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(button);
        return keyboardButtonsRow;
    }
}
