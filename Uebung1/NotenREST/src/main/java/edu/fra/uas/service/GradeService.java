package edu.fra.uas.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Grade;
import edu.fra.uas.repository.GradeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class GradeService {
    
    private static final Logger log = LoggerFactory.getLogger(GradeService.class);

    @Autowired
    private GradeRepository gradeRepository;


    public void addNote (double note) {
        gradeRepository.add(note);
        log.debug("Grade wurde hinzugefügt: " + note);
        
    }

    public GradeRepository getAllNotes() {
        log.debug("getAllNotes");
        return gradeRepository;
    }

    public void removeNote(){
        log.debug("Letzte Note wird entfernt");


        if (gradeRepository.size() == 0) {
            log.debug("Keine Noten vorhanden");
            return;
        }
        gradeRepository.remove(gradeRepository.size()-1);
    }


    public double berechneSchnitt () {
        log.debug("berechneSchnitt");
        double sum = 0;
        for (double note : gradeRepository) {
            sum += note;
        }
        return sum / gradeRepository.size();
    }
    


}
