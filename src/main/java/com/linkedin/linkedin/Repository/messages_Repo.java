package com.linkedin.linkedin.Repository;



import com.linkedin.linkedin.Entity.messages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface messages_Repo extends JpaRepository<messages, Integer> {
    // You can add custom query methods here if needed
    List<messages> findByUserId(int userId);

}


