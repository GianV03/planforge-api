package com.planforge.planforge_api.subscription.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record SubscriptionResponse(

        UUID id,

        String serviceName,

        BigDecimal monthlyCost,

        LocalDate billingDate,

        String status,

        LocalDateTime createdAt

) {
}
