package com.Learning.project.Lovable_Clone.dto.usage;

public record TodayUsageResponse(
        Integer tokensUsed,
        Integer tokensLimit,
        Integer previewsRunning,
        Integer previewLimit
) {
}
