package com.shop.service;

import java.util.List;

import com.shop.order.Order;
import com.shop.serviceDAO.OrderServiceDAO;
import com.shop.shoppingcart.CartItem;

public class OrderService implements OrderServiceDAO {

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
