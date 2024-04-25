package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Groups;


import com.linkedin.linkedin.Repository.Groups_Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupsService {
    @Autowired
    private Groups_Repo Group_repo;

    public Groups savegroups (Groups groups) {
        return Group_repo.save(groups);
    }

    public Optional<Groups> getgroupsById(Integer userId) {
        return Group_repo.findById(userId);
    }

    public void deletegroupsById(Integer groupId) {
        Group_repo.deleteById(groupId);
    }

    // Add more methods as needed
}
