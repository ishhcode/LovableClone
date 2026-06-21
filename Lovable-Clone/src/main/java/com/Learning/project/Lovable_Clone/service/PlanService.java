package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
