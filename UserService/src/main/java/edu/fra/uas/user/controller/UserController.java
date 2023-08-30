package edu.fra.uas.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fra.uas.user.model.User;
import edu.fra.uas.user.service.UserService;

@RestController
@RequestMapping(value = { "/users" })
public class UserController implements BaseController<User> {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<List<User>> getAll() {
        log.info("Get -> /users");
        Iterable<User> usersIterable = this.userService.getAll();
        List<User> users = new ArrayList<>();
        for (User user : usersIterable) {
            users.add(user);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = { "/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<User> getById(@PathVariable("id") Long id) {
        log.info("Get -> /users/{}", id);
        User user = this.userService.getById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<User> create(@RequestBody User user) {
        log.info("Post -> /users");
        user = this.userService.create(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<User> update(@RequestBody User user) {
        log.info("Put -> /users");
        user = this.userService.update(user);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = { "/{id}" })
    @Override
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        log.info("Delete -> /users/{}", id);
        this.userService.delete(id);
        return new ResponseEntity<>("User is deleted", HttpStatus.ACCEPTED);
    }

}
