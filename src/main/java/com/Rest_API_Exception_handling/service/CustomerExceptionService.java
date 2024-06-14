package com.Rest_API_Exception_handling.service;

import com.Rest_API_Exception_handling.customerNotFound.CustomerNotFound;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CustomerExceptionService {
    public String getCustomerById(@PathVariable Integer customerId) throws RuntimeException, CustomerNotFound {
        if(customerId>100){
            return "vidhya";
        }else{
            throw new CustomerNotFound("Invalid Customer Id ");
        }
    }
}
