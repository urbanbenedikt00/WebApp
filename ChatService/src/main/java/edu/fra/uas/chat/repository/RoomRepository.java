package edu.fra.uas.chat.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.chat.model.Room;

@Repository
public class RoomRepository extends HashMap<Long, Room> {

}
