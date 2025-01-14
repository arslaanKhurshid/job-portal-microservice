package com.example.applicationservice.service;

import com.example.applicationservice.entity.Application;
import com.example.applicationservice.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application applyForJob(Application application) {
        return applicationRepository.save(application);
    }
}
