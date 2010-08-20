/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.util.Set;
import java.util.TreeSet;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			Set<String> chapters = new TreeSet();
			chapters.add("test ch1");
			chapters.add("test ch5");
			chapters.add("test ch3");
			chapters.add("test ch4");
			
			BookDAO bookDao = new BookDAO();
			
			Book_6_1 book = new Book_6_1();
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
