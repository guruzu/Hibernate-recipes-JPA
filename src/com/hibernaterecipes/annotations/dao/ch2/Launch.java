/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch2;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.hibernaterecipes.annotations.domain.BookCh2;
import com.hibernaterecipes.annotations.dao.ch2.*;

/**
 * @author Guruzu  
 *
 */
public class Launch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Test");
	
		try {
			
			BookCh2 newBook = new BookCh2();
			newBook.setBookName("HIbernate Recipes Phase1");
			newBook.setPublishDate(new Date());
			newBook.setPrice(50l);
		
			BookDAO bookDAO = new BookDAO();
			
			//bookDAO.create(newBook);
			//System.out.println("Session Factory - " +bookDAO.readAll().size());
			//bookDAO.deleteAll();
			//List<BookCh2> list = bookDAO.readFromManager();
			List<BookCh2> list = bookDAO.readAll();
			if(list != null)
			{
				for(BookCh2 book:list)
				{
					System.out.println(book);
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
