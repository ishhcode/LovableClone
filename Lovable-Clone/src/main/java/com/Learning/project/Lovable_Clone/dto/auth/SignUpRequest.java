package com.Learning.project.Lovable_Clone.dto.auth;

public record SignUpRequest(
        String email,
        String name,
        String password
) {
}
