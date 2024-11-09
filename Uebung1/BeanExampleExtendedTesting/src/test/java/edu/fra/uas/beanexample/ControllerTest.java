package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;

@SpringBootTest
public class ControllerTest {
    
    @Autowired
    private BeanController beanController;

    //@Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo(" put messgae: Das ist ein Test");
    }

    //@Test
    void testCounter(){
        assertEquals(0, beanController.getInc());
        beanController.increment();
        beanController.increment();
        assertEquals(2, beanController.getInc());

    }


    @Test
    void testAddNoteAndCalculateAverage() {
        // Setze den Controller in einen bekannten Zustand, z.B. leere Notenliste
        beanController.clearNotes();
    
        // Füge mehrere Noten hinzu
        beanController.addNote(1.0);
        beanController.addNote(2.0);
        beanController.addNote(3.0);
        beanController.addNote(4.0);
        beanController.addNote(5.0);
    
        // Erwarteter Durchschnitt
        double expectedAverage = 3.0;
    
        // Überprüfe, ob der berechnete Durchschnitt korrekt ist
        assertEquals(expectedAverage, beanController.getSchnitt());
    }
    
    @Test
    void testEmptyNotesAverage() {
        // Setze den Controller in einen Zustand ohne Noten
        beanController.clearNotes();
    
        // Überprüfe, dass der Durchschnitt bei leerer Notenliste 0 oder ein spezifizierter Wert ist
        double expectedAverage = 0.0;
        assertEquals(expectedAverage, beanController.getSchnitt());
    }
    
    @Test
    void testSingleNoteAverage() {
        // Setze den Controller in einen Zustand mit nur einer Note
        beanController.clearNotes();
        beanController.addNote(4.0);
    
        // Überprüfe, dass der Durchschnitt korrekt ist, wenn nur eine Note vorhanden ist
        double expectedAverage = 4.0;
        assertEquals(expectedAverage, beanController.getSchnitt());
    }

}
