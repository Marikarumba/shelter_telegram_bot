package com.skypro.shelter_telegram_bot.exception;

public class WrongInputFormatException extends RuntimeException{
    public WrongInputFormatException(String message) {
        super(message);
    }
}
