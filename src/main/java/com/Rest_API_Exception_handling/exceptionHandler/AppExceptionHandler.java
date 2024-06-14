package com.Rest_API_Exception_handling.exceptionHandler;

import com.Rest_API_Exception_handling.customerNotFound.CustomerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice

public class AppExceptionHandler {

    @ExceptionHandler(value = CustomerNotFound.class)
    public ResponseEntity<ExceptionInfo> handleCnf(CustomerNotFound cnf){
        ExceptionInfo info = new ExceptionInfo();
        info.setCode("Ex001");
        info.setMsg(cnf.getMessage());
        info.setTime(LocalDate.now());
        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);

    }

}
