package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Addeducation;
import com.linkedin.linkedin.Service.AddeducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddeducationController {
    @Autowired
    private AddeducationService addeducationService;

    @PostMapping("/addEducation")
    public Addeducation postDetails(@RequestBody Addeducation addeducation) {
        return addeducationService.saveDetails(addeducation);
    }
}
