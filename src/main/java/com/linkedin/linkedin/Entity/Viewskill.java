package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Skills_and_Endorsement")
@NoArgsConstructor
@AllArgsConstructor
public class Viewskill {
    @Id
    @Column(name = "skillid")
    @GeneratedValue
    private int skillId;

    @Column(name ="EndorsementDate")
    private String endorsementDate;

    @Column(name = "skillname")
    private String skillName;

    @Column(name = "userid")
    private int userId;

    // Getter and Setter methods
    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getEndorsementDate() {
        return endorsementDate;
    }

    public void setEndorsementDate(String endorsementDate) {
        this.endorsementDate = endorsementDate;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
