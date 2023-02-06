package com.skypro.shelter_telegram_bot.model;



import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

//    private Long chatId;
//
//    private UserStatus personStatus;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
