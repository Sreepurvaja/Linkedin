package com.linkedin.linkedin.Repository;

import com.linkedin.linkedin.Entity.Groups;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Groups_Repo extends JpaRepository<Groups, Integer> {
    // You can add custom query methods here if needed
}

