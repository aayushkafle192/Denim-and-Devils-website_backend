package com.example.clothingmanagementsystem.service;

import com.example.clothingmanagementsystem.entity.Signup;
import com.example.clothingmanagementsystem.pojo.SignupPojo;

import java.util.List;
import java.util.Optional;

public interface SignupService {
    void saveData(SignupPojo signupPojo);
    List<Signup> getData();
    Optional<Signup> getbyId(Integer id);
    void Deletedata( Integer id);
    Integer login(String email, String password); // New method for login


}
