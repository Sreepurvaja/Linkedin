package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Vieweducation;

import com.linkedin.linkedin.Repository.Vieweducation_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VieweducationService {
    @Autowired
    private Vieweducation_Repo vieweducation_repo;

    public Vieweducation saveVieweducation(Vieweducation vieweducation) {
        return vieweducation_repo.save(vieweducation);
    }

    public List<Vieweducation> getUserEducation(Integer userId) {
        return vieweducation_repo.findByUserId(userId);
    }

    public void deleteEducationByUserId(Integer userId) {}}


//    public boolean deleteEducationByUserId(Integer userId) {
//
//
//        // Add other service methods as needed
//    }

