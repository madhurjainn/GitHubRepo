package com.zensar.order.processing.service;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessException;
import com.zensar.order.processing.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	
	private OrderRepository orderRepository;
	

	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public boolean placeOrder(Order order) throws BusinessException {
		try {
			int result=orderRepository.create(order);//returns integer value
			if(result==0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BusinessException(e);
		}
		return true;
	}

	public boolean cancelOrder(int OrderId) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteOrder(int orderId) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

}
