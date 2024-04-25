package com.linkedin.linkedin.Repository;

import com.linkedin.linkedin.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Notification_Repo extends JpaRepository<Notification, Integer> {
    // You can add custom query methods here if needed
}

