package com.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.shoppingcart.ShoppingCartItem;

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long> {

}
