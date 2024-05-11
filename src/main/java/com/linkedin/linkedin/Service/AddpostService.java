package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Addpost;
import com.linkedin.linkedin.Entity.Postupdate;

import com.linkedin.linkedin.Repository.Addpost_Repo;
import com.linkedin.linkedin.Repository.Postupdate_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddpostService {
    @Autowired
    private Addpost_Repo Addpost_repo;

    public Addpost savePost(Addpost addpost) {
        return Addpost_repo.save(addpost);
    }
}
