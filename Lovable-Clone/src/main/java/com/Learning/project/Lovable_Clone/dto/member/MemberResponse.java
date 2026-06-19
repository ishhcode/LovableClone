package com.Learning.project.Lovable_Clone.dto.member;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        Instant invitedAt,
        ProjectRole role

) {
}
