package com.linkedin.linkedin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "messages") // Table name should match the actual table name in the database
@NoArgsConstructor
@AllArgsConstructor
public class messages {
    @Id
    @Column(name = "messageID")
    private int messageId;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "content")
    private String content;

    // Getter and Setter methods
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
