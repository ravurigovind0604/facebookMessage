package com.example.facebookMessage.repo;

import com.example.facebookMessage.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByRecipientAndSender(String recipient, String sender);
    List<Message> findByRecipientOrSender(String recipient, String sender);
    // Other custom query methods
}