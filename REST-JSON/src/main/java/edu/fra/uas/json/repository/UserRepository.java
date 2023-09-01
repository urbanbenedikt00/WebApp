package edu.fra.uas.json.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.json.model.User;

@Repository
public class UserRepository extends HashMap<Long, User> {
    
}
