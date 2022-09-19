package com.shop.order;

import java.util.List;

import com.shop.customer.Customer;
import com.shop.shoppingcart.CartItem;

public class Order {

	private Long id;
	private Customer customer;
	private String orderDescriptiion;
	List<CartItem> orderCartItems;
	
	public Order() {
		//empty consturctor
	}

	public Order(Customer customer, String orderDescriptiion,
			List<CartItem> orderCartItems) {
		this.customer = customer;
		this.orderDescriptiion = orderDescriptiion;
		this.orderCartItems = orderCartItems;
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

	public String getOrderDescriptiion() {
		return orderDescriptiion;
	}

	public void setOrderDescriptiion(String orderDescriptiion) {
		this.orderDescriptiion = orderDescriptiion;
	}

	public List<CartItem> getOrderCartItems() {
		return orderCartItems;
	}

	public void setOrderCartItems(List<CartItem> orderCartItems) {
		this.orderCartItems = orderCartItems;
	}
}
