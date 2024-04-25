package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Vieweducation;
import com.linkedin.linkedin.Service.VieweducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VieweducationController {
    @Autowired
    private VieweducationService vieweducationService;

    @GetMapping("/Education/{userId}")
    public List<Vieweducation> getUserEducation(@PathVariable Integer userId) {
        return vieweducationService.getUserEducation(userId);
    }
    @DeleteMapping("/education/{userId}")
    public ResponseEntity<String> deleteEducationByUserId(@PathVariable Integer userId) {
        try {
            vieweducationService.deleteEducationByUserId(userId);
            return new ResponseEntity<>("Education data for user with ID " + userId + " deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting education data for user with ID " + userId, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    }

