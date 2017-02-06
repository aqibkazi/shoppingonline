package com.niit.testcases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.AddressDAO;
import com.niit.backend.entity.Address;

public class AddressDAOTestCases {
	
	@Autowired
	AddressDAO addressDAO;
	
	@Autowired
	Address address;
	
	@Autowired
	AnnotationConfigApplicationContext context;
	
	public AddressDAOTestCases() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecomm");
		context.refresh();
		address = (Address) context.getBean("address");
		addressDAO = (AddressDAO) context.getBean("addressDAO");
		}
	
	
	/*@Test
	public void deleteAddressTest(){
		address = addressDAO.get(2);
		Assert.assertEquals(true, addressDAO.deleteAddress(address));
	}*/
	
	/*@Test
	public void updateAddressTest(){
		address = addressDAO.get(1);
		address.setCity("Delhi");
		Assert.assertEquals(true, addressDAO.updateAddress(address));
	}
	*/
	/*@Test
	public void addAddressTest(){
		address.setId(2);
		address.setFirstName("Aqib");
		address.setLastName("Kazi");
		address.setUserId(1);
		address.setLineOne("Chawl No. 1, Chawl N, Room No. 4");
		address.setLineTwo("Jamil Nagar Bhandup");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setLandmark("Near Maratha Mandir School");
		address.setPincode(400078);
		address.setCountry("India");
		address.setMobileNumber("9967894958");
		Assert.assertEquals(true, addressDAO.addAddress(address));
	
	}*/
	
}

