package com.skypro.shelter_telegram_bot.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long chatId;
    private String name;
    private String userName;
    private Boolean isActive;
    private String telephone_number;
    @CreationTimestamp
    private LocalDateTime firstLoginDate;
    @Enumerated(EnumType.STRING)
    private UserStatus personStatus;


}
