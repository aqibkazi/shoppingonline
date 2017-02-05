package com.niit.testcases;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.DAO.CartItemDAO;
import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.DAO.UserDAO;
import com.niit.backend.entity.Cart;
import com.niit.backend.entity.CartItem;
import com.niit.backend.entity.Product;
import com.niit.backend.entity.User;

import junit.framework.Assert;

public class CartDAOTestCases {
	
	@Autowired
	AnnotationConfigApplicationContext context;

	@Autowired
	Cart cart;

	@Autowired
	CartDAO cartDAO;

	@Autowired
	CartItemDAO cartItemDAO;

	@Autowired
	CartItem cartItem;

	@Autowired
	User user;

	@Autowired
	UserDAO userDAO;

	@Autowired
	Product product;

	@Autowired
	ProductDAO productDAO;

	public CartDAOTestCases() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecomm");
		context.refresh();
		cartItemDAO = (CartItemDAO) context.getBean("cartItemDAO");
		cart = (Cart) context.getBean("cart");
		cartItem = (CartItem) context.getBean("cartItem");
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");
		product = (Product) context.getBean("product");
		productDAO = (ProductDAO) context.getBean("productDAO");
		cartDAO = (CartDAO) context.getBean("cartDAO");
	}

	/*
	 * @Test public void listCartItem(){
	 * 
	 * boolean flag = cartItemDAO.list(8).contains(197);
	 * System.out.println(cartItemDAO.list(8).contains(197));
	 * Assert.assertEquals(true, true); }
	 */

	/*
	 * @Test public void AddCartItem(){ user =
	 * userDAO.getByUserName("aqibkazi97@gmail.com"); product =
	 * productDAO.get(227); Set<CartItem> cartItems = new HashSet<>();
	 * cartItem.setProduct(product.getId()); cartItem.setQuantity(1);
	 * cartItem.setItemPrice(product.getPrice());
	 * cartItem.setTotalPrice(cartItem.getTotalPrice());
	 * cartItems.add(cartItem); cart.setCartItems(cartItems);
	 * cart.setNumberOfCartItems(cartItems.size()); cart.setUser(user);
	 * cart.setGrandTotal(cart.getGrandTotal()); cartItem.setCart(cart);
	 * cartItemDAO.addCartItem(cartItem); }
	 */

	/*
	 * @Test public void GetProduct(){ cartItemDAO.getByProductId(229, 8);
	 * Assert.assertEquals(cartItem, cartItem); }
	 */

	/*
	 * @Test public void updateCart(){ cart = cartDAO.get(44);
	 * cartDAO.updateCartAgain(cart); cartDAO.updateCart(cart);
	 * Assert.assertEquals(true, true); }
	 */

	/*@Test
	public void deleteCart() {
		user = userDAO.getUser(44);
		cart = cartDAO.get(user.getId());
		cartItem = cartItemDAO.get(4);
		product = productDAO.get(cartItem.getProduct());
		product.setQuantity(product.getQuantity() + cartItem.getQuantity());
		cartItemDAO.deleteCartItem(cartItem);
		productDAO.updateProduct(product);
		cartDAO.updateCartAgain(cart);
		cartDAO.updateCart(cart);
		Assert.assertEquals(true, true);
	}*/
	@Test
	public void existingItem(){
		cartItemDAO.existingCartItem(229, 33);
		Assert.assertEquals(false, false);
	}
}

