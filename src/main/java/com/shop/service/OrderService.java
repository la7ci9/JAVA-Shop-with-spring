package com.shop.service;

import java.util.List;

import com.shop.order.Order;
import com.shop.repositorys.OrderRepository;
import com.shop.repositorys.ProductRepository;
import com.shop.serviceDAO.OrderServiceDAO;
import com.shop.shoppingcart.CartItem;

public class OrderService implements OrderServiceDAO {
	
	OrderRepository orderRepository;
	ProductRepository proudctRepository;
	
	public OrderService(OrderRepository orderRepository, ProductRepository proudctRepository) {
		this.orderRepository = orderRepository;
		this.proudctRepository = proudctRepository;
	}

	@Override
	public Order getOrderDetail(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getCartAmount(List<CartItem> shoppingCartList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order SaveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
