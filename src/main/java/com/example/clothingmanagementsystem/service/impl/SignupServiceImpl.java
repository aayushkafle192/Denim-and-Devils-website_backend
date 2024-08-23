package com.example.clothingmanagementsystem.service.impl;

import com.example.clothingmanagementsystem.entity.Signup;
import com.example.clothingmanagementsystem.pojo.SignupPojo;
import com.example.clothingmanagementsystem.repository.SignupRepository;
import com.example.clothingmanagementsystem.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class SignupServiceImpl implements SignupService {
    private final SignupRepository signupRepository;


    @Override
    public void saveData(SignupPojo signupPojo) {
        Signup signup= new Signup();
        signup.setId(signupPojo.getId());
        signup.setFullname(signupPojo.getFullname());
        signup.setPassword(signupPojo.getPassword());
        signup.setEmail(signupPojo.getEmail());
        signupRepository.save(signup);


    }

    @Override
    public List<Signup> getData() {
        return signupRepository.findAll();

    }

    @Override
    public Optional<Signup> getbyId(Integer id) {
        return signupRepository.findById(id);
    }

    @Override
    public void Deletedata(Integer id) {
        signupRepository.deleteById(id);
    }

    @Override
    public  Integer login(String email, String password) {
        return signupRepository.getUserIdFrompasswordAndemail(password,email);
    }

}
