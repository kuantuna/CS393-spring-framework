package com.cs393.spring.homework1.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_SHOP")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY) // Should I delete all customers when a shop is deleted?
    private List<Customer> customers;

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY) // Should I delete all products when a shop is deleted?
    private List<Product> products;

    public Shop() {
    }

    public Shop(Integer id) {
        this.id = id;
    }

    public Shop(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Shop(Integer id, String name, String address, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
