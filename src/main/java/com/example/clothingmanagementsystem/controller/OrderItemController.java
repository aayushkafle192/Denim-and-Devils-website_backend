package com.example.clothingmanagementsystem.controller;
import com.example.clothingmanagementsystem.entity.OrderItem;
import com.example.clothingmanagementsystem.entity.Product;
import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.pojo.OrderItemPojo;
import com.example.clothingmanagementsystem.pojo.ProductPojo;
import com.example.clothingmanagementsystem.projection.OrderItemProjection;
import com.example.clothingmanagementsystem.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/order")
@RequiredArgsConstructor

public class OrderItemController {
    private final OrderItemService orderItemService;

    @PostMapping("/save")
    public GlobalApiResponse<String> saveOrder(@RequestBody OrderItemPojo orderItemPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is saved successfully");
        globalApiResponse.setData("Saved");
        orderItemService.saveOrder(orderItemPojo);
        return globalApiResponse;
    }

    @GetMapping("/get")
    public GlobalApiResponse<List<OrderItemProjection>> getorder(){
        GlobalApiResponse<List<OrderItemProjection>> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is retrieved successfully");
        globalApiResponse.setData(orderItemService.getOrder());

        return globalApiResponse;
    }


    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<OrderItemProjection>> getbyidorder(@PathVariable Integer id){
        GlobalApiResponse<Optional<OrderItemProjection>> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully Retrived the data by id");
        globalApiResponse.setData(orderItemService.getbyIdOrder(id));
        return globalApiResponse;



    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully deleted");
        globalApiResponse.setData(id);
        orderItemService.Deletedataorder(id);
        return globalApiResponse;
    }

    @PutMapping("/update")
    public GlobalApiResponse<String> updateorder(@RequestBody OrderItemPojo orderItemPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is updated successfully");
        globalApiResponse.setData("Saved");
        orderItemService.saveOrder(orderItemPojo);
        return globalApiResponse;
    }

}
