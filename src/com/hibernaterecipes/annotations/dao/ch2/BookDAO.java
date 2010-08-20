/**
 * Book DAO
 */
package com.hibernaterecipes.annotations.dao.ch2;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.hibernate.Session;
import com.hibernaterecipes.annotations.dao.SessionManager;
import com.hibernaterecipes.annotations.domain.BookCh2;


/**
 * @author Guruzu
 *
 */
public class BookDAO {
	
	/**
	 * To query all details of a book
	 * @return
	 */
	public List<BookCh2> readAll() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<BookCh2> booksList = session.createQuery("from bkch2").list();
		
		session.getTransaction().commit();
		
		return booksList;
	}
	
	/**
	 * To create a book
	 * @return
	 */
	public void create(BookCh2 bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	
	public List<BookCh2> readFromManager() {
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		Query query = manager.createQuery("select b from bkch2 b");
		List<BookCh2> list = query.getResultList();
		return list;
	}
	
	public void deleteAll()
	{
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<BookCh2> list = readFromManager();
		if(list != null)
		{
			for(BookCh2 book:list)
			{
				session.delete(book);
			}
		}
		
		
		session.getTransaction().commit();
	}
	
}
