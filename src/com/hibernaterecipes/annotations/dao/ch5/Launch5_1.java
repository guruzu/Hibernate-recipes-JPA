/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.util.List;

import com.hibernaterecipes.annotations.dao.CustomerDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			CustomerDAO dao = new CustomerDAO();
			
			Customer5_1 customer = new Customer5_1();
			Address5_1 address = new Address5_1();
			//address.setId(new Long(564565));
			address.setDoorplate("54213");
			address.setStreet("Main Street");
			address.setCity("Los Angeles");
			customer.setCountryCode("USA");
			customer.setEmail("abc@abc.bcd");
			customer.setFirstName("John");
			customer.setIdCardNo("5648231");
			customer.setLastName("Doe");
			customer.setAddress(address);
						
			dao.create(customer);
			List<Customer5_1> customers = dao.readAll();
			if(customers!=null && !customers.isEmpty())
			{
				address.setId(customers.get(0).getId());
			}
			
			dao.create(address);
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
