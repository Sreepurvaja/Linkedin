package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.Viewskill;

import com.linkedin.linkedin.Entity.connection;
import com.linkedin.linkedin.Service.ViewskillService;
import com.linkedin.linkedin.Service.connectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class connectionController {
    @Autowired
    private connectionService ConnectionService;

    @PostMapping("/view")
    public connection saveViewconnection(@RequestBody connection Connection) {
        return ConnectionService.saveViewconnection(Connection);
    }

    @GetMapping("/viewconnection/{userId}")
    public Optional<connection> getViewconnectionById(@PathVariable Integer userId) {
        return ConnectionService.getViewconnectionById(userId);
    }

    @DeleteMapping("/connection/{userId}")
    public String deleteconnectionByUserId(@PathVariable Integer userId) {
        ConnectionService.deleteconnectionByUserId(userId);
        return "Deleted successfully";
    }
}

//        try {
//            ConnectionService.deleteconnectionByUserId (userId);
//            return new ResponseEntity<>("Connection data for user with ID " + userId + " deleted successfully", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Error deleting Connection data for user with ID " + userId, HttpStatus.INTERNAL_SERVER_ERROR);
//        }



