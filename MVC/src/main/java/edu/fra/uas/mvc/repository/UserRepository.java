package edu.fra.uas.mvc.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.mvc.model.User;

@Repository
public class UserRepository extends HashMap<Long, User> {
    
}
