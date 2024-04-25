package com.linkedin.linkedin.Repository;


import com.linkedin.linkedin.Entity.Vieweducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Vieweducation_Repo extends JpaRepository<Vieweducation, Integer> {
    List<Vieweducation> findByUserId(Integer userId);
}

