package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.subscription.CheckoutRequest;
import com.Learning.project.Lovable_Clone.dto.subscription.PortalReponse;
import com.Learning.project.Lovable_Clone.dto.subscription.SubscriptionResponse;
import com.Learning.project.Lovable_Clone.dto.subscription.checkoutResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface SubscriptionService {
     checkoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest request);

     SubscriptionResponse GetMySubscription(Long userId);

    PortalReponse OpenCustomerPortal(Long userId);
}
