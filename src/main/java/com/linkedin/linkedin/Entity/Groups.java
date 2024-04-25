package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "viewgroups")
@NoArgsConstructor
@AllArgsConstructor
public class Groups {
    @Id
    @Column(name = "groupID")
    @GeneratedValue
    private int groupId;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_members")
    private int groupMembers;

    // Getter and Setter methods
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(int groupMembers) {
        this.groupMembers = groupMembers;
    }
}
