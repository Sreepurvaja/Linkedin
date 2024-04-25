package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Postupdate")
@NoArgsConstructor
@AllArgsConstructor
public class Postupdate {
    @Id
    @Column(name = "PostID")
    @GeneratedValue
    private int postID;

    @Column(name ="UserID")
    private int userID;

    @Column(name = "Content")
    private String content;

    @Column(name = "PostDate")
    private java.sql.Timestamp postDate;

    @Column(name = "Comments")
    private String comments;

    @Column(name = "LikeCount")
    private int likeCount;

    // Getters and Setters
    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public java.sql.Timestamp getPostDate() {
        return postDate;
    }

    public void setPostDate(java.sql.Timestamp postDate) {
        this.postDate = postDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
