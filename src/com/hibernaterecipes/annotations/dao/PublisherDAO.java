/**
 * Book DAO
 */
package com.hibernaterecipes.annotations.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

import com.hibernaterecipes.annotations.dao.ch5.Book_5_1;
import com.hibernaterecipes.annotations.dao.ch5.Publisher;
import com.hibernaterecipes.annotations.domain.Book;

/**
 * @author sree
 *
 */
public class PublisherDAO {
	
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
	public Long create(Publisher publisher) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		Serializable obj = session.save(publisher);
		
		session.getTransaction().commit();
		return (Long)obj;
		
	}
	
	public List<Book> readFromManager() {
		
		EntityManager manager = SessionManager.getEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		Query query = manager.createQuery("select b from Book b");
		List<Book> list = query.getResultList();
		return list;
	}
	
	public void create(Book_5_1 bookObj) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(bookObj);
		
		session.getTransaction().commit();
		
	}
	
}
