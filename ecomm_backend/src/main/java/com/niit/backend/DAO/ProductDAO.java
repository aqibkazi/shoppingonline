package com.niit.backend.DAO;

import java.util.List;

public interface ProductDAO {
	
	ProductDAO get(int id);
	List<ProductDAO> list();
	boolean addProduct(ProductDAO product);
	boolean updateProduct(ProductDAO product);
	boolean deleteProduct(ProductDAO product);
	ProductDAO getByCategory(int categoryId);
}
