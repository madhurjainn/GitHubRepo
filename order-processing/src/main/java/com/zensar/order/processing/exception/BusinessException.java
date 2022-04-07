package com.zensar.order.processing.exception;

import java.sql.SQLException;

public class BusinessException extends Exception {

	public BusinessException(SQLException e) {
		super(e);
	}

}
