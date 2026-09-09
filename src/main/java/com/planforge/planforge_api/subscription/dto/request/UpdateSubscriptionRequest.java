package com.planforge.planforge_api.subscription.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UpdateSubscriptionRequest(

        String serviceName,

        BigDecimal monthlyCost,

        LocalDate billingDate

) {
}
