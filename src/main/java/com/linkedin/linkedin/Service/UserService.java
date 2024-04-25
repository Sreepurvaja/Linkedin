package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.User;
import com.linkedin.linkedin.Repository.User_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private User_Repo user_Repo;

    public User saveDetails(User user) {
        return user_Repo.save(user);
    }
}
