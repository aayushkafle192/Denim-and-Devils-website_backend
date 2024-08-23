package com.example.clothingmanagementsystem.service.impl;

import com.example.clothingmanagementsystem.entity.OrderItem;
import com.example.clothingmanagementsystem.entity.Product;
import com.example.clothingmanagementsystem.entity.Signup;
import com.example.clothingmanagementsystem.pojo.OrderItemPojo;
import com.example.clothingmanagementsystem.projection.OrderItemProjection;
import com.example.clothingmanagementsystem.repository.OrderItemRepository;
import com.example.clothingmanagementsystem.repository.ProductRepository;
import com.example.clothingmanagementsystem.repository.SignupRepository;
import com.example.clothingmanagementsystem.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
    private final SignupRepository signupRepository;
    private final ProductRepository productRepository;

    @Override
    public void saveOrder(OrderItemPojo orderItemPojo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(orderItemPojo.getId());
        orderItem.setOrderDate(orderItemPojo.getOrderDate());
        orderItem.setStatus(orderItemPojo.getStatus());
        orderItem.setTotal(orderItemPojo.getTotal());
        Signup signup= signupRepository.findById(orderItemPojo.getSignup_id()).orElse(null);
        Product product=productRepository.findById(orderItemPojo.getProduct_id()).orElse(null);
        orderItem.setSignup(signup);
        orderItem.setProduct(product);
        orderItemRepository.save(orderItem);









    }

    @Override
    public List<OrderItemProjection> getOrder() {
        return orderItemRepository.findAllorderinfo();
    }

    @Override
    public Optional<OrderItemProjection> getbyIdOrder(Integer id) {
        return orderItemRepository.findByidOrderitem(id);
    }

    @Override
    public void Deletedataorder(Integer id) {
        orderItemRepository.deleteById(id);
    }
}
