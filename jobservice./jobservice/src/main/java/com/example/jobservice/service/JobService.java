package com.example.jobservice.service;

import com.example.jobservice.entity.Job;
import com.example.jobservice.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job postJob(Job job, Long userId) {
        job.setUserId(userId); // Set the userId of the logged-in user
        return jobRepository.save(job);
    }
}
