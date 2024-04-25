package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Notifications")
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @Column(name = "notificationid")
    @GeneratedValue
    private int notificationId;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "notification_type")
    private String notificationType;

    @Column(name = "notification_content")
    private String notificationContent;

    // Getter and Setter methods
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }
}
