package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "Education")
@NoArgsConstructor
@AllArgsConstructor
public class Addeducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Educationid")
    private int educationId;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "School")
    private String school;

    @Column(name = "Percentage")
    private int percentage;

    @Column(name = "College")
    private String college;

    @Column(name = "CGPA")
    private int cgpa;

    @Column(name = "Degree")
    private String degree;

    @Column(name = "FieldOfStudy")
    private String fieldOfStudy;

    @Column(name = "GraduationDate")
    private Date graduationDate;
}
