package com.niit.backend.DAO;

import java.util.List;

import javax.mail.Address;

public interface AddressDAO {
	
List<AddressDAO> list(int userId);
	
	boolean addAddress(Address address);
	
	boolean updateAddress(Address address);
	
	boolean deleteAddress(Address address);
	
}


