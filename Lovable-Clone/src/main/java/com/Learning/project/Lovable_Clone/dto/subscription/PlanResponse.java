package com.Learning.project.Lovable_Clone.dto.subscription;

public record PlanResponse(
        Long id,
        String name,
        String stripePriceId,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAi //unllimited access to LLM, ignore maxTokenPerDay if true
) {
}
