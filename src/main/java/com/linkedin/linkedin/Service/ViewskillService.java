package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Viewjob;

import com.linkedin.linkedin.Entity.Viewskill;

import com.linkedin.linkedin.Repository.Viewskill_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViewskillService {
    @Autowired
    private Viewskill_Repo  viewskill_repo;

    public Viewskill saveViewskill(Viewskill viewskill) {
        return viewskill_repo.save(viewskill);
    }

    public Optional<Viewskill> getViewskillById(Integer userId) {
        return viewskill_repo.findById(userId);
    }

    public void deleteskillByUserId(Integer userId) {}
}

