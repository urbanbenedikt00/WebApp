package edu.fra.uas.user.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class Message {
    private static final Logger log = LoggerFactory.getLogger(User.class);
    private Long id;
    private String content;
    private Long userId;
    private LocalDateTime timeStamp;

    public Message() {
        log.debug("Message created without values");
    }

    public Message(String content) {
        this.content = content;
        this.timeStamp = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Message other = (Message) obj;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        if (userId == null) {
            return other.userId == null;
        } else return userId.equals(other.userId);
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", content=" + content + ", userId=" + userId + ", timeStamp=" + timeStamp + "]";
    }
}
