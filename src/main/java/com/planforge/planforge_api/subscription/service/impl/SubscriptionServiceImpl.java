package com.planforge.planforge_api.subscription.service.impl;

import com.planforge.planforge_api.subscription.dto.request.CreateSubscriptionRequest;
import com.planforge.planforge_api.subscription.dto.response.SubscriptionResponse;
import com.planforge.planforge_api.subscription.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    public SubscriptionServiceImpl(){

    }

    @Override
    public SubscriptionResponse create(CreateSubscriptionRequest request, UUID userId) {
        return null;
    }

    @Override
    public List<SubscriptionResponse> findAll(UUID userId) {
        return List.of();
    }

    @Override
    public SubscriptionResponse findById(UUID id) {
        return null;
    }

}
