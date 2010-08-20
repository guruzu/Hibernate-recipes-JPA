/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.util.ArrayList;
import java.util.List;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			List<String> chapters = new ArrayList();
			chapters.add("test ch11");
			chapters.add("test ch22");
			chapters.add("test ch33");
			chapters.add("test ch44");
			
			BookDAO bookDao = new BookDAO();
			
			Book_6_3 book = new Book_6_3();
			book.setIsbn("522234232");
			book.setName("Hibernate Recipes");
			book.setChapters(chapters);
			bookDao.create(book);
			
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
