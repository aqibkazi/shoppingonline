package com.niit.backend.DAO;

import java.util.List;

public interface AddressDAO {
	
List<AddressDAO> list(int userId);
	
	boolean addAddress(AddressDAO address);
	
	boolean updateAddress(AddressDAO address);
	
	boolean deleteAddress(AddressDAO address);
	
	AddressDAO get(int id);
}


