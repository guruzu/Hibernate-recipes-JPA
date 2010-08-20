/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.io.Serializable;
import java.util.List;

import com.hibernaterecipes.annotations.dao.CustomerDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			CustomerDAO dao = new CustomerDAO();
			
			Customer5_2 customer = new Customer5_2();
			Address5_2 address = new Address5_2();
			
			address.setDoorplate("54213");
			address.setStreet("Main Street");
			address.setCity("Los Angeles");
			System.out.println("START");
			//Serializable id =dao.create(address);
			//System.out.println("ID-"+id);
			//address.setId((Long)id);
			customer.setCountryCode("USA");
			customer.setEmail("abc@abc.bcd");
			customer.setFirstName("John");
			customer.setIdCardNo("5648231");
			customer.setLastName("Doe");
			customer.setAddress(address);
			//address.setCustomer(customer);		
			
			dao.create(customer);
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
