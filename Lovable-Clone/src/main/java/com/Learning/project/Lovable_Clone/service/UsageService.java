package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.usage.PlanLimitResponse;
import com.Learning.project.Lovable_Clone.dto.usage.TodayUsageResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
     TodayUsageResponse getTodaySErviceUser(Long userId);

     PlanLimitResponse getCurrentSubscriptionLimitsUser(Long userId);
}
