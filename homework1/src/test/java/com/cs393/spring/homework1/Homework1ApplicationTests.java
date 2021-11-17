package com.cs393.spring.homework1;

import com.cs393.spring.homework1.model.*;
import com.cs393.spring.homework1.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Homework1ApplicationTests {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShopRepository shopRepository;

    @Test
    void test() {
        Address address1 = new Address();
        address1.setCity("Istanbul");
        address1.setText("Kadikoy");

        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        Customer customer2 = new Customer();
        customer2.setFirstName("Marry");
        customer2.setLastName("Jane");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        Order order1 = new Order();
        order1.setAmount(2.0);
        order1.setDate(new Date());
        Order order2 = new Order();
        order2.setAmount(3.0);
        order2.setDate(new Date());
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        Product product1 = new Product();
        product1.setName("Coffee");
        product1.setPrice(23.0);
        Product product2 = new Product();
        product2.setName("Scarf");
        product2.setPrice(35.2);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Shop shop1 = new Shop();
        shop1.setName("Tchibo");
        shop1.setAddress("Kadikoy");

        customer1.setAddress(address1);
        customer1.setOrders(orders);
        customer1.setShop(shop1);

        order1.setCustomer(customer1);
        order1.setProducts(products);

        product1.setOrders(orders);
        product1.setShop(shop1);

        shop1.setProducts(products);
        shop1.setCustomers(customers);

        customer2.setAddress(address1);
        customer2.setOrders(orders);
        customer2.setShop(shop1);

        order2.setCustomer(customer2);
        order2.setProducts(products);

        product2.setOrders(orders);
        product2.setShop(shop1);

        addressRepository.save(address1);
        shopRepository.save(shop1);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        orderRepository.save(order1);
        orderRepository.save(order2);
        productRepository.save(product1);
        productRepository.save(product2);


    }

}
