package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
}
