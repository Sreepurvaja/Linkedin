package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Viewjob;
import com.linkedin.linkedin.Service.ViewjobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ViewjobController {
    @Autowired
    private ViewjobService viewjobService;

    @PostMapping("/viewjob")
    public Viewjob createViewjob(@RequestBody Viewjob viewjob) {
        return viewjobService.saveViewjob(viewjob);
    }

    @GetMapping("/viewjob/{jobId}")
    public Optional<Viewjob> getViewjobById(@PathVariable Integer jobId) {
        return viewjobService.getViewjobById(jobId);
    }

    // Add other controller methods as needed
}
