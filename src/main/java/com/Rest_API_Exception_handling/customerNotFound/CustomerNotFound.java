package com.Rest_API_Exception_handling.customerNotFound;

import lombok.Data;

@Data
public class CustomerNotFound extends Throwable {
    public CustomerNotFound() {
    }
    public CustomerNotFound(String msg){
        super(msg);
    }
}
