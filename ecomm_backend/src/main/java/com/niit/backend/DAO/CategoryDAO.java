package com.niit.backend.DAO;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
}


