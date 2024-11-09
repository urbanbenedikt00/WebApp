package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private String message;
    private int counter = 0;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void increment() {
        counter += 1;

    }

    public int getCounter(){
        return this.counter;
    }

}
