/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import org.hibernate.SessionFactory;

import com.hibernaterecipes.annotations.dao.OrdersDAO;
import com.hibernaterecipes.annotations.domain.ContactCh4_5;
import com.hibernaterecipes.annotations.domain.OrdersCh4_5;
import com.hibernaterecipes.annotations.domain.PhoneCh4_5;

/**
 * @author Guruzu
 *
 */
public class Launch4_6 {
	private static SessionFactory sessionFactory;  
	  
	
	public static void main(String[] args) {
		OrdersDAO dao = new OrdersDAO();
		OrdersCh4_5 ord = new OrdersCh4_5();
		ContactCh4_5 con_1 = new ContactCh4_5();
		
		con_1.setAddress("1312,Scottsdale,Fl,45147");
		PhoneCh4_5 phnHld = new PhoneCh4_5();
		phnHld.setAreaCode("979");
		phnHld.setTelNo("98770790");
		con_1.setPhone(phnHld);
		con_1.setRecipient("John Doe 23");
		ContactCh4_5 con_2 = new ContactCh4_5();
		
		con_1.setAddress("1312,Maimi,NY,25235");
		PhoneCh4_5 phnHld2 = new PhoneCh4_5();
		phnHld2.setAreaCode("480");
		phnHld2.setTelNo("54654321");
		con_2.setPhone(phnHld2);
		con_2.setRecipient("John Doe 24");
		
		ord.setWeekdayContact(con_1);
		ord.setHolidayContact(con_2);
		dao.createOrderWithCustomCompositePhnType(ord);
		

	}

}
