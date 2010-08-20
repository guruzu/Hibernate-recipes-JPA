/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.io.Serializable;
import java.util.List;

import com.hibernaterecipes.annotations.dao.BookDAO;
import com.hibernaterecipes.annotations.dao.PublisherDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch5_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			BookDAO bookDao = new BookDAO();
			PublisherDAO pubDao = new PublisherDAO();
					
			Publisher5_2 publisher = new Publisher5_2();
			publisher.setAddress("4578, Price Road, chandler");
			publisher.setCode("4444");
			publisher.setName("Apress");
			//Long obj = pubDao.create(publisher);
						
			/*if(obj instanceof Long)
				publisher.setPublisher_id(obj);*/
			Book_5_2 book = new Book_5_2();
			book.setIsbn("34543453");
			book.setName("Hibernate Recipes");
			book.setPublisher(publisher);
			bookDao.create(book);
			
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
