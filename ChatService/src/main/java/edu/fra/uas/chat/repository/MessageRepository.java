package edu.fra.uas.chat.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import edu.fra.uas.chat.model.Message;

@Repository
public class MessageRepository extends HashMap<Long, Message> {

}
