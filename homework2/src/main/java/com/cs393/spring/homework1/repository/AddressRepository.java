package com.cs393.spring.homework1.repository;

import com.cs393.spring.homework1.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
