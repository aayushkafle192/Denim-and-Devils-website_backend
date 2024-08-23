package com.example.clothingmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table
@Entity

public class Signup {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "signup_primarykey")
    @SequenceGenerator(name = "signup_primarykey", sequenceName = "signupName", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "email")
    private String email;


    @Column(name = "password")
    private String password;




}
