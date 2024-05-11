package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "addpost")
@NoArgsConstructor
@AllArgsConstructor
public class Addpost {
    @Id
    @Column(name = "PostID")
//    @GeneratedValue
    private int postID;

    @Column(name ="UserID")
    private int userID;

    @Column(name = "Content")
    private String content;

    @Column(name = "ImageUrl")
    private String imageUrl;





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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}



