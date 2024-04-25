package com.linkedin.linkedin.Repository;


import com.linkedin.linkedin.Entity.Viewprofile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.View;

@Repository
public interface Viewprofile_Repo extends JpaRepository<Viewprofile, Integer> {
    // You can add custom query methods if needed
}
