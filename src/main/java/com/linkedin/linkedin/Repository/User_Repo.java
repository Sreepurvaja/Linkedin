package com.linkedin.linkedin.Repository;


import com.linkedin.linkedin.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repo extends JpaRepository<User,Integer> {
}
