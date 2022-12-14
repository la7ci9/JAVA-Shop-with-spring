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
	private String Brand;
	private String nameOfProduct;
	private Double price;
	private String description; //amount in pack or something
	
	public Product(Long id, 
			String brand, 
			String nameOfProduct, 
			Double price,  
			String description) {
		this.id = id;
		this.Brand = brand;
		this.nameOfProduct = nameOfProduct;
		this.price = price;
		this.description = description;
	}
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		this.Brand = brand;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
