package com.Learning.project.Lovable_Clone.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMemberId {

    Long projectId;
    Long userId;
}
