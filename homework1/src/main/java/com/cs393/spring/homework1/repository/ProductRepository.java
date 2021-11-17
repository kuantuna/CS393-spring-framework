package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
