package com.uberclone.core.orderservice.service.api;

import com.uberclone.core.orderservice.dto.OrderDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderService {

    /**
     * To create FoodDTO
     *
     * @param foodDTO user dto
     */
    public abstract OrderDTO addFood(OrderDTO foodDTO);

    /**
     * To get all food
     *
     * @return all food
     */
    public abstract List<OrderDTO> getAllFood();

    /**
     * To get food by Id
     *
     * @param itemId get food by id
     * @return food by id
     */
    public abstract OrderDTO getFoodById(long itemId);
}
