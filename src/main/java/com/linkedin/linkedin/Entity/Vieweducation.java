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
public class Vieweducation {
    @Id
    @Column(name = "Educationid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationId;

    @Column(name = "UserID")
    private Integer userId;

    @Column(name = "School")
    private String school;

    @Column(name = "Percentage")
    private Integer percentage;

    @Column(name = "College")
    private String college;

    @Column(name = "CGPA")
    private Integer cgpa;

    @Column(name = "Degree")
    private String degree;

    @Column(name = "FieldOfStudy")
    private String fieldOfStudy;

    @Column(name = "GraduationDate")
    @Temporal(TemporalType.DATE)
    private Date graduationDate;

    // Getters and Setters
    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }
}

