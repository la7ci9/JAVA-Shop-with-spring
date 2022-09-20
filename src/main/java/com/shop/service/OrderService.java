package com.shop.service;

import java.util.List;
import java.util.Optional;

import com.shop.entity.Product;
import com.shop.order.Order;
import com.shop.repositorys.OrderRepository;
import com.shop.repositorys.ProductRepository;
import com.shop.serviceDAO.OrderServiceDAO;
import com.shop.shoppingcart.CartItem;

public class OrderService implements OrderServiceDAO {
	
	private OrderRepository orderRepository;
	private ProductRepository productRepository;
	
	public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
		this.orderRepository = orderRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Order getOrderDetail(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getCartAmount(List<CartItem> shoppingCartList) {
		for(CartItem cart : shoppingCartList) {
			Long productId = cart.getId();
			Optional<Product> product = productRepository.findById(productId) ;
			
		}
		return 0;
	}

	@Override
	public Order SaveOrder(Order order) {
		return orderRepository.save(order);
	}

}
