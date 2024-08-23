package com.example.clothingmanagementsystem.repository;

import com.example.clothingmanagementsystem.entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface SignupRepository extends JpaRepository<Signup,Integer> {
    @Query(nativeQuery = true,value = "select * from signup where email=?2 and password=?1")
    Integer getUserIdFrompasswordAndemail(String password,String email);


}
