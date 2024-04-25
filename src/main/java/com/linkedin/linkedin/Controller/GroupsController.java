package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.Groups;
import com.linkedin.linkedin.Entity.Notification;
import com.linkedin.linkedin.Entity.Viewskill;

import com.linkedin.linkedin.Entity.connection;
import com.linkedin.linkedin.Service.GroupsService;
import com.linkedin.linkedin.Service.NotificationService;
import com.linkedin.linkedin.Service.ViewskillService;
import com.linkedin.linkedin.Service.connectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class GroupsController {
    @Autowired
    private GroupsService groupsService;

    @PostMapping("/postgroups")
    public Groups savegroups(@RequestBody Groups groups) {
        return groupsService.savegroups(groups);
    }

    @GetMapping("/viewgroups/{userId}")
    public Optional<Groups> getgroupsById (@PathVariable Integer userId) {
        return groupsService.getgroupsById(userId);
    }

    @DeleteMapping("/deletegroups/{groupId}")
    public String deletegroupsById (@PathVariable Integer groupId ) {
        groupsService.deletegroupsById(groupId);
        return "Deleted successfully";
    }
}

