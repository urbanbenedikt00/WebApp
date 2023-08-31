package edu.fra.uas.chat.controller;

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

import edu.fra.uas.chat.model.Room;
import edu.fra.uas.chat.service.RoomService;

@RestController
@RequestMapping(value = { "/rooms" })
public class RoomController implements BaseController<Room> {
    private static final Logger log = LoggerFactory.getLogger(RoomController.class);

    @Autowired
    private RoomService roomService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<List<Room>> getAll() {
        log.info("Get: /rooms");
        Iterable<Room> roomsIterable = this.roomService.getAll();
        List<Room> rooms = new ArrayList<>();
        for (Room room : roomsIterable) {
            rooms.add(room);
        }
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> getById(@PathVariable("id") Long id) {
        log.info("Get: /rooms/{}", id);
        Room room = this.roomService.getById(id);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> create(@RequestBody Room room) {
        log.info("Post: /rooms -> {}", room);
        room = this.roomService.create(room);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> update(@RequestBody Room room) {
        log.info("Put: /rooms -> {}", room);
        room = this.roomService.update(room);
        return new ResponseEntity<>(room, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = {"/{id}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        log.info("Delete: /rooms/{}", id);
        this.roomService.delete(id);
        return new ResponseEntity<>("Room is deleted", HttpStatus.ACCEPTED);
    }

}
