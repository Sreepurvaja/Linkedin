package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Addpost;
import com.linkedin.linkedin.Entity.Postupdate;
import com.linkedin.linkedin.Service.AddpostService;
import com.linkedin.linkedin.Service.PostupdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddpostController {
    @Autowired
    private AddpostService addpostService;

    @PostMapping("/addpost")
    public Addpost savePost(@RequestBody Addpost addpost) {
        return addpostService.savePost(addpost);
    }
}

