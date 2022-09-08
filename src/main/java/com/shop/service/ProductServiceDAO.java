package com.shop.service;

import java.util.List;

import com.shop.entity.Product;

public interface ProductServiceDAO {
	
	List<Product> getAllProduct();
	
	Product saveProduct(Product product);
	
	Product modifyProduct(Product product);
	
	void deleteProduct(Long id);	

}
