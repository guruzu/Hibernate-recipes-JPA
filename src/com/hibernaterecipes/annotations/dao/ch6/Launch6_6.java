/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.util.List;
import java.util.Set;

import com.hibernaterecipes.annotations.dao.BookDAO;

/**
 * @author Guruzu  
 *
 */
public class Launch6_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			
			BookDAO bookDao = new BookDAO();
			
			List<Book_6_1> books = bookDao.readBook();
			if(books!=null && !books.isEmpty())
			{
				for(Book_6_1 book:books)
				{
					System.out.println(book.getIsbn());
					Set<String> chapters = book.getChapters();
					if(chapters!=null && !chapters.isEmpty())
					{
						for(String chapter:chapters)
						{
							System.out.println("chapter "+chapter);
						}
					}
				}
			}
			
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
