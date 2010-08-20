/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

import com.hibernaterecipes.annotations.dao.OrdersDAO;
import com.hibernaterecipes.annotations.domain.OrdersCh4_4;
import com.hibernaterecipes.annotations.domain.PhoneCh4_4;

/**
 * @author Guruzu
 *
 */
public class Launch4_5 {
	private static SessionFactory sessionFactory;  
	  
	
	public static void main(String[] args) {
		OrdersDAO dao = new OrdersDAO();
		OrdersCh4_4 ord = new OrdersCh4_4();
		ord.setHolidayAddress("777,vacation street, Maimi, Fl - 23232");
		PhoneCh4_4 phnHld = new PhoneCh4_4();
		phnHld.setAreaCode("979");
		phnHld.setTelNo("98770790");
		ord.setHolidayPhone(phnHld);
		ord.setHolidayRecipient("John Doe");
		ord.setWeekdayRecipient("John Doe");
		ord.setWeekdayAddress("00998, Permanent home, Scottsdale, AZ - 85254");
		PhoneCh4_4 phn = new PhoneCh4_4();
		phn.setAreaCode("480");
		phn.setTelNo("7489512");
		ord.setWeekdayPhone(phn);
		dao.createOrderWithCustomPhnType(ord);
		

	}

}
