package com.linkedin.linkedin.Controller;


import com.linkedin.linkedin.Entity.Notification;
import com.linkedin.linkedin.Entity.Viewskill;

import com.linkedin.linkedin.Entity.connection;
import com.linkedin.linkedin.Service.NotificationService;
import com.linkedin.linkedin.Service.ViewskillService;
import com.linkedin.linkedin.Service.connectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/postnotification")
    public Notification saveNotification(@RequestBody Notification notification) {
        return notificationService.saveNotification(notification);
    }

    @GetMapping("/viewnotification/{userId}")
    public Optional<Notification> getNotificationById(@PathVariable Integer userId) {
        return notificationService.getNotificationById(userId);
    }

    @DeleteMapping("/deletenotification/{notificationId}")
    public String deleteNotificationById(@PathVariable Integer notificationId) {
        notificationService.deleteNotificationById(notificationId);
        return "Deleted successfully";
    }
}
