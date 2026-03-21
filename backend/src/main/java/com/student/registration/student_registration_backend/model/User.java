package com.student.registration.student_registration_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String course;

    @Column(name = "student_class")
    private String studentClass;

    private Double percentage;

    private String branch;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
