package com.linkedin.linkedin.Service;

import com.linkedin.linkedin.Entity.Viewexperience;

import com.linkedin.linkedin.Repository.Viewexperience_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViewexperienceService {
    @Autowired
    private Viewexperience_Repo viewexperienceRepository;

    public Viewexperience saveExperience(Viewexperience experienceEntity) {
        return viewexperienceRepository.save(experienceEntity);
    }

    public List<Viewexperience> getAllExperiences() {
        return viewexperienceRepository.findAll();
    }

    public Viewexperience getExperienceById(int experienceID) {
        Optional<Viewexperience> optionalExperience = viewexperienceRepository.findById(experienceID);
        return optionalExperience.orElse(null);
    }

    public void deleteExperience(int experienceID) {
        viewexperienceRepository.deleteById(experienceID);
    }

    public Viewexperience updateExperience(int experienceID, Viewexperience experienceEntity) {
        Optional<Viewexperience> optionalExperience = viewexperienceRepository.findById(experienceID);
        if (optionalExperience.isPresent()) {
            Viewexperience existingExperience = optionalExperience.get();
            existingExperience.setUserID(experienceEntity.getUserID());
            existingExperience.setPosition(experienceEntity.getPosition());
            existingExperience.setCompany(experienceEntity.getCompany());
            existingExperience.setStartDate(experienceEntity.getStartDate());
            existingExperience.setEndDate(experienceEntity.getEndDate());
            return viewexperienceRepository.save(existingExperience);
        }
        return null;
    }
}



