package com.Rest_API_Exception_handling.RestController;

import com.Rest_API_Exception_handling.customerNotFound.CustomerNotFound;
import com.Rest_API_Exception_handling.service.CustomerExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    @Autowired
    private CustomerExceptionService customerExceptionService;

    @GetMapping("/customer/{customerId}")
    public String getCustomerName(@PathVariable Integer customerId) throws CustomerNotFound {
        return customerExceptionService.getCustomerById(customerId);
    }


}
