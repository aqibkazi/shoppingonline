package com.niit.backend.DAO;

import java.util.List;

import javax.mail.Address;

public interface AddressDAO {
	
List<AddressDAO> list(int userId);
	
	boolean addAddress(AddressDAO address);
	
	boolean updateAddress(AddressDAO address);
	
	boolean deleteAddress(AddressDAO address);
	
	 void get(int id);

}


