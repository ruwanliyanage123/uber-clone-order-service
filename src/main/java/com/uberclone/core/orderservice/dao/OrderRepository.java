package com.uberclone.core.orderservice.dao;

import com.uberclone.core.orderservice.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<FoodEntity, Long> {
}
