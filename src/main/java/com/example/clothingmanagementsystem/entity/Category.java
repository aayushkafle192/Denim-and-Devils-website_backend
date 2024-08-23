package com.example.clothingmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Setter
@Getter

public class Category {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_primarykey")
    @SequenceGenerator(name = "category_primarykey", sequenceName = "productName", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;





}
