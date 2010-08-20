/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch10;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernaterecipes.annotations.domain.BookCh2;
import com.hibernaterecipes.annotations.dao.*;

/**
 * @author Guruzu  
 *
 */
public class Launch_10_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Test");
	
		/*try {
			
			BookCh2 newBook = new BookCh2();
			newBook.setBookName("HIbernate Recipes Phase1");
			newBook.setPublishDate(new Date());
			newBook.setPrice(50l);
		
			BookDAO bookDAO = new BookDAO();
			bookDAO.persistWithManager(newBook);
			
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
		} */
		//retrievePersistentObject();
		//modifyPersistentObject();
		mergeDetachedObject();
	}
	
	public static void retrievePersistentObject()
	{
		
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		BookCh2 book = manager.find(BookCh2.class, new Long(294913));
		//BookCh2 book1 = manager.getReference(BookCh2.class, new Long(294912));
		
		tran.commit();
		manager.close();
		
		System.out.println(book);
	}
	
	public static void modifyPersistentObject()
	{
		
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		BookCh2 book = manager.find(BookCh2.class, new Long(294912));
		book.setBookName("Book Name - hibernate 22");
		tran.commit();
		manager.close();
		
		System.out.println(book);
	}
	
	public static void deletePersistentObject()
	{
		
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		BookCh2 book = manager.find(BookCh2.class, new Long(294912));
		manager.remove(book);
		tran.commit();
		manager.close();
		
		System.out.println(book);
	}
	
	public static void mergeDetachedObject()
	{
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		BookCh2 book = manager.find(BookCh2.class, new Long(262144));
		tran.commit();
		manager.close();
		book.setBookName("Detached Hibernate merged");
		EntityManager manager2 = SessionManager.getEntityManager();
		EntityTransaction tran2 = manager2.getTransaction();
		tran2.begin();
		BookCh2 book2 = (BookCh2) manager2.merge(book);
		tran2.commit();
		manager2.close();
	}
	
	

}
