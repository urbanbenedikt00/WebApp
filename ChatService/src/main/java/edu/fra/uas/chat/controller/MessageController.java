package edu.fra.uas.chat.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fra.uas.chat.model.Message;
import edu.fra.uas.chat.service.MessageService;

@RestController
@RequestMapping(value = { "/messages" })
public class MessageController implements BaseController<Message> {
    private static final Logger log = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private MessageService messageService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<List<Message>> getAll() {
        Iterable<Message> messagesIterable = this.messageService.getAll();
        List<Message> messages = new ArrayList<>();
        for (Message message : messagesIterable) {
            messages.add(message);
        }
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping(value = { "/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Message> getById(@PathVariable("id") Long id) {
        Message message = this.messageService.getById(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Message> create(@RequestBody Message message) {
        message = this.messageService.create(message);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Message> update(@RequestBody Message message) {
        message = this.messageService.update(message);
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = { "/{id}" })
    @Override
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        this.messageService.delete(id);
        return new ResponseEntity<>("Message is deleted", HttpStatus.ACCEPTED);
    }

}
