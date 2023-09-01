package edu.fra.uas.user.service;

import edu.fra.uas.user.model.Message;
import edu.fra.uas.user.model.Room;
import edu.fra.uas.user.model.User;
import org.springframework.http.ResponseEntity;

public interface RoomService {
    ResponseEntity<?> joinRoom(Long roomId, User user);
    ResponseEntity<?> leaveRoom(Long roomId, Long userId);
    ResponseEntity<?> sendMessage(Long roomId, Message message);
}
