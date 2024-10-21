package com.example.customer_service.web;


import com.example.customer_service.dao.entities.Customer;
import com.example.customer_service.dao.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerRestController {
    public CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer>customerList(){
        return customerRepository.findAll();
    }
    @GetMapping("/customers/{id}")
    public Customer customerById(@PathVariable(name = "id")Long id){
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer Not Found"));
    }
    @PostMapping("/customers")
    public Customer saveCustomer(Customer customer){
        try{
            return customerRepository.save(customer);
        }catch(NullPointerException nullPointerException){
            return null;
        }
    }
}
