package com.Learning.project.Lovable_Clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user) {
}
