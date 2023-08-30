package edu.fra.uas.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface BaseController<T> {
    ResponseEntity<List<T>> getAll();

    ResponseEntity<T> getById(Long id);

    ResponseEntity<T> create(T t);

    ResponseEntity<T> update(T t);

    ResponseEntity<String> delete(Long id);
}
