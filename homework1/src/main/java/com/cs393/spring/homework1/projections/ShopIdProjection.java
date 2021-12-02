package com.cs393.spring.homework1.projections;

import com.cs393.spring.homework1.model.Product;

import java.util.List;

public interface ShopIdProjection {
    Integer getId();
    String getName();
    String getAddress();
}
