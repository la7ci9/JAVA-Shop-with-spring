package com.shop.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
