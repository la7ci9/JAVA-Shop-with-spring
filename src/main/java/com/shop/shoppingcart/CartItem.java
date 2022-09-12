package com.shop.shoppingcart;


import com.shop.customer.Customer;
import com.shop.entity.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartitem")
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private Customer customer;
	private Product product;
	private Integer quantity;

	public CartItem(Long id, 
			Customer customer, Product product, Integer quantity) {
		this.id = id;
		this.customer = customer;
		this.product = product;
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
		return product;
	}
	
	public void setCustomerCart(Product customerCart) {
		this.product = customerCart;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
