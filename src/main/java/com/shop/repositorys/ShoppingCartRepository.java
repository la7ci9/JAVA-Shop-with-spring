package com.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.shoppingcart.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}
