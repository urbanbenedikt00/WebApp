package edu.fra.uas.service;

import org.springframework.stereotype.Component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    private String message;

    public String getMessage() {
        log.debug(" getFunction: return message");
        return message;
        
    }

    public void setMessage(String message) {
        this.message = message;
        log.debug("Message set as: " + message);
        
    }

}
