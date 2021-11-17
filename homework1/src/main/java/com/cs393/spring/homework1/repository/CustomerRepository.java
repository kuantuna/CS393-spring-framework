package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
