package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Addeducation;

import com.linkedin.linkedin.Repository.Addeducation_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddeducationService {
    @Autowired
    private Addeducation_Repo addeducation_repo;

    public Addeducation saveDetails(Addeducation addeducation) {
        return addeducation_repo.save(addeducation);
    }
}
