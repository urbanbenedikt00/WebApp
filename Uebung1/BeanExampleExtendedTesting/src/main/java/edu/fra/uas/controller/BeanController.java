package edu.fra.uas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fra.uas.service.GradeService;

@Controller
public class BeanController {

    


    private final Logger log = LoggerFactory.getLogger(BeanController.class);

    @Autowired
    private GradeService gradeService;

    // http://127.0.0.1/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get() {
        log.debug("get() is called");
        return "index.html";
    }
}