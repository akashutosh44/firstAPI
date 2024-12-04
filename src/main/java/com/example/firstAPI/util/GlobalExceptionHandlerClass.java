package com.example.firstAPI.util;

import com.example.firstAPI.Entity.ErrorClass;
import com.example.firstAPI.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorClass> handleResourceNotFoundException(ResourceNotFoundException ex){
        ErrorClass errorClass= new ErrorClass(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        return new ResponseEntity<>(errorClass, HttpStatus.BAD_REQUEST);
    }
}
