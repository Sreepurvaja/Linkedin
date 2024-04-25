package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Groups;


import com.linkedin.linkedin.Entity.messages;
import com.linkedin.linkedin.Repository.messages_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class messagesService {
    @Autowired
    private messages_Repo messages_repo;

    public messages savemessages (messages Messages) {
        return messages_repo.save(Messages);
    }

    public void deletemessagesById(Integer messageId) {
        messages_repo.deleteById(messageId);
    }
    public List<messages> findAllMessagesByUserId(Integer userId) {
        return messages_repo.findByUserId(userId);
    }



    // Add more methods as needed
}
