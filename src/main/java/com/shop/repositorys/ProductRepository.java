package com.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
