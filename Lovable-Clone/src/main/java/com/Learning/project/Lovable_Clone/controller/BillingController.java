package com.Learning.project.Lovable_Clone.controller;

import com.Learning.project.Lovable_Clone.dto.subscription.*;
import com.Learning.project.Lovable_Clone.service.PlanService;
import com.Learning.project.Lovable_Clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.GetMySubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<checkoutResponse> createCheckoutResponse(
            @PathVariable CheckoutRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(userId, request));

    }

    @PostMapping("/api/stripe/portal")
    public ResponseEntity<PortalReponse> openCustomerPortal(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.OpenCustomerPortal(userId));
    }
}
