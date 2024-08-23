package com.example.clothingmanagementsystem.exception;

import com.example.clothingmanagementsystem.pojo.GlobalApiResponse;
import com.example.clothingmanagementsystem.service.impl.SignupServiceImpl;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice

public class CustomExceptionHandler {
    private final SignupServiceImpl signupServiceImpl;

    public CustomExceptionHandler(SignupServiceImpl signupServiceImpl) {
        this.signupServiceImpl = signupServiceImpl;
    }

    @ExceptionHandler({Exception.class})
    public GlobalApiResponse<String> handleAll(final Exception ex, final WebRequest request) {
        GlobalApiResponse<String> response = new GlobalApiResponse<>();
        response.setMessage(ex.getMessage());
        response.setStatus(400);
        response.setData("Sorry!! ,the request have failed");
        return response;
    }

}