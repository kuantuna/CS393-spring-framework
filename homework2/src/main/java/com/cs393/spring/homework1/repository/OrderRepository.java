package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
