package com.hibernaterecipes.annotations.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernaterecipes.annotations.domain.Orders;
import com.hibernaterecipes.annotations.domain.OrdersCh4_4;
import com.hibernaterecipes.annotations.domain.OrdersCh4_5;
import com.hibernaterecipes.annotations.domain.Orders_3_3;

public class OrdersDAO {
	
	/**
	 * To create a Orders
	 * @return
	 */
	public void create(Orders orders) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(orders);
		
		session.getTransaction().commit();
		
	}
	
	/**
	 * To query all details of a book
	 * @return
	 */
	public List<Orders_3_3> readAll() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<Orders_3_3> ordersList = session.createQuery("from Orders_3_3").list();
		
		session.getTransaction().commit();
		
		return ordersList;
	}
	
	public void createOrderWithCustomPhnType(OrdersCh4_4 orders) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(orders);
		
		session.getTransaction().commit();
		
	}
	
	public void createOrderWithCustomCompositePhnType(OrdersCh4_5 orders) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(orders);
		
		session.getTransaction().commit();
		
	}

}
