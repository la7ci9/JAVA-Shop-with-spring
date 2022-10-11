package com.shop.order;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.shop.customer.Customer;
import com.shop.shoppingcart.CartItem;

@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Customer customer;
	private String orderDescription;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<CartItem> orderCartItems;
	
	public Order() {
		//empty consturctor
	}

	public Order(Customer customer, String orderDescription,
			List<CartItem> orderCartItems) {
		this.customer = customer;
		this.orderDescription = orderDescription;
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

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescriptiion(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public List<CartItem> getOrderCartItems() {
		return orderCartItems;
	}

	public void setOrderCartItems(List<CartItem> orderCartItems) {
		this.orderCartItems = orderCartItems;
	}
}
