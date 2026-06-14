package com.Learning.project.Lovable_Clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    @Id
    Long id;
    String name;
    String description;
    User ownerId;
    Boolean isPublic = false;
    String thumbnailUrl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;  //soft delete
}
