package com.example.clothingmanagementsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPojo {
    private Integer id;

    private String name;

    private String description;

    private Integer price;


    private Integer Stock;

}
