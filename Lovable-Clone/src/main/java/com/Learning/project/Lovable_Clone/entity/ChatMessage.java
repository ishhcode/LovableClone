package com.Learning.project.Lovable_Clone.entity;

import com.Learning.project.Lovable_Clone.Enum.MessageRole;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;
    MessageRole role;
    String content;
    String toolCalls; // json array of tools called
    String toolCallId;
    Integer tokensUsed;
    Instant createdAt;

}
