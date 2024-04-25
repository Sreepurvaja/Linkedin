package com.linkedin.linkedin.Service;


import com.linkedin.linkedin.Entity.Viewprofile;

import com.linkedin.linkedin.Repository.Viewprofile_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViewprofileService {
    @Autowired
    private Viewprofile_Repo viewProfileRepository;

    public Optional<Viewprofile> getUserProfile(Integer userID) {
        return viewProfileRepository.findById(userID);
    }
}

