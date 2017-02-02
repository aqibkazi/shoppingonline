package com.niit.backend.DAO;

import java.util.List;

public interface CartItemDAO {
	
	List<CartDAO> list(int id);
	boolean addCartItem(CartItemDAO cartItem);
	boolean deleteCartItem(CartItemDAO cartItem);
	boolean updateCartItem(CartItemDAO cartItem);
	CartItemDAO get(int id);
	CartItemDAO getByProductId(int productId, int cartId);
	boolean existingCartItem(int productId, int cartId);
}

