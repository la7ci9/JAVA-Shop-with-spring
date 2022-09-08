package com.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameOfProduct;
	private Double price;
	private ProductGroup group;
	private String description; //amount in pack or something
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public ProductGroup getGroup() {
		return group;
	}
	public void setGroup(ProductGroup group) {
		this.group = group;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
