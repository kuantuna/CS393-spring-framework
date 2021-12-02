package com.cs393.spring.homework1.service;

import com.cs393.spring.homework1.model.Shop;
import com.cs393.spring.homework1.projections.ProductProjection;
import com.cs393.spring.homework1.projections.ShopIdProjection;
import com.cs393.spring.homework1.projections.ShopProjection;
import com.cs393.spring.homework1.repository.CustomerRepository;
import com.cs393.spring.homework1.repository.ProductRepository;
import com.cs393.spring.homework1.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    @Qualifier("shopRepository")
    ShopRepository shopRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public List<ShopProjection> getAll() {
        return shopRepository.findAllBy();
    }

    @Override
    public List<ProductProjection> getShopByProductsPrice(Integer id, Double price) {
        return shopRepository.getShopByProductsPrice(id, price);
    }

    @Override
    public List<ShopIdProjection> getById(Integer id) {
        return shopRepository.getById_(id);
    }

    @Override
    public void deleteById(int id) {

    }
}
