package com.niit.backend.DAO;

import com.niit.backend.entity.Order;

public interface OrderDAO {

	OrderDAO get(int orderId);
	boolean addOrder(Order order);
}
