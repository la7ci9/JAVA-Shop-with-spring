package com.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/allProduct")
	List<Product> allProduct(){
		return productService.getAllProduct();
	}

}
