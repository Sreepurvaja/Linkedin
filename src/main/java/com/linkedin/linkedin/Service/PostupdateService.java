package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Postupdate;

import com.linkedin.linkedin.Repository.Postupdate_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostupdateService {
    @Autowired
    private Postupdate_Repo postupdate_repo;

    public Postupdate savePostupdate(Postupdate postupdate) {
        return postupdate_repo.save(postupdate);
    }

    public Optional<Postupdate> getPostupdateById(Integer postId) {
        return postupdate_repo.findById(postId);
    }

    // Add other service methods as needed
}


