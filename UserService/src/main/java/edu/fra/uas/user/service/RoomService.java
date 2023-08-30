package edu.fra.uas.user.service;

import edu.fra.uas.user.model.Message;
import edu.fra.uas.user.model.Room;
import edu.fra.uas.user.model.User;

public interface RoomService {
    Room joinRoom(Long roomId, User user);
    Boolean leaveRoom(Long roomId, Long userId);
    Message sendMessage(Long roomId, Message message);
}
