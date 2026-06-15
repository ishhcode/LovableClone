package com.Learning.project.Lovable_Clone.dto.project;

import com.Learning.project.Lovable_Clone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        String thumbnail,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse userProfile
) {
}
