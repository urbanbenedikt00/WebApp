package edu.fra.uas.service;

import org.springframework.stereotype.Service;

import edu.fra.uas.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private long nextUserId = 1;

    public User createUser(User user) {
        user.setId(nextUserId++);
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

}
