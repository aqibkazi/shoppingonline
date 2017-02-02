package com.niit.backend.DAO;

public interface OrderDAO {

	OrderDAO get(int orderId);
	boolean addOrder(OrderDAO order);
}
