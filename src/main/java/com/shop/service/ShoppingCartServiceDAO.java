package com.shop.service;

import java.util.List;

import com.shop.shoppingcart.ShoppingCart;

public interface ShoppingCartServiceDAO {

	List<ShoppingCart> getAllshoppingCart();
	
	ShoppingCart saveShoppingCart();
	
	ShoppingCart modifyShoppingCart(); //do i need it? 
	
	void deleteShoppingCart();
}
