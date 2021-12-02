package com.cs393.spring.homework1.service;

import com.cs393.spring.homework1.model.Shop;
import com.cs393.spring.homework1.projections.ProductProjection;
import com.cs393.spring.homework1.projections.ShopIdProjection;
import com.cs393.spring.homework1.projections.ShopProjection;

import java.util.List;

public interface ShopService {
    public Shop save(Shop shop);
    public List<ShopProjection> getAll();
    public List<ProductProjection> getShopByProductsPrice(Integer id, Double price);
    public List<ShopIdProjection> getById(Integer id);
    public void deleteById(int id);
}
