package com.example.jobservice.controller;

import com.example.jobservice.entity.Job;
import com.example.jobservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/post")
    public Job postJob(@RequestBody Job job, @RequestParam Long userId) {
        return jobService.postJob(job, userId);
    }
}
