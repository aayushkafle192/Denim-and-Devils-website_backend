package com.example.clothingmanagementsystem.repository;

import com.example.clothingmanagementsystem.entity.OrderItem;
import com.example.clothingmanagementsystem.projection.OrderItemProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

    @Query(nativeQuery = true, value = "SELECT id as ID, order_date as Orderdate, status as Status, total as Total, signup_id as Signup_id,product_id as Product_id FROM order_item")
    List<OrderItemProjection> findAllorderinfo();



    @Query(nativeQuery = true, value = "SELECT id as ID,order_date as Orderdate, status as Status, total as Total, signup_id as Signup_id,product_id as Product_id FROM order_item")
    Optional<OrderItemProjection> findByidOrderitem(Integer id);


}

