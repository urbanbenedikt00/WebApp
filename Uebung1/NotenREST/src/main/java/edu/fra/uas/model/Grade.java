package edu.fra.uas.model;

import org.slf4j.Logger;
import java.io.Serializable;

public class Grade implements Serializable {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Grade.class);


    private double grade;

    public Grade(double grade) {
        this.grade = grade;
        log.debug("Grade wurde erstellt: " + grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    
}


