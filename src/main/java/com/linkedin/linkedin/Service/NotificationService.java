package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Notification;

import com.linkedin.linkedin.Repository.Notification_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    private Notification_Repo notification_repo;

    public Notification saveNotification(Notification notification) {
        return notification_repo.save(notification);
    }

    public Optional<Notification> getNotificationById(Integer userId) {
        return notification_repo.findById(userId);
    }

    public void deleteNotificationById(Integer notificationId) {
        notification_repo.deleteById(notificationId);
    }

    // Add more methods as needed
}
