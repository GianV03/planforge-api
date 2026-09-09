package com.planforge.planforge_api.subscription.repository;

import com.planforge.planforge_api.subscription.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscriptionRespository extends JpaRepository<Subscription, UUID> {

}
