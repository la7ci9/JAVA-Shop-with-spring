package com.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.customer.Customer;
import com.shop.entity.Product;
import com.shop.service.CustomerService;
import com.shop.service.OrderService;
import com.shop.service.ProductService;

@RestController
public class ShoppingCartRESTController {
	
	private ProductService productService;
	private CustomerService customerService;
	private OrderService orderService;
	
	public ShoppingCartRESTController(ProductService productService, CustomerService customerService,
			OrderService orderService) {
		this.productService = productService;
		this.customerService = customerService;
		this.orderService = orderService;
	}
	//reguest for products
	@GetMapping("/allProduct")
	List<Product> allProduct(){
		return productService.getAllProduct();
	}

	@PostMapping("/saveProduct")
	Product newProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	//request for customers
	@GetMapping("/saveCustomer")
	Customer newCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
}
