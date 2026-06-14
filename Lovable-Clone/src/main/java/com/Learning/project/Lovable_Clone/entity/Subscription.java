package com.Learning.project.Lovable_Clone.entity;

import com.Learning.project.Lovable_Clone.Enum.SubscriptionStatus;
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
public class Subscription {
    @Id
    Long id;
    User user;
    Plan plan;
    String stripeSubscriptionId;
    SubscriptionStatus status;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;
    Instant createdAt;
    Instant updatedAt;
}
