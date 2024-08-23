package com.example.clothingmanagementsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemPojo {
    private Integer id;
    private LocalDateTime orderDate;
    private String status;
    private Double total;
    private Integer signup_id;
    private Integer product_id;





}
