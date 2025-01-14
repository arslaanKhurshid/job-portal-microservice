package com.example.applicationservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId; // New field to store the userId of the person applying
    private Long jobId;
    private String status;
}
