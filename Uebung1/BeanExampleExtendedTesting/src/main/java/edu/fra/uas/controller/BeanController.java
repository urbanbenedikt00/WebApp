package edu.fra.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.service.MessageService;
import edu.fra.uas.service.GradeService;

@Component
public class BeanController {
    
    @Autowired
    private MessageService messageService;

    @Autowired
    private GradeService gradeService;

    public String putMessage(String message) {
        messageService.setMessage(" put messgae: " + message);
        return messageService.getMessage();
    }

    public void increment () {
        messageService.increment();
    }

    public int getInc () {
        return messageService.getCounter();

    }

    public void addNote (double note){
        gradeService.addNote(note);
    }

    public double getSchnitt () {
        return gradeService.getSchnitt();
    }
    public void clearNotes () {
        gradeService.clearGrades();
    }


}
