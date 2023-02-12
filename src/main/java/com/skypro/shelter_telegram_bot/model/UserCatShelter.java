package com.skypro.shelter_telegram_bot.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "app_user")
public class UserCatShelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatId;
    private String userName;
    @Enumerated(EnumType.STRING)
    private UserStatus personStatus;
}
