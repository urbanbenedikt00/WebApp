package edu.fra.uas.chat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fra.uas.chat.model.Message;
import edu.fra.uas.chat.repository.MessageRepository;

@Service
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
    private Long nextMessageId = 1L;
    
    @Autowired
    private MessageRepository messageRepository;

    public Message create(Message message) {
        log.info("createMessage: {}", message);
        message.setId(this.nextMessageId++);
        this.messageRepository.put(message.getId(), message);
        return message;
    }

    public Iterable<Message> getAll() {
        log.info("getAllMessages");
        return this.messageRepository.values();
    }

    public Message getById(Long id) {
        log.info("get message by id: {}", id);
        return this.messageRepository.get(id);
    }

    public Message update(Message message) {
        log.info("update message: {}", message);
        this.messageRepository.put(message.getId(), message);
        return message;
    }

    public void delete(Long id) {
        log.info("delete message: {}", id);
        this.messageRepository.remove(id);
    }

}
