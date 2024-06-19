package org.example.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public SendMessage messageReceiver(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            var text = update.getMessage().getText();
            var chatId = update.getMessage().getChatId();
            var name = update.getMessage().getChat().getFirstName();

            String responseText;
            switch (text) {
                case "/start" -> responseText = String.format("Привет %s! Я твой телеграм логопед бот", name);
                case "/stop" -> responseText = String.format("До новых встреч %s!", name);
                default -> responseText = "Такой команды не существует. Введите /start или /stop";
            }
            var message = new SendMessage();
            message.setChatId(chatId);
            message.setText(responseText);
            return message;
        }
        return null;
    }
}
