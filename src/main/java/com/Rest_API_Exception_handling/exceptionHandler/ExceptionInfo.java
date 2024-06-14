package com.Rest_API_Exception_handling.exceptionHandler;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ExceptionInfo {

    private String code;
    private String msg;
    private LocalDate time;
}
