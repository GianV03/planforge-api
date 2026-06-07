package com.planforge.planforge_api.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubscriptionRespository extends JpaRepository<SubscriptionRespository, UUID> {

}
