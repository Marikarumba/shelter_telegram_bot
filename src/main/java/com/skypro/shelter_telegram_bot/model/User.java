package com.skypro.shelter_telegram_bot.model;

public class User {

    private Long id;
    private String name;
    private Long chatId;
    private UserStatus personStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public UserStatus getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(UserStatus personStatus) {
        this.personStatus = personStatus;
    }

}
