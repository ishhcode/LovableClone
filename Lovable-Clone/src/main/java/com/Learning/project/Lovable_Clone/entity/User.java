package com.Learning.project.Lovable_Clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
     Long id;
     String email;
     String passwordHash;
     String name;
     String avatarUrl;
     String provider;
     String providerId;
     Boolean emailVerified;
     String stripeCustomerId;
     Instant createdAt;
     Instant updatedAt;
     Instant deletedAt;  //soft delete
}
