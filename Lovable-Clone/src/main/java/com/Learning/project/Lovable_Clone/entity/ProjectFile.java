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
public class ProjectFile {

    @Id
    Long id;
    Project projectId;
    String path;
    String minioObjKey;
    User createdBy;
    User updatedBy;
    Instant createdAt;
    Instant updatedAt;
}
