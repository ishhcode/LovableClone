package com.Learning.project.Lovable_Clone.dto.usage;

public record PlanLimitResponse(
        String planName,
        Integer maxTokensPerDay,
        Integer maxProjects,
        Integer maxPreviews,
        Boolean unlimitedAi
) {
}
