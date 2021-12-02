package com.cs393.spring.homework1.controller;

import com.cs393.spring.homework1.model.Product;
import com.cs393.spring.homework1.model.Shop;
import com.cs393.spring.homework1.projections.ProductProjection;
import com.cs393.spring.homework1.projections.ShopIdProjection;
import com.cs393.spring.homework1.projections.ShopProjection;
import com.cs393.spring.homework1.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping
    public List<ShopProjection> getAll()
    {
        return shopService.getAll();
    }

    @PostMapping
    public List<ShopIdProjection> saveShop(@RequestBody Shop shop){
        return shopService.save(shop);
    }

    @GetMapping("/{shop-id}/products/{product-id}")
    public Shop getByProductPrice(@PathVariable("shop-id") Integer shopId, @PathVariable("product-id") Double productId) {
        List<Product> products = new ArrayList<>();
        ShopIdProjection shopIdProjection = shopService.getById(shopId).get(0);
        Integer fetchedShopId = shopIdProjection.getId();
        String fetchedName = shopIdProjection.getName();
        String fetchedAddress = shopIdProjection.getAddress();
        for(ProductProjection productProjection: shopService.getShopByProductsPrice(shopService.getById(shopId).get(0).getId(), productId))
        {
            products.add(new Product(productProjection.getId(), productProjection.getName(), productProjection.getPrice()));
        }
        Shop shop = new Shop(fetchedShopId, fetchedName, fetchedAddress, products);
        return shop;
    }

    @Transactional
    @DeleteMapping("/{shop-id}")
    public void deleteById(@PathVariable("shop-id") int id)
    {
        shopService.deleteById(id);
    }
}
