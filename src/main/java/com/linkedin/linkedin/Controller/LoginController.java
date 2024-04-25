package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Login;

import com.linkedin.linkedin.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody Login login) {
        Login user = loginService.authenticate(login.getEmail(), login.getPassword());
        if (user != null) {
            return "Login Successful!";
        } else {
            return "Invalid Credentials. Please try again.";
        }
    }
}
