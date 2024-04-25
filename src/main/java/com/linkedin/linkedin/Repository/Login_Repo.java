package com.linkedin.linkedin.Repository;

import com.linkedin.linkedin.Entity.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login_Repo extends JpaRepository<Login, Integer> {
    Login findByEmailAndPassword(String email, String password);
}
