package com.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entity.Product;
import com.shop.order.Order;
import com.shop.repositorys.OrderRepository;
import com.shop.repositorys.ProductRepository;
import com.shop.serviceDAO.OrderServiceDAO;
import com.shop.shoppingcart.CartItem;

@Service
public class OrderService implements OrderServiceDAO {
	
	private OrderRepository orderRepository;
	private ProductRepository productRepository;
	
	public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
		this.orderRepository = orderRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Order getOrderDetail(Long orderId) {
		Optional<Order> order = orderRepository.findById(orderId);
		return order.isPresent()? order.get() : null;
	}

	@Override
	public double getCartAmount(List<CartItem> shoppingCartList) {
		double totalCartAmount= 0f;
		double singleCartAmount = 0f;
		
		for(CartItem cart : shoppingCartList) {
			Long productId = cart.getId();
			Optional<Product> product = productRepository.findById(productId) ;
			if(product.isPresent()) {
				Product existProdcut = product.get();
				singleCartAmount = existProdcut.getPrice() * cart.getQuantity();
				totalCartAmount += singleCartAmount;
			}
		}
		return totalCartAmount;
	}

	@Override
	public Order SaveOrder(Order order) {
		return orderRepository.save(order);
	}

}
