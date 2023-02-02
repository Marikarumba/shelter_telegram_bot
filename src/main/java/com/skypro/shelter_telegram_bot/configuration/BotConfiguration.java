package com.skypro.shelter_telegram_bot.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfiguration {
    @Value("${telegramBot.name}")
    String botName;
    @Value("${telegramBot.token}")
    String token;
}
