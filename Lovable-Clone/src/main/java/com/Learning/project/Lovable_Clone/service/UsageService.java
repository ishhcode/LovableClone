package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.usage.PlanLimitResponse;
import com.Learning.project.Lovable_Clone.dto.usage.TodayUsageResponse;

public interface UsageService {
     TodayUsageResponse getTodayServiceUser(Long userId);

     PlanLimitResponse getCurrentSubscriptionLimitsUser(Long userId);
}
