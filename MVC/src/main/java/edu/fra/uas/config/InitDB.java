package edu.fra.uas.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.User;
import edu.fra.uas.service.UserService;
import jakarta.annotation.PostConstruct;

@Component
public class InitDB {
    private final Logger log = LoggerFactory.getLogger(InitDB.class);
    private final UserService userService;

    public InitDB(UserService userService){
        this.userService = userService;
    }

    @PostConstruct
    private void initDB(){
        log.debug("Start initDB");

        this.userService.createUser(new User("Admin", "Admin", "admin@admin.de","admin"));
        this.userService.createUser(new User("user", "user", "user@user.de","user"));
    }
}
