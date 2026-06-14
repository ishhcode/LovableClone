package com.Learning.project.Lovable_Clone.entity;

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
public class ChatSession {

    Long id;
    Project projectId;
    User userId;
    String title;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;  //soft delete
}
