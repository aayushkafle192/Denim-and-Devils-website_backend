package com.example.clothingmanagementsystem.service.impl;

import com.example.clothingmanagementsystem.entity.Product;
import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.pojo.ProductPojo;
import com.example.clothingmanagementsystem.repository.ProductRepository;
import com.example.clothingmanagementsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public void saveProductData(ProductPojo productPojo) {
        Product product=new Product();
        product.setId(productPojo.getId());
        product.setName(productPojo.getName());
        product.setPrice(productPojo.getPrice());
        product.setDescription(productPojo.getDescription());
        product.setStock(productPojo.getStock());

        productRepository.save(product);

    }

    @Override
    public List<Product> getProductData() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getbyIdProduct(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void Deletedataproduct(Integer id) {
        productRepository.deleteById(id);

    }



}
