package com.example.clothingmanagementsystem.controller;

import com.example.clothingmanagementsystem.entity.Signup;
import com.example.clothingmanagementsystem.pojo.AuthPojo;
import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.pojo.LoginRequest;
import com.example.clothingmanagementsystem.pojo.SignupPojo;
import com.example.clothingmanagementsystem.service.SignupService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class SignupController {
    private final SignupService signupService;

    @PostMapping("/save")
    public GlobalApiResponse<String> save(@RequestBody SignupPojo signupPojo){
        GlobalApiResponse<String> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is saved successfully");
        globalApiResponse.setData("Saved");
        signupService.saveData(signupPojo);
        return globalApiResponse;
    }


    @GetMapping("/get")
    public GlobalApiResponse<List<Signup>> getdata(){
        GlobalApiResponse<List<Signup>> globalApiResponse= new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("The data is retrieved successfully");
        globalApiResponse.setData(signupService.getData());

        return globalApiResponse;
    }


    @GetMapping("/get/{id}")
    public GlobalApiResponse<Optional<Signup>> getbyid(@PathVariable Integer id){
        GlobalApiResponse<Optional<Signup>> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully Retrived the data by id");
        globalApiResponse.setData(signupService.getbyId(id));
        return globalApiResponse;



    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> delete(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully deleted");
        globalApiResponse.setData(id);
        signupService.Deletedata(id);
        return globalApiResponse;
    }


    @PutMapping ("/update")
    public GlobalApiResponse<Integer> update(@RequestBody SignupPojo signupPojo){
        GlobalApiResponse<Integer> globalApiResponse=new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Sucessfully updated the data");
        globalApiResponse.setData(signupPojo.getId());
        signupService.saveData(signupPojo);
        return globalApiResponse;
    }


    @PostMapping("/login")
    public Integer Login(@RequestBody AuthPojo authPojo){
        String email= authPojo.getEmail();
        String password=authPojo.getPassword();
        return signupService.login(email,password);
    }




}
