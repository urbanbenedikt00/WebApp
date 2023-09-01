package edu.fra.uas.chat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fra.uas.chat.model.Room;
import edu.fra.uas.chat.repository.RoomRepository;

@Service
public class RoomService {
    private static final Logger log = LoggerFactory.getLogger(RoomService.class);

    @Autowired
    private RoomRepository roomRepository;

    private long nextRoomId = 1;

    public Room create(Room room){
        log.info("createRoom: {}", room);
        room.setId(this.nextRoomId++);
        this.roomRepository.put(room.getId(), room);
        return room;
    }

    public Iterable<Room> getAll(){
        log.info("getAllRooms");
        return this.roomRepository.values();
    }

    public Room getById(Long id) {
        log.info("get room by id: {}", id);
        return this.roomRepository.get(id);
    }

    public Room update(Room room){
        log.info("update room: {}", room);
        this.roomRepository.put(room.getId(), room);
        return room;
    }

    public void delete(Long id){
        log.info("delete room: {}", id);
        this.roomRepository.remove(id);
    }
}
