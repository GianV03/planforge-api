package com.planforge.planforge_api.subscription.service;

import com.planforge.planforge_api.subscription.dto.request.CreateSubscriptionRequest;
import com.planforge.planforge_api.subscription.dto.response.SubscriptionResponse;

import java.util.List;
import java.util.UUID;

public interface SubscriptionService {

    SubscriptionResponse create(CreateSubscriptionRequest request, UUID userId);

    List<SubscriptionResponse> findAll(UUID userId);

    SubscriptionResponse findById(UUID id);

}
