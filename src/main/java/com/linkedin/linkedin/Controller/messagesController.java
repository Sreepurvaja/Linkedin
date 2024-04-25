package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.*;

import com.linkedin.linkedin.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class messagesController {
    @Autowired
    private messagesService MessagesService;

    @PostMapping("/postmessages")
    public messages savemessages (@RequestBody messages Messages) {
        return MessagesService.savemessages(Messages);
    }


    @GetMapping("/messages/{userId}")
    public ResponseEntity<List<messages>> getAllMessagesByUserId(@PathVariable Integer userId) {
        List<messages> messagesList = MessagesService.findAllMessagesByUserId(userId);
        return new ResponseEntity<>(messagesList, HttpStatus.OK);
    }

    @DeleteMapping("/deletemessages/{messageId}")
    public String deletemessagesById (@PathVariable Integer messageId ) {
        MessagesService.deletemessagesById(messageId);
        return "Deleted successfully";
    }
}

