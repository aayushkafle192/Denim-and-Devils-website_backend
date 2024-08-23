package com.example.clothingmanagementsystem.service;

import com.example.clothingmanagementsystem.entity.OrderItem;
import com.example.clothingmanagementsystem.pojo.OrderItemPojo;
import com.example.clothingmanagementsystem.projection.OrderItemProjection;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {
    void saveOrder(OrderItemPojo orderItemPojo);
    List<OrderItemProjection>getOrder();
    Optional<OrderItemProjection>getbyIdOrder(Integer id);
    void Deletedataorder(Integer id);
}
