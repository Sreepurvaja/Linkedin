package com.linkedin.linkedin.Controller;

import com.linkedin.linkedin.Entity.Postupdate;
import com.linkedin.linkedin.Service.PostupdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PostupdateController {
    @Autowired
    private PostupdateService postupdateService;

//    @PostMapping("/addpost")
//    public Postupdate savePostupdate (@RequestBody Postupdate postupdate) {
//        return postupdateService.savePostupdate(postupdate);
//    }

    @GetMapping("/postupdate/{postId}")
    public Optional<Postupdate> getPostupdateById(@PathVariable Integer postId) {
        return postupdateService.getPostupdateById(postId);
    }
    @DeleteMapping("/deletepost/{postId}")
    public String deletepostById(@PathVariable Integer postId) {
        postupdateService.deletepostById(postId);
        return "Deleted successfully";
    }


}
