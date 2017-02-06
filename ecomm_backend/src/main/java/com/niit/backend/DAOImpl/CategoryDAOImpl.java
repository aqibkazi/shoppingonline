package com.niit.backend.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.CategoryDAO;
import com.niit.backend.entity.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	/*
	 * List all the product
	 */
	@Override
	@Transactional
	public List<Category> list() {
		String hql = "FROM CATEGORIES";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	/*
	 * Get single product
	 */
	@Override
	@Transactional
	public Category get(int id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
	}

	/*
	 * Add Category
	 */
	@Override
	@Transactional
	public boolean addCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * Update Category
	 */
	@Override
	@Transactional
	public boolean updateCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/*
	 * Delete Category
	 */
	@Override
	@Transactional
	public boolean deleteCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}

