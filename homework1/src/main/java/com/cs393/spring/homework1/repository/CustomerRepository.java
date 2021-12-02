package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Modifying
    @Query("update Customer c set c.shop=null where c.shop.id=?1")
    public void unassignCustomer(Integer shopId);
}
