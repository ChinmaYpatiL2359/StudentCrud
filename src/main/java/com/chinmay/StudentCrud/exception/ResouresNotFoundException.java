package com.chinmay.StudentCrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouresNotFoundException extends Exception{

    public ResouresNotFoundException(String msg){
        super(msg);
    }
}
