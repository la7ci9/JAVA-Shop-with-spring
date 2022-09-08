package com.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
