/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch13;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.hibernaterecipes.annotations.domain.BookCh2;


/**
 * @author Guruzu  
 *
 */
public class Launch {
	static Logger log = Logger.getLogger(Launch.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.debug("In Test");
		EntityManager manager = null;
		EntityTransaction tx = null;
		
		try {
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("book");
	    	manager = managerFactory.createEntityManager();
	    	tx = manager.getTransaction();
			tx.begin();
			BookCh2 newBook = new BookCh2();
			newBook.setBookName("HIbernate Recipes Phase1");
			newBook.setPublishDate(new Date());
			newBook.setPrice(new Long(50));
			manager.persist(newBook);
			tx.commit();
			log.debug("Transaction committed");
		}catch (RuntimeException e) 
		{
			try
			{
				if(tx != null)
				{
					tx.rollback();
				}
			}catch(RuntimeException ex)
			{
				log.error("Cannot rollback transaction");
			}
				
			throw e;
		} finally {
			manager.close();
		}
		
	}

}
