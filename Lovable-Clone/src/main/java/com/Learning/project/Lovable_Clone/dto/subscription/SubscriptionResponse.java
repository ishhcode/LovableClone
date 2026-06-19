package com.Learning.project.Lovable_Clone.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant PeriodEnd,
        Long tokensUsedThisCycle
) {
}
