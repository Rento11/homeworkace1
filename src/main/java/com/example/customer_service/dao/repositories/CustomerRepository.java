package com.example.customer_service.dao.repositories;

import com.example.customer_service.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
