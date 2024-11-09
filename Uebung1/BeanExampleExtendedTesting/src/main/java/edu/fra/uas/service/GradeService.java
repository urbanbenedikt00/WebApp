package edu.fra.uas.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class GradeService {
    private ArrayList<Double> notenliste = new ArrayList<>(); // Initialisierung
    private static final Logger log = LoggerFactory.getLogger(GradeService.class);

    public void addNote (double note) {
        notenliste.add(note);
        log.debug("Note wurde erfolgreich hinzugefügt: " + note);
    }

    public double getSchnitt(){
        double summe = 0;
        for (double note : this.notenliste){
            summe += note;

        }
        double schnitt = summe / notenliste.size();
        log.debug("Notenschnitt wurde berechnet: " + schnitt);
        return schnitt;


    }




}
