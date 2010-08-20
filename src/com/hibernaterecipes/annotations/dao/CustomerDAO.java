/**
 * Book DAO
 */
package com.hibernaterecipes.annotations.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.hibernaterecipes.annotations.dao.ch5.Address5_1;
import com.hibernaterecipes.annotations.dao.ch5.Address5_2;
import com.hibernaterecipes.annotations.dao.ch5.Customer5_1;
import com.hibernaterecipes.annotations.dao.ch5.Customer5_2;
import com.hibernaterecipes.annotations.dao.ch5.Customer5_3;

/**
 * @author sree
 *
 */
public class CustomerDAO {
	
	/**
	 * To query all details of a book
	 * @return
	 */
	public List<Customer5_1> readAll() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<Customer5_1> customerList = session.createQuery("from Customer5_1").list();
		
		session.getTransaction().commit();
		
		return customerList;
	}
	
	/**
	 * To create a book
	 * @return
	 */
	public void create(Customer5_1 customer) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(customer);
		
		session.getTransaction().commit();
		
	}
	
	public void create(Customer5_2 customer) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		//Serializable id = session.save(customer.getAddress());
		//System.out.println(id);
		session.saveOrUpdate(customer);
		
		session.getTransaction().commit();
		
	}
	
	public void create(Address5_1 address) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(address);
		
		session.getTransaction().commit();
		
	}
	public Serializable create(Address5_2 address) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		Serializable id = session.save(address);
		
		session.getTransaction().commit();
		return id;
		
	}
	
	public Serializable create(Customer5_3 address) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		Serializable id = session.save(address);
		
		session.getTransaction().commit();
		return id;
		
	}
}
