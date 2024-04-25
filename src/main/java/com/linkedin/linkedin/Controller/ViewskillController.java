package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.Viewskill;

import com.linkedin.linkedin.Service.ViewskillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ViewskillController {
    @Autowired
    private ViewskillService viewskillService;

    @PostMapping("/skill")
    public Viewskill createViewskill(@RequestBody Viewskill viewskill) {
        return viewskillService.saveViewskill(viewskill);
    }

    @GetMapping("/view/{userId}")
    public Optional<Viewskill> getViewskillById(@PathVariable Integer userId) {
        return viewskillService.getViewskillById(userId);
    }

    @DeleteMapping("/viewskill/{userId}")
    public ResponseEntity<String> deleteskillByUserId(@PathVariable Integer userId) {
        try {
            viewskillService.deleteskillByUserId (userId);
            return new ResponseEntity<>("skill and Endorsement data for user with ID " + userId + " deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting skill and endorsement data for user with ID " + userId, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

