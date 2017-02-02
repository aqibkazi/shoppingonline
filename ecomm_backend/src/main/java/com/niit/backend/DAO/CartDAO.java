package com.niit.backend.DAO;

import com.niit.ecom.entity.Cart;

public interface CartDAO {

	CartDAO get(int userId);
	void updateCartAgain(CartDAO cart);
	boolean updateCart(CartDAO cart);
}

