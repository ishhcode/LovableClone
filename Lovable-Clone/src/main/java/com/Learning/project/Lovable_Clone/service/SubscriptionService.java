package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.subscription.CheckoutRequest;
import com.Learning.project.Lovable_Clone.dto.subscription.PortalReponse;
import com.Learning.project.Lovable_Clone.dto.subscription.SubscriptionResponse;
import com.Learning.project.Lovable_Clone.dto.subscription.checkoutResponse;

public interface SubscriptionService {
     checkoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest request);

     SubscriptionResponse GetMySubscription(Long userId);

    PortalReponse OpenCustomerPortal(Long userId);
}
