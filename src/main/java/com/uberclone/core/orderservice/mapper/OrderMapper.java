package com.uberclone.core.orderservice.mapper;

import com.uberclone.core.orderservice.dto.OrderDTO;
import com.uberclone.core.orderservice.entity.FoodEntity;

public class OrderMapper {
    public static OrderDTO mapToDto(FoodEntity foodEntity) {
        OrderDTO orderDTo = new OrderDTO();
        orderDTo.setOrderId(foodEntity.getOrderId());
        orderDTo.setPrice(foodEntity.getPrice());
        orderDTo.setItemNames(foodEntity.getItemNames());
        orderDTo.setItemCount(foodEntity.getItemCount());
        return orderDTo;
    }

    public static FoodEntity mapToEntity(OrderDTO orderDto) {
        FoodEntity orderEntity = new FoodEntity();
        orderEntity.setOrderId(orderDto.getOrderId());
        orderEntity.setPrice(orderDto.getPrice());
        orderEntity.setItemNames(orderDto.getItemNames());
        orderEntity.setItemCount(orderDto.getItemCount());
        return orderEntity;
    }
}
