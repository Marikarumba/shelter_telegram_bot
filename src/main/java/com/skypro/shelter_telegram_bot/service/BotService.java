package com.skypro.shelter_telegram_bot.service;

import com.skypro.shelter_telegram_bot.InlineKeyboardMaker;
import com.skypro.shelter_telegram_bot.configuration.BotConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static com.skypro.shelter_telegram_bot.constants.BotConstants.*;


@Slf4j
@Component
public class BotService extends TelegramLongPollingBot {

    final BotConfiguration botConfiguration;

    private final InlineKeyboardMaker inlineKeyboardMaker;

    /**
     * В этот конструктор можно вписать команды, которые будут открываться при нажатии кнопки меню.
     * Эта кнопка меню общая, доступна из любых разделов программы
     * @param botConfiguration DI  конфигуратор
     * @param inlineKeyboardMaker DI создание меню
     */
    public BotService(BotConfiguration botConfiguration, InlineKeyboardMaker inlineKeyboardMaker) {
        this.botConfiguration = botConfiguration;
        this.inlineKeyboardMaker = inlineKeyboardMaker;
        //Создание кнопки меню
        List<BotCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new BotCommand("/start", "Запуск"));
        listOfCommands.add(new BotCommand("/data", "Мои данные"));
        listOfCommands.add(new BotCommand("/deletedata", "Удалить мои данные"));
        listOfCommands.add(new BotCommand("/help", "Справка"));
        try {
            this.execute(new SetMyCommands(listOfCommands, new BotCommandScopeDefault(), null));
        } catch (TelegramApiException e) {
            log.error("Command list error");
        }
    }

    @Override
    public String getBotUsername() {
        return botConfiguration.getBotName();
    }

    @Override
    public String getBotToken() {
        return botConfiguration.getToken();
    }

    /**
     * Метод для реагирования на команды
     * Вызывает методы:
     * {@link #startCommandReceived(long, String)}
     * {@link #sendMessage(long, String)} )}
     * {@link #sendMenuTakeHome(long, String)}
     * {@link #sendMenuIfo(long, String)}
     * @param update сообщения от пользователя (обновления)
     */
    // messageText (текстовые команды)
    // messageData (команды кнопок)
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            switch (messageText) {
                case INITIAL_CMD:
                    startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    break;
                default:
                    sendMessage(chatId, "Sorry, no such command");
                break;
            }
        } else if (update.hasCallbackQuery()) {
            String messageData = update.getCallbackQuery().getData();
            long chatId = update.getCallbackQuery().getMessage().getChatId();
            switch (messageData) {
                case TAKE_HOME_MENU_CMD:
                    sendMenuTakeHome(chatId, "Что вас интересует?");
                    break;
                case FINAL_CMD:
                    endCommandReceived(chatId, "тест");
                    break;
                case INFO_SHELTER_CMD:
                    sendMenuIfo(chatId, "Что вас интересует?");
                    break;
                case INFO_SHELTER_CMD_2_MENU:
                    sendMessage(chatId, SHELTER_INFO);
                    break;
                case ADDRESS_CMD:
                    sendMessage(chatId,SHELTER_ADDRESS);
                    break;
                case RULES_CMD:
                    sendMessage(chatId,SHELTER_RULES);
                    break;
                case CALL_VOLUNTEER_CMD:
                    sendMessage(chatId, VOLUNTEER_CALL);
                    break;

                default:
                    sendMessage(chatId, "Sorry, no such Bottom");
                    break;
            }

        }
    }
    /**
     * Метод отправки стартового сообщения
     * Вызывает метод отправки меню STEP_0
     * @see #sendStartMenu(long, String)
     * @param chatId чат ID
     * @param name имя пользователя
     */
    private void startCommandReceived(long chatId, String name) {
        String answer = name + GREETING_MSG;
        log.info("Start to user: " + name);
        sendStartMenu(chatId, answer);
    }
    /**
     * Метод отправки стартового меню STEP_0
     * Вызывает метод создания меню STEP_0
     * {@link InlineKeyboardMaker#getInlineMessageButtons()}
     * @param chatId чат ID
     * @param textToSend сообщение
     */
    private void sendStartMenu(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMaker.getInlineMessageButtons());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred: " + e.getMessage());
        }
    }

    /**
     * Метод отправки инфо-меню STEP_1
     * Вызывает метод создаия меню STEP_1
     * {@link InlineKeyboardMaker#infoShelterMenu()}
     * @param chatId чат ID
     * @param textToSend сообщение
     */
    private void sendMenuIfo(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMaker.infoShelterMenu());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred: " + e.getMessage());
        }
    }

    /**
     * Метод отправки инфо-меню STEP_2
     * Вызывает метод создаия меню STEP_2
     * {@link InlineKeyboardMaker#animalHomeMenu()}
     * @param chatId чат ID
     * @param textToSend сообщение
     */
    private void sendMenuTakeHome(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMaker.animalHomeMenu());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred: " + e.getMessage());
        }
    }

    // Тестовый метод создания меню 3 мапой
    private void endCommandReceived(long chatId, String textToSend){
        HashMap<String,String> menuStep3 = new HashMap<>();
        menuStep3.put("Отправить отчет", "SEND_REPORT_CMD");
        menuStep3.put("Отправить отчет2", "SEND_REPORT_CMD2");
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMaker.getInlineMessageButtonsByMap(menuStep3));
        try {
            execute(message);
        }
        catch (TelegramApiException e){
            log.error("Error occurred: " + e.getMessage());
        }
        log.info("Replied to user: ");
        sendMessage(chatId, " Скоро перезвоню");

    }

    /**
     * Метод отправки сообщений
     * @param chatId чат ID
     * @param textToSend сообщение
     */
    private void sendMessage(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Error occurred: " + e.getMessage());
        }
    }
}
