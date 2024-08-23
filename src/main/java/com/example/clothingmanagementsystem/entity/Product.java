package com.example.clothingmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table
@Entity

public class Product {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_primarykey")
    @SequenceGenerator(name = "product_primarykey", sequenceName = "productName", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;


    @Column(name="description")
    private String description;

    @Column(name="stock")
    private Integer stock;





}
