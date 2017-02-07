package com.niit.backend.DAOImpl;

import java.util.List;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.DAO.CartItemDAO;

public class CartItemDAOImpl implements CartItemDAO {

	@Override
	public List<CartDAO> list(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCartItem(CartItemDAO cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCartItem(CartItemDAO cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCartItem(CartItemDAO cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CartItemDAO get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItemDAO getByProductId(int productId, int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existingCartItem(int productId, int cartId) {
		// TODO Auto-generated method stub
		return false;
	}

}
