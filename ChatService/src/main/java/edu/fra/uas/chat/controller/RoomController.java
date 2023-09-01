package edu.fra.uas.chat.controller;

import java.util.ArrayList;
import java.util.List;

import edu.fra.uas.chat.model.Message;
import edu.fra.uas.chat.model.User;
import edu.fra.uas.chat.service.MessageService;
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

// Import necessary libraries
@RestController
@RequestMapping(value = {"/rooms"})
public class RoomController implements BaseController<Room> {

    // Logger for logging requests
    private static final Logger log = LoggerFactory.getLogger(RoomController.class);

    // Autowire the RoomService and MessageService for handling room and message-related operations
    @Autowired
    private RoomService roomService;
    @Autowired
    private MessageService messageService;

    /**
     * Handle GET requests to fetch all rooms
     *
     * @return a JSON Response with all rooms and HTTP status code OK
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<List<Room>> getAll() {
        log.info("Get: /rooms"); // Log the request.

        // Fetch all rooms from the RoomService.
        Iterable<Room> roomsIterable = this.roomService.getAll();

        // Convert the iterable of rooms into a list for the response.
        List<Room> rooms = new ArrayList<>();
        for (Room room : roomsIterable) {
            rooms.add(room);
        }

        // Return the list of rooms as a JSON response with HTTP status OK.
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    /**
     * Handle GET requests to fetch a room by its ID
     *
     * @param id the room ID to fetch
     * @return a JSON response with room and HTTP status OK
     */
    @GetMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> getById(@PathVariable("id") Long id) {
        log.info("Get: /rooms/{}", id); // Log the request with the room's ID.

        // Fetch the room by its ID from the RoomService.
        Room room = this.roomService.getById(id);

        // Return the room as a JSON response with HTTP status OK.
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    /**
     * Handle POST requests to create a new room
     *
     * @param room the room to create
     * @return a JSON response with created room and HTTP status CREATED
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> create(@RequestBody Room room) {
        log.info("Post: /rooms -> {}", room); // Log the request with the room data.

        // Create the room using the RoomService.
        room = this.roomService.create(room);

        // Return the created room as a JSON response with HTTP status CREATED.
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    /**
     * Handle PUT requests to update an existing room
     *
     * @param room the room to update
     * @return a JSON response with updated room HTTP status ACCEPTED
     */
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<Room> update(@RequestBody Room room) {
        log.info("Put: /rooms -> {}", room); // Log the request with the updated room data.

        // Update the room using the RoomService.
        room = this.roomService.update(room);

        // Return the updated room as a JSON response with HTTP status ACCEPTED.
        return new ResponseEntity<>(room, HttpStatus.ACCEPTED);
    }

    /**
     * Handle DELETE requests to delete a room by its ID
     *
     * @param id the id of room
     * @return a JSON response with HTTP status ACCEPTED
     */
    @DeleteMapping(value = {"/{id}"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        log.info("Delete: /rooms/{}", id); // Log the request with the room's ID.

        // Delete the room by its ID using the RoomService.
        this.roomService.delete(id);

        // Return a response message indicating that the room is deleted with HTTP status ACCEPTED.
        return new ResponseEntity<>("Room is deleted", HttpStatus.ACCEPTED);
    }

    /**
     * Handle POST requests to allow a user to join a room
     *
     * @param id   the id of the room
     * @param user the user to join
     * @return a JSON response with room and HTTP status OK
     */
    @PostMapping(value = {"/{id}/join"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Room> join(@PathVariable("id") Long id, @RequestBody User user) {
        log.info("POST: /rooms/{}/join -> {}", id, user); // Log the request to join a room.

        // Fetch the room by its ID from the RoomService.
        Room room = this.roomService.getById(id);

        // Add the user to the room and update it using the RoomService.
        room.setUser(user);
        room = this.roomService.update(room);

        // Return the updated room as a JSON response with HTTP status OK.
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    /**
     * Handle GET requests to allow a user to leave a room
     *
     * @param roomId the id of the room
     * @param userId the id of the user
     * @return a JSON response with HTTP status OK.
     */
    @GetMapping(value = {"/{roomId}/leave/{userId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> leaveRoom(@PathVariable("roomId") Long roomId, @PathVariable("userId") Long userId) {
        log.info("GET: /rooms/{}/leave/{}", roomId, userId); // Log the request to leave a room.

        // Fetch the room by its ID from the RoomService.
        Room room = this.roomService.getById(roomId);

        // Remove the user from the room and update it using the RoomService.
        room.getUsers().remove(userId);
        room = this.roomService.update(room);

        // Return the updated room as a JSON response with HTTP status OK.
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    /**
     * Handle POST requests to send a message to a room
     *
     * @param id      the id of the room
     * @param message the message to send
     * @return a JSON response with room HTTP status OK
     */
    @PostMapping(value = {"/{roomId}/messages"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> sendMessage(@PathVariable("roomId") Long id, @RequestBody Message message) {
        log.info("POST: /rooms/{}/messages -> {}", id, message); // Log the request to send a message.

        // Fetch the room by its ID from the RoomService.
        Room room = this.roomService.getById(id);

        // Create the message using the MessageService.
        message = this.messageService.create(message);

        // Attach the message to the room and update it using the RoomService.
        room.setMessage(message);
        this.roomService.update(room);

        // Return the updated room as a JSON response with HTTP status OK.
        return new ResponseEntity<>(room, HttpStatus.OK);
    }
}
