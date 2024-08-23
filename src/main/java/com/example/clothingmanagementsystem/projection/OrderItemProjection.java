package com.example.clothingmanagementsystem.projection;

import java.time.LocalDateTime;

public interface OrderItemProjection {

     Integer getID();
     LocalDateTime getOrderdate();
     String getStatus();
     Double getTotal();
     Integer getSignup_id();
     Integer getProduct_id();
}
