package com.uberclone.core.orderservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "food_data")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private long orderId;
    @Column(name = "itemNames")
    private String itemNames;
    @Column(name = "ownerName")
    private String ownerName;
    @Column(name = "price")
    private double price;
    @Column(name = "itemCount")
    private int itemCount;
    @Column(name = "address")
    private String address;
}
