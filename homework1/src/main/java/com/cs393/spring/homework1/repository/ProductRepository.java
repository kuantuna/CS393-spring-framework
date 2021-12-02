package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Modifying
    @Query("update Product p set p.shop=null where p.shop.id=?1")
    public void unassignProduct(Integer shopId);
}
