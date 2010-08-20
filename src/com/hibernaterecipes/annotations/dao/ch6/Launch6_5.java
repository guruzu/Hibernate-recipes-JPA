/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.util.HashMap;
import java.util.Map;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			Map<String,String> chapters = new HashMap<String,String>();
			chapters.put("key1","test ch11");
			chapters.put("key2","test ch22");
			chapters.put("key3","test ch33");
			chapters.put("key4","test ch44");
			
			BookDAO bookDao = new BookDAO();
			
			Book_6_5 book = new Book_6_5();
			book.setIsbn("52223423312");
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
