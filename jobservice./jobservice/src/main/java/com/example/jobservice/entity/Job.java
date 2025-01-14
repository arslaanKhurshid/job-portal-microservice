package com.example.jobservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private String companyName;
    private double salary;

    // Associate job with user
    private Long userId; // New field to store the user who posted the job
}
