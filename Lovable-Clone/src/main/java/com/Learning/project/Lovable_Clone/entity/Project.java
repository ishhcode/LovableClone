package com.Learning.project.Lovable_Clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "projects")
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    String description;
    @ManyToOne            //many project to one owner
    @JoinColumn(name = "owner_id", nullable = false)
    User owner;
    Boolean isPublic = false;
    String thumbnailUrl;
    @CreationTimestamp
    Instant createdAt;
    @UpdateTimestamp
    Instant updatedAt;
    Instant deletedAt;  //soft delete
}
