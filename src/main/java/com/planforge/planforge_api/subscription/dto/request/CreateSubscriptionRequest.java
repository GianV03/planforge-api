package com.planforge.planforge_api.subscription.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateSubscriptionRequest (

        @NotBlank
        String serviceName,

        @Positive
        BigDecimal monthCost,

        @NotNull
        LocalDate billingDate

){}
