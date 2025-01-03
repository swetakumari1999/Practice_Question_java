package com.Spring_.demo.spring_employee_crud_operation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{
    public BadRequestException(){
        super();
    }
    public BadRequestException(String message, Throwable cause){
        super(message,cause);
    }
    public BadRequestException(String message){
        super(message);
    }
}
