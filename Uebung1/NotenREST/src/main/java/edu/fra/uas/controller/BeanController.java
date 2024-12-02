package edu.fra.uas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fra.uas.service.GradeService;

@Controller
public class BeanController {

    private final Logger log = LoggerFactory.getLogger(BeanController.class);

    @Autowired
    private GradeService gradeService;

    // http://127.0.0.1/
    @GetMapping("/")
    public String get(Model model) {
        log.debug("get() is called");
        model.addAttribute("noten", gradeService.getAllNotes());
        return "index";
    }

    // http://127.0.0.1/add?note=1.0
    @GetMapping("/add")
    public String addNote(@RequestParam("note") double note, Model model) {
        log.debug("addNote() is called with note: " + note);

        
        gradeService.addNote(note);
        
        model.addAttribute("noten", gradeService.getAllNotes());
        model.addAttribute("average", gradeService.berechneSchnitt()); // Durchschnitt hinzufügen

        return "index";
    }
    // http://127.0.0.1/remove
    @GetMapping("/remove")
    public String removeNote(Model model) {
        log.debug("removeNote() is called");
        gradeService.removeNote();
        model.addAttribute("noten", gradeService.getAllNotes());
        return "index";
    }

    @GetMapping("/noten")
    public String showNotes(Model model) {
    model.addAttribute("average", gradeService.berechneSchnitt()); // Durchschnitt hinzufügen
    model.addAttribute("noten", gradeService.getAllNotes()); // Noten hinzufügen
    return "index"; // View (z. B. index.html) zurückgeben
    }




}