package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.Viewprofile;

import com.linkedin.linkedin.Service.ViewprofileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ViewprofileController {
    @Autowired
    private ViewprofileService viewprofileService;

    @GetMapping("/profile/{userID}")
    public Optional<Viewprofile> getUserProfile(@PathVariable Integer userID) {
        return viewprofileService.getUserProfile(userID);
    }
}
