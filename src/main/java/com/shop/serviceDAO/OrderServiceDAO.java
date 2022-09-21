package com.shop.serviceDAO;

import java.util.List;

import com.shop.order.Order;
import com.shop.shoppingcart.CartItem;

public interface OrderServiceDAO {

	Order getOrderDetail(Long orderId);
	
	double getCartAmount(List<CartItem> shoppingCartList);
	
	Order SaveOrder(Order order);
}
