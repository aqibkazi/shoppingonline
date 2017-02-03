package com.niit.backend.DAO;

import java.util.List;

public interface OrderItemDAO {

	List<OrderDAO> list(int id);

	boolean addOrderItem(OrderDAO orderItem);

	boolean deleteOrderItem(OrderDAO orderItem);

	OrderDAO get(int id);
	
}
	

