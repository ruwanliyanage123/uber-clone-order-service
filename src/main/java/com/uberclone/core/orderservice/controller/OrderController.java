package com.uberclone.core.orderservice.controller;

import com.uberclone.core.orderservice.dto.OrderDTO;
import com.uberclone.core.orderservice.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order-service")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        final OrderDTO dto = orderService.addFood(orderDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<OrderDTO>> getAllOrders() {
        final List<OrderDTO> foodDTOS = orderService.getAllFood();
        return new ResponseEntity<>(foodDTOS, HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable("orderId") String orderId) {
        final OrderDTO orderDTO = orderService.getFoodById(Long.parseLong(orderId));
        return new ResponseEntity<>(orderDTO, HttpStatus.OK);
    }
}
