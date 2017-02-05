package com.niit.testcases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.UserDAO;
import com.niit.backend.entity.Cart;
import com.niit.backend.entity.User;

public class UserDAOTestCases {


	/*
	 * @Autowired is use to automatically inject the bean.
	 */
	@Autowired
	UserDAO userDAO;

	@Autowired
	User user;
	
	@Autowired
	Cart cart;

	@Autowired
	AnnotationConfigApplicationContext context;

	public UserDAOTestCases() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecom");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		cart = (Cart) context.getBean("cart");
	}
	
	/*@Test
	public void deleteUserTest(){
		user = userDAO.getUser(37);
		Assert.assertEquals(true, userDAO.deleteUser(user));
	}*/

	/*
	 * Test to get user by its id
	 */
	
	/*@Test
	public void getUserTest(){
		user = userDAO.getUser(4);
		Assert.assertEquals("This is Valid", user.getId(),userDAO.getUser(1).getId());
	}	*/
	
	/*@Test
	public void getAllUserTest(){
		user = userDAO.getByUserName("aqibkazi97@gmail.com");
		Assert.assertEquals(1, user.getId());
	}*/
	
	/*@Test
	public void updateUserTest(){
		user = userDAO.getUser(1);
		user.setRole("ADMIN");
		Assert.assertEquals(true, userDAO.updateUser(user));
	}*/
	
	/*@Test
	public void addUserTest() {
		
		cart.setGrandTotal(1000);
		cart.setNumberOfCartItems(1);
		cart.setCartItems(null);
		
		user.setFirstName("Aqib");
		user.setLastName("Kazi");
		user.setEmail("aqibkazi97@gmail.com");
		user.setGender("Male");
		user.setMobileNumber("9967894958");
		user.setPassword("test");
		user.setCart(cart);
		user.setEnabled(true);
		user.setRole("ADMIN");
		cart.setUser(user);
		userDAO.addUser(user);
		Assert.assertEquals(true, userDAO.addUser(user));
	}*/
}
