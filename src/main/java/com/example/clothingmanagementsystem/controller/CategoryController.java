package com.example.clothingmanagementsystem.controller;

import com.example.clothingmanagementsystem.entity.Category;
import com.example.clothingmanagementsystem.pojo.CategoryPojo;
import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/save")
    public GlobalApiResponse<String> saveCategory(@RequestBody CategoryPojo categoryPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is saved successfully");
        globalApiResponse.setData("Saved");
        categoryService.saveCategoryData(categoryPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<Category>> getcategoryProduct(){
        GlobalApiResponse<List<Category>> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is retrieved successfully");
        globalApiResponse.setData(categoryService.getCategoryData());

        return globalApiResponse;
    }


    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<Category>> getbyidcategory(@PathVariable Integer id){
        GlobalApiResponse<Optional<Category>> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully Retrived the data by id");
        globalApiResponse.setData(categoryService.getbyIdCategory(id));
        return globalApiResponse;



    }


    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully deleted");
        globalApiResponse.setData(id);
        categoryService.Deletedatacategory(id);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public GlobalApiResponse<String> updateCategory(@RequestBody CategoryPojo categoryPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is saved successfully");
        globalApiResponse.setData("Saved");
        categoryService.saveCategoryData(categoryPojo);
        return globalApiResponse;
    }








}
