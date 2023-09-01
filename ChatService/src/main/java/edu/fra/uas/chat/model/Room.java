package edu.fra.uas.chat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings("unused")
public class Room {
    private Long id;
    private String name;
    private Map<Long, Message> messages = new HashMap<>();
    private Map<Long, User> users = new HashMap<>();

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, Message> getMessages() {
        return messages;
    }

    public void setMessages(Map<Long, Message> messages) {
        this.messages = messages;
    }

    @JsonIgnore
    public void setMessage(Message message) {
        this.messages.put(message.getId(), message);
    }

    public Map<Long, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Long, User> users) {
        this.users = users;
    }

    @JsonIgnore
    public void setUser(User user) {
        this.users.put(user.getId(), user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", messages=" + messages +
                ", users=" + users +
                '}';
    }
}
