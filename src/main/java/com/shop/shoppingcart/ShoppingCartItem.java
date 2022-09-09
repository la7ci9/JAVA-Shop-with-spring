package com.shop.shoppingcart;


import com.shop.customer.Customer;
import com.shop.entity.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private Customer customer;
	private Product customerCart;
	private Integer quantity;
	
	

	public ShoppingCartItem(Long id, 
			Customer customer, Product customerCart, Integer quantity) {
		this.id = id;
		this.customer = customer;
		this.customerCart = customerCart;
		this.quantity = quantity;
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
	
	public Product getCustomerCart() {
		return customerCart;
	}
	
	public void setCustomerCart(Product customerCart) {
		this.customerCart = customerCart;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
