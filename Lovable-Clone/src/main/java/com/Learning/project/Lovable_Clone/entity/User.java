package com.Learning.project.Lovable_Clone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users") //postgres already have a table named user
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @Email
    @NotBlank
     String email;
     String passwordHash;
     String name;
     String avatarUrl;
     String provider;
     String providerId;
     Boolean emailVerified;
     String stripeCustomerId;
     @CreationTimestamp
     Instant createdAt;
     @UpdateTimestamp
     Instant updatedAt;
     Instant deletedAt;  //soft delete
}
