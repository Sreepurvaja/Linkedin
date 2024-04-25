package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data
@Table(name = "Viewjob")
//@NoArgsConstructor
@AllArgsConstructor

public class Viewjob {
    @Id
    @GeneratedValue
    @Column(name = "JobID")
    private Integer jobId;

    @Column(name = "UserID")
    private Integer userId;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "Position")
    private String position;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "ApplicationDate")
    private Date applicationDate;

    @Column(name = "ApplicationStatus")
    private String applicationStatus;

    // Constructors, Getters, and Setters

    public Viewjob() {
    }

    public Viewjob(Integer userId, String companyName, String position, String description, Date applicationDate, String applicationStatus) {
        this.userId = userId;
        this.companyName = companyName;
        this.position = position;
        this.description = description;
        this.applicationDate = applicationDate;
        this.applicationStatus = applicationStatus;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
