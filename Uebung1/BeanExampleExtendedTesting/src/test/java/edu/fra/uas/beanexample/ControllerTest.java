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

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo(" put messgae: Das ist ein Test");
    }

    @Test
    void testCounter(){
        assertEquals(0, beanController.getInc());
        beanController.increment();
        beanController.increment();
        assertEquals(2, beanController.getInc());

    }

}
