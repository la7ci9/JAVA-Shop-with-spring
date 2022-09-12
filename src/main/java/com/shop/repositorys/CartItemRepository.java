package com.shop.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.customer.Customer;
import com.shop.entity.Product;
import com.shop.shoppingcart.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	public List<CartItem> findByCustomer(Customer customer);
	
	public void deleteByCustomerIdAndProductId(Customer customerId, Product productId);
	
	public void updateQuantity(Integer quantity, Customer customerId, Product productId);
}
