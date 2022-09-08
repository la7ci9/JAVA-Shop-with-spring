package com.shop.shoppingcart;

import java.util.List;

import com.shop.customer.Customer;
import com.shop.entity.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private Customer customer;
	private List<Product> customerCart;
	
	public ShoppingCart(Long id,Customer customer, List<Product> customerCart) {
		this.id = id;
		this.customer = customer;
		this.customerCart = customerCart;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getCustomerCart() {
		return customerCart;
	}
	public void setCustomerCart(List<Product> customerCart) {
		this.customerCart = customerCart;
	}
}
