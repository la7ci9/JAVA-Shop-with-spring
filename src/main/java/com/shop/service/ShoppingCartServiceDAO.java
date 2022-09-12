package com.shop.service;

import com.shop.customer.Customer;
import com.shop.entity.Product;

public interface ShoppingCartServiceDAO {
	
	void addProduct(Product productId, Integer quantity, Customer customer); 
	
	void removeProduct(Product productId, Customer customer);
	
	void updateQuantity(Product productId, Integer quantity, Customer customer);

}
