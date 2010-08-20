/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			String[] chap = new String[4];
			chap[0]="chap1";
			chap[1]="chap2";
			chap[2]="chap3";
			chap[3]="chap4";
				
			/*List<String> chapters = new ArrayList();
			chapters.add("test ch11");
			chapters.add("test ch22");
			chapters.add("test ch33");
			chapters.add("test ch44");
			*/
			BookDAO bookDao = new BookDAO();
			
			Book_6_4 book = new Book_6_4();
			book.setIsbn("52223423312");
			book.setName("Hibernate Recipes");
			book.setChapters(chap);
			bookDao.create(book);
			
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
