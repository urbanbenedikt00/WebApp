package edu.fra.uas.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.User;
import edu.fra.uas.service.UserService;
import jakarta.annotation.PostConstruct;

@Component
public class InitData {

    // Logger für die Ausgabe von Debug-Informationen
    private final Logger log = org.slf4j.LoggerFactory.getLogger(InitData.class);
    
    // UserService wird automatisch von Spring injiziert
    @Autowired
    UserService userService;

    // Methode wird nach der Konstruktion des Beans aufgerufen
    @PostConstruct
    public void init() {
        log.debug("### Initialize Data ###");

        // Erstellen und Speichern des Admin-Benutzers
        log.debug("create user admin");
        User user = new User();
        user.setRole("ADMIN");
        user.setFirstName("Administrator");
        user.setLastName("Administrator");
        user.setEmail("admin@example.com");
        user.setPassword("extremeSecurePassword1234");
        userService.createUser(user);

        // Erstellen und Speichern des Benutzers Alice
        log.debug("create user alice");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Alice");
        user.setLastName("Adams");
        user.setEmail("alice@example.com");
        user.setPassword("alice1234");
        userService.createUser(user);

        // Erstellen und Speichern des Benutzers Bob
        log.debug("create user bob");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Bob");
        user.setLastName("Builder");
        user.setEmail("bob@example.com");
        user.setPassword("bob1234");
        userService.createUser(user);

        log.debug("### Data initialized ###");
    }

}