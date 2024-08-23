package com.example.clothingmanagementsystem.service.impl;

import com.example.clothingmanagementsystem.entity.Category;
import com.example.clothingmanagementsystem.pojo.CategoryPojo;
import com.example.clothingmanagementsystem.repository.CategoryRepository;
import com.example.clothingmanagementsystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;


    @Override
    public void saveCategoryData(CategoryPojo categoryPojo) {
        Category category= new Category();
        category.setId(categoryPojo.getId());
        category.setName(categoryPojo.getName());
        category.setDescription(categoryPojo.getDescription());


        categoryRepository.save(category);

    }

    @Override
    public List<Category> getCategoryData() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getbyIdCategory(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void Deletedatacategory(Integer id) {
         categoryRepository.deleteById(id);
    }
}
