package com.Learning.project.Lovable_Clone.dto.project;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String projectName,
        String thumbnail,
        Instant createdAt,
        Instant updatedAt
) {
}
