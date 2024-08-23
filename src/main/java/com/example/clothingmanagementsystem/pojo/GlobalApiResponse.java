package com.example.clothingmanagementsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class GlobalApiResponse<T> {
    private Integer status;
    private String message;
    private T data;


}
