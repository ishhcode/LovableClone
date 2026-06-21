package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.usage.PlanLimitResponse;
import com.Learning.project.Lovable_Clone.dto.usage.TodayUsageResponse;
import com.Learning.project.Lovable_Clone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public TodayUsageResponse getTodayServiceUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsUser(Long userId) {
        return null;
    }
}
