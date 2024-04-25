package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Viewjob;

import com.linkedin.linkedin.Repository.Viewjob_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViewjobService {
    @Autowired
    private Viewjob_Repo viewjob_repo;

    public Viewjob saveViewjob(Viewjob viewjob) {
        return viewjob_repo.save(viewjob);
    }

    public Optional<Viewjob> getViewjobById(Integer jobId) {
        return viewjob_repo.findById(jobId);
    }

    // Add other service methods as needed
}

