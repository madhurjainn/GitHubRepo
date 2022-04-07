package com.zensar.order.processing.service;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessException;

public interface OrderService {
	
	boolean placeOrder(Order order)throws BusinessException;
	
	boolean cancelOrder(int OrderId)throws BusinessException;
	
	boolean deleteOrder(int orderId)throws BusinessException;

}
