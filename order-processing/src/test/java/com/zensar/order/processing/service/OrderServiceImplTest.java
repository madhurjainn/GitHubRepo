package com.zensar.order.processing.service;


import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BusinessException;
import com.zensar.order.processing.repository.OrderRepository;

public class OrderServiceImplTest {
	private OrderServiceImpl impl;
	@Mock
	private OrderRepository orderRepository; // We have to mock OrderRepository(Declaring class we have to mock).

	@Before
	public void setUp() {
		impl = new OrderServiceImpl(); // creating object of class whose method we want to test
		MockitoAnnotations.initMocks(this); // mocking orderRepository
		impl.setOrderRepository(orderRepository);

	}

	@Test
	public void  place_should_create_an_order() throws SQLException, BusinessException {

		Order order = new Order();
		Mockito.when(orderRepository.create(order)).thenReturn(1);// Expectation

		boolean placeOrder = impl.placeOrder(order);

		assertTrue(placeOrder);
		// assertFalse(placeOrder);
	//	System.out.println(verify(orderRepository).create(order));

	}

	@Test
	public void placeOrder_should_not_create_an_order() throws SQLException, BusinessException {

		Order order = new Order();
		Mockito.when(orderRepository.create(order)).thenReturn(0);

		boolean placeOrder = impl.placeOrder(order);

		// assertTrue(placeOrder);
		assertFalse(placeOrder);

	}
	@Test(expected=BusinessException.class)
	public void place_order_should_throw_business_exception() throws SQLException, BusinessException{
		Order order=new Order();
		Mockito.when(orderRepository.create(Mockito.any(Order.class))).thenThrow(SQLException.class);
		boolean placeOrder=impl.placeOrder(order);
	}

}
