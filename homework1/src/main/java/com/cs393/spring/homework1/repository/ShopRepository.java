package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Shop;
import com.cs393.spring.homework1.projections.ProductProjection;
import com.cs393.spring.homework1.projections.ShopIdProjection;
import com.cs393.spring.homework1.projections.ShopProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    @Query("select new Shop(s.id, s.name, s.address) from Shop s")
    public List<ShopProjection> findAllBy();

    @Query("select new Shop(s.id, s.name, s.address) from Shop s where s.id=?1")
    public List<ShopIdProjection> getById_(Integer id);

    @Query("select new Product(p.id, p.name, p.price) from Product p where p.shopId=?1 and p.price > ?2")
    public List<ProductProjection> getShopByProductsPrice(Integer id, Double price);
}
