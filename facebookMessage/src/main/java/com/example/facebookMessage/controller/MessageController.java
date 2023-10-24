package com.example.facebookMessage.controller;

import com.example.facebookMessage.model.Message;
import com.example.facebookMessage.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @MessageMapping("/send-message")
    @SendTo("/topic/public")
    public Message sendMessage(Message message) {
        // Handle message sending, save it to MongoDB, and broadcast to recipients
        messageService.saveMessage(message);
        return message;
    }
}
