package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Viewexperience;
import com.linkedin.linkedin.Service.ViewexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/experience")
public class ViewexperienceController {
    @Autowired
    private ViewexperienceService viewexperienceService;

    @PostMapping("/postexperience")
    public Viewexperience saveExperience(@RequestBody Viewexperience experienceEntity) {
        return viewexperienceService.saveExperience (experienceEntity);
    }

//    @GetMapping("/all")
//    public List<Viewexperience> getAllExperiences() {
//        return viewexperienceService.getAllExperiences();
//    }

    @GetMapping("/getexperience/{experienceID}")
    public Viewexperience getExperienceById(@PathVariable int experienceID) {
        return viewexperienceService.getExperienceById(experienceID);
    }

    @DeleteMapping("/deleteexperience/{experienceID}")
    public String deleteExperience(@PathVariable int experienceID) {
        viewexperienceService.deleteExperience(experienceID);
        return "Deleted successfully";
    }

    @PutMapping("/updateexperience/{experienceID}")
    public Viewexperience updateExperience(@PathVariable int experienceID, @RequestBody Viewexperience experienceEntity) {
        return viewexperienceService.updateExperience(experienceID, experienceEntity);
    }
}


