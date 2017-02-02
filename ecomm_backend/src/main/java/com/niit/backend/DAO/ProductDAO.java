package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.entity.Product;

public interface ProductDAO {
	List<ProductDAO> list();
	ProductDAO get(int id);
	boolean add(ProductDAO product);
}


