package com.Learning.project.Lovable_Clone.dto.usage;

public record TodayUsageResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewLimit
) {
}
