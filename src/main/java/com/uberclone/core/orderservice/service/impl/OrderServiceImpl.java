package com.uberclone.core.orderservice.service.impl;

import com.uberclone.core.orderservice.dao.OrderRepository;
import com.uberclone.core.orderservice.dto.OrderDTO;
import com.uberclone.core.orderservice.entity.FoodEntity;
import com.uberclone.core.orderservice.mapper.OrderMapper;
import com.uberclone.core.orderservice.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository foodRepository;

    @Override
    public OrderDTO addFood(OrderDTO userDTO) {
        final FoodEntity requestEntity = OrderMapper.mapToEntity(userDTO);
        final FoodEntity responseEntity = foodRepository.save(requestEntity);
        return OrderMapper.mapToDto(responseEntity);
    }

    @Override
    public List<OrderDTO> getAllFood() {
        final List<FoodEntity> foodEntities = foodRepository.findAll();
        return foodEntities.stream().map(OrderMapper::mapToDto).toList();
    }

    @Override
    public OrderDTO getFoodById(long itemId) {
        final Optional<FoodEntity> foodEntity = foodRepository.findById(itemId);
        return OrderMapper.mapToDto(foodEntity.get());
    }
}
