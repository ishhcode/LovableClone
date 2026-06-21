package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.subscription.CheckoutRequest;
import com.Learning.project.Lovable_Clone.dto.subscription.PortalReponse;
import com.Learning.project.Lovable_Clone.dto.subscription.SubscriptionResponse;
import com.Learning.project.Lovable_Clone.dto.subscription.checkoutResponse;
import com.Learning.project.Lovable_Clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public checkoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest request) {
        return null;
    }

    @Override
    public SubscriptionResponse GetMySubscription(Long userId) {
        return null;
    }

    @Override
    public PortalReponse OpenCustomerPortal(Long userId) {
        return null;
    }
}
