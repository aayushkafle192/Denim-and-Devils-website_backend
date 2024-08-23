package com.example.clothingmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "order_item")
public class OrderItem {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_primarykey")
    @SequenceGenerator(name = "order_primarykey", sequenceName = "orderName", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="orderDate")
    private LocalDateTime orderDate;

    @Column(name="status")
    private String status;

    @Column(name = "total")
    private Double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "signup_id",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_order_Signup_id"))
    private Signup signup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_order_product_id"))
    private Product product;


}
