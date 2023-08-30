package edu.fra.uas.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import edu.fra.uas.user.model.Message;
import edu.fra.uas.user.model.Room;
import edu.fra.uas.user.model.User;
import edu.fra.uas.user.service.RoomService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = { "/rooms" })
public class RoomController implements RoomService {

    private static final Logger log = LoggerFactory.getLogger(RoomController.class);
    @Value("${api.external.url.rooms}")
    String apiUrl;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<>(headers);
        String uriReturn = this.apiUrl;
        ResponseEntity<?> response = null;

        try {
            response = restTemplate.exchange(uriReturn, HttpMethod.GET, request, Room.class);
        } catch (ResourceAccessException e) {
            response = new ResponseEntity<>("not successful :: room service not available?", HttpStatus.OK);
        }
        return response;
    }

    @GetMapping(value = { "/{id}" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return this.sendRequest(apiUrl + "/" + id, HttpMethod.GET, null);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody Room room) {
        log.info("POST -> /rooms -> {}", room);
        return this.sendRequest(apiUrl, HttpMethod.POST, room);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody Room room) {
        return this.sendRequest(apiUrl, HttpMethod.PUT, room);
    }

    @DeleteMapping(value = {"/{id}"})
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Room joinRoom(Long roomId, User user) {
        throw new UnsupportedOperationException("Unimplemented method 'joinRoom'");
    }

    @Override
    public Boolean leaveRoom(Long roomId, Long userId) {
        throw new UnsupportedOperationException("Unimplemented method 'leaveRoom'");
    }

    @Override
    public Message sendMessage(Long roomId, Message message) {
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }

    private ResponseEntity<?> sendRequest(String uri, HttpMethod httpMethod, Room room) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Room> request = new HttpEntity<>(headers);
        if (httpMethod == HttpMethod.POST || httpMethod == HttpMethod.PUT) {
            request = new HttpEntity<>(room, headers);
        }

        ResponseEntity<?> response = null;

        try {
            response = restTemplate.exchange(uri, httpMethod, request, Room.class);
        } catch (ResourceAccessException e) {
            response = new ResponseEntity<>("not successful :: room service not available?", HttpStatus.OK);
        }
        return response;
    }

}
