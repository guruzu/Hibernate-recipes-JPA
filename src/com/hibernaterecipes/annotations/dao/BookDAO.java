/**
 * Book DAO
 */
package com.hibernaterecipes.annotations.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

import com.hibernaterecipes.annotations.dao.ch5.Book_5_1;
import com.hibernaterecipes.annotations.dao.ch5.Book_5_2;
import com.hibernaterecipes.annotations.dao.ch6.Book_6_1;
import com.hibernaterecipes.annotations.domain.Book;

/**
 * @author sree
 *
 */
public class BookDAO {
	
	/**
	 * To query all details of a book
	 * @return
	 */
	public List<Book> readAll() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<Book> booksList = session.createQuery("from Book").list();
		
		session.getTransaction().commit();
		
		return booksList;
	}
	
	/**
	 * To create a book
	 * @return
	 */
	public void create(Book bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	/**
	 * To create a book
	 * @return
	 */
	public void create(Book_5_2 bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	public void create(Object bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	
	public List<Book> readFromManager() {
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		Query query = manager.createQuery("select b from Book b");
		query.setFirstResult(5);
		query.setMaxResults(15);
		
		List<Book> list = query.getResultList();
		return list;
	}
	
	public void persistWithManager(Object book)
	{
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(book);
		tran.commit();
		manager.close();
		
	}
	
	public List<Book_6_1> readBook() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<Book_6_1> booksList = session.createQuery("from Book_6_1").list();
		
		session.getTransaction().commit();
		
		return booksList;
	}
	public void create(Book_5_1 bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	
}
