package com.Learning.project.Lovable_Clone.entity;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;
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
public class ProjectMember {

    ProjectMemberId id;
    Project project;
    User user;
    ProjectRole role;
    Instant invitedAt;
    Instant acceptedAt;

}
