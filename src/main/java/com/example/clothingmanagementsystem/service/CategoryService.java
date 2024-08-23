package com.example.clothingmanagementsystem.service;

import com.example.clothingmanagementsystem.entity.Category;
import com.example.clothingmanagementsystem.pojo.CategoryPojo;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    void saveCategoryData(CategoryPojo categoryPojo);
    List<Category> getCategoryData();
    Optional<Category>getbyIdCategory(Integer id);
    void Deletedatacategory(Integer id);
}
