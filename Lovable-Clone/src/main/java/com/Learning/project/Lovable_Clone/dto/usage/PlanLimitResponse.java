package com.Learning.project.Lovable_Clone.dto.usage;

public record PlanLimitResponse(
        String planName,
        int maxTokensPerDay,
        int maxProjects,
        int maxPreviews,
        Boolean unlimitedAi
) {
}
