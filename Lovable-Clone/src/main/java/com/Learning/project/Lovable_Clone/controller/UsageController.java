package com.Learning.project.Lovable_Clone.controller;


import com.Learning.project.Lovable_Clone.dto.usage.PlanLimitResponse;
import com.Learning.project.Lovable_Clone.dto.usage.TodayUsageResponse;
import com.Learning.project.Lovable_Clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<TodayUsageResponse> getTodayUsage(){

        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodaySErviceUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsUser(userId));
    }



}
