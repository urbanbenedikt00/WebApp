package edu.fra.uas.curd.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.curd.model.User;

@Repository
public class UserRepository extends HashMap<Long, User> {
    
}
