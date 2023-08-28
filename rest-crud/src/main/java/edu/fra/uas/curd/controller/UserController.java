package edu.fra.uas.curd.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.fra.uas.curd.model.User;
import edu.fra.uas.curd.service.UserService;

@Controller
public class UserController {

    private final Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    // http://127.0.0.1:8000/
    @RequestMapping
	public String get() {
        log.debug("get() is called");
		return "index.html";
	}

    // http://127.0.0.1:8000/users/list
    @RequestMapping(value = {"/users/list"}, method = RequestMethod.GET)
    // @GetMapping(value = {"/users/list"})
    public String list(Model model) {
        log.debug("list() is called");
        Iterable<User> userIter = userService.getAllUsers();
        List<User> users = new ArrayList<>();
        for (User user : userIter) {
            users.add(user);
        }
        model.addAttribute("users", users);
        return "list.html";
    }

    // http://127.0.0.1:8000/users/find?id=1
    @RequestMapping(value = {"/users/find"}, method = RequestMethod.GET)
    // @GetMapping(value = {"/users/find"})
    public String getById(@RequestParam("id") Long userId, Model model) {
        log.debug("find() is called");
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "find.html";
    }

    // http://127.0.0.1:8000/users/add?firstName=Celine&lastName=Clever&email=celine.clever%40example.com&password=123456
    @RequestMapping(value = {"/users/add"}, method = RequestMethod.GET)
    // @GetMapping(value = {"/users/add"})
    public String add(@RequestParam("firstName") String firstName, 
                      @RequestParam("lastName") String lastName, 
                      @RequestParam("email") String email, 
                      @RequestParam("password") String password, 
                      Model model) {
        log.debug("add() is called");
        User user = new User();
        user.setRole("USER");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        userService.createUser(user);
        model.addAttribute("user", user);
        return "add.html";
    }

    // http://127.0.0.1:8000/users/update
    @RequestMapping(value = {"/users/update"}, method = RequestMethod.GET)
    // @GetMapping(value = {"/users/update"})
    public String update() {
        log.debug("update() is called");
        return "update.html";
    }

    // http://127.0.0.1:8000/users/updated?id=2&firstName=Alice&lastName=Abraham&email=alice%40example.com&password=123A456
    @RequestMapping(value = {"/users/updated"}, method = { RequestMethod.GET, RequestMethod.POST })
    // @GetMapping(value = {"/users/update"})
    // @PutMapping(value = {"/users/update"})
    public String update(@RequestParam("id") Long userId, 
                         @RequestParam("firstName") String firstName, 
                         @RequestParam("lastName") String lastName, 
                         @RequestParam("email") String email, 
                         @RequestParam("password") String password, 
                         Model model) {
        log.debug("updated() is called");
        User user = userService.getUserById(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        userService.updateUser(user);
        model.addAttribute("user", user);
        return "updated.html";
    }

    // http://127.0.0.1:8000/users/delete/3
    @RequestMapping(value = {"/users/delete/{id}"}, method = RequestMethod.GET)
    // @DeleteMapping(value = {"/users/delete/{id}"})
    public String delete(@PathVariable("id") Long id, Model model) {
        log.debug("delete() is called");
        User user = userService.getUserById(id);
        userService.deleteUser(id);
        model.addAttribute("user", user);
        return "deleted.html";
    }

}
