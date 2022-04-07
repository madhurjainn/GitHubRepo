package com.zensar.order.processing.repository;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;

public interface OrderRepository {
	
	public abstract int create(Order order) throws SQLException;
	
	Order read(int OrderId)throws SQLException;// Methods are bhy default public and abstract in an Interface.
	
	int update(Order order)throws SQLException;
	
	int delete(int OrderId)throws SQLException;

}
