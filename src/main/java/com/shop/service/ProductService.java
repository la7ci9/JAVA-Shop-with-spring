package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.entity.Product;
import com.shop.repositorys.ProductRepository;

public class ProductService implements ProductServiceDAO{
	
	@Autowired
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product modifyProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).get();
	}

}
