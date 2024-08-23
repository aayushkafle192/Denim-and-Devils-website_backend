package com.example.clothingmanagementsystem.controller;

import com.example.clothingmanagementsystem.entity.Product;
import com.example.clothingmanagementsystem.entity.Signup;
import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.pojo.ProductPojo;
import com.example.clothingmanagementsystem.pojo.SignupPojo;
import com.example.clothingmanagementsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor

public class ProductController {
    private final ProductService productService;


    @PostMapping("/save")
    public GlobalApiResponse<String> saveProduct(@RequestBody ProductPojo productPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is saved successfully");
        globalApiResponse.setData("Saved");
        productService.saveProductData(productPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<Product>> getdataProduct(){
        GlobalApiResponse<List<Product>> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is retrieved successfully");
        globalApiResponse.setData(productService.getProductData());

        return globalApiResponse;
    }


    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<Product>> getbyidproduct(@PathVariable Integer id){
        GlobalApiResponse<Optional<Product>> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully Retrived the data by id");
        globalApiResponse.setData(productService.getbyIdProduct(id));
        return globalApiResponse;



    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully deleted");
        globalApiResponse.setData(id);
        productService.Deletedataproduct(id);
        return globalApiResponse;
    }
    @PutMapping("/update")
    public GlobalApiResponse<String> updateProduct(@PathVariable Integer id,@RequestBody ProductPojo productPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is updated successfully");
        globalApiResponse.setData("Saved");
        productService.saveProductData(productPojo);
        return globalApiResponse;
    }


}
