package com.example.clothingmanagementsystem.service;

import com.example.clothingmanagementsystem.entity.Product;
import com.example.clothingmanagementsystem.pojo.ProductPojo;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void saveProductData(ProductPojo productPojo);
    List<Product>getProductData();
    Optional<Product>getbyIdProduct( Integer id);
    void Deletedataproduct(Integer id);
}
