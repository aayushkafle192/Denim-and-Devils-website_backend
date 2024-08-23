package com.example.clothingmanagementsystem.repository;

import com.example.clothingmanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
