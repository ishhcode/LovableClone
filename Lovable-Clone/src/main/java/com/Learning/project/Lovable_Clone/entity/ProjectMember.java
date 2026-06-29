package com.Learning.project.Lovable_Clone.entity;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "project_members")
public class ProjectMember {

    @EmbeddedId
    ProjectMemberId id;
    @ManyToOne
    @MapsId("projectId")
    Project project;
    @ManyToOne
    @MapsId("userId")
    User user;
    ProjectRole role;
    Instant invitedAt;
    Instant acceptedAt;

}
