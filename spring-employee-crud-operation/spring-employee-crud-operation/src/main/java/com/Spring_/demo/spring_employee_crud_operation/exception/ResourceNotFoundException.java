package com.Spring_.demo.spring_employee_crud_operation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException
{
        public ResourceNotFoundException(){
            super();
        }
        public ResourceNotFoundException(String message, Throwable cause){
            super(message,cause);
        }
        public ResourceNotFoundException(String message){
            super(message);
        }
}
