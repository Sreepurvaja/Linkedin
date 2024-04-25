package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.User;
import com.linkedin.linkedin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/addUser")
    public User postDetails(@RequestBody User user)
    {
        return userService.saveDetails(user);
    }
}
