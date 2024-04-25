package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Connections")
@NoArgsConstructor
@AllArgsConstructor
public class connection {
    @Id
    @Column(name = "Connectionsid")
    @GeneratedValue
    private int connectionId;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "Name")
    private String name;

    @Column(name = "current_position")
    private String currentPosition;

    @Column(name = "Company")
    private String company;

    @Column(name = "Team")
    private int team;

    @Column(name = "Connection_status")
    private String connectionStatus;

    @Column(name = "Location")
    private String location;

    @Column(name = "mutual_connection")
    private int mutualConnection;

    // Getter and Setter methods
    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMutualConnection() {
        return mutualConnection;
    }

    public void setMutualConnection(int mutualConnection) {
        this.mutualConnection = mutualConnection;
    }
}

