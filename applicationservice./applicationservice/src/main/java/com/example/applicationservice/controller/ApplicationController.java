package com.example.applicationservice.controller;

import com.example.applicationservice.entity.Application;
import com.example.applicationservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/apply")
    public Application applyForJob(@RequestBody Application application, @RequestParam Long userId) {
        application.setUserId(userId);
        return applicationService.applyForJob(application);
    }
}
