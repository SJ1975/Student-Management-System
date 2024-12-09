package com.SJ.studentManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is required")
    private String name;

    private int rollNumber;

    @NotEmpty(message = "Grade is required")
    private String grade;
}