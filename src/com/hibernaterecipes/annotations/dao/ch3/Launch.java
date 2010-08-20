/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch3;

import java.util.List;

import com.hibernaterecipes.annotations.dao.OrdersDAO;
import com.hibernaterecipes.annotations.domain.Orders;
import com.hibernaterecipes.annotations.domain.Orders_3_3;

/**
 * @author Guruzu  
 *
 */
public class Launch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			OrdersDAO dao = new OrdersDAO();
			
			List<Orders_3_3> list = dao.readAll();
			if(list != null)
			{
				for(Orders_3_3 order:list)
				{
					System.out.println(order);
					
				}
			}
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
