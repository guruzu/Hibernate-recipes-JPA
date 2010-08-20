/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.util.HashSet;
import java.util.Set;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			Set<String> chapters = new HashSet();
			chapters.add("test ch1");
			chapters.add("test ch2");
			chapters.add("test ch3");
			chapters.add("test ch4");
			
			BookDAO bookDao = new BookDAO();
			
			Book_6_21 book = new Book_6_21();
			book.setIsbn("522345345");
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
