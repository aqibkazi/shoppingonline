package com.niit.backend.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.UserDAO;
import com.niit.backend.entity.Cart;
import com.niit.backend.entity.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	User user;

	@Autowired
	Cart cart;

	@Override
	@Transactional
	public List<User> list() {
		String hql = "FROM USERS";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	@Transactional
	public User getUser(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	@Transactional
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	@Transactional
	public boolean updateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	@Transactional
	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public boolean isValidate(String userName, String password) {

		/*
		 * if(userName.equals("ansarifaisal480@gmail.com")&&password.equals(
		 * "test")){ return true; }else{ return false; }
		 * 
		 * 
		 * String hql = "SELECT email, password FROM USERS where email ="; Query
		 * query = sessionFactory.getCurrentSession().createQuery(hql); List
		 * userDetails= query.list(); for (Object userDetail : userDetails) {
		 * 
		 * }
		 * 
		 */
		return false;
	}

	@Transactional
	@Override
	public User getByUserName(String userName) {
		String hql = "FROM USERS WHERE USER_EMAIL =:email";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("email", userName);
		List<User> listOfUser = query.getResultList();
		if (listOfUser != null && !listOfUser.isEmpty()) {
			return listOfUser.get(0);
		}
		return null;
	}

