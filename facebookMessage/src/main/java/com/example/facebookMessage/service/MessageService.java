package com.example.facebookMessage.service;

import com.example.facebookMessage.model.Message;
import com.example.facebookMessage.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesByRecipientAndSender(String recipient, String sender) {
        return messageRepository.findByRecipientAndSender(recipient, sender);
    }

    public List<Message> getMessagesByRecipientOrSender(String recipient, String sender) {
        return messageRepository.findByRecipientOrSender(recipient, sender);
    }

    public void saveMessage(Message message) {
        // Implement message saving logic
        messageRepository.save(message);
    }

    // Other message-related business logic
}
