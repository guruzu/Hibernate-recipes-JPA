/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch7;

import java.net.URL;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.stat.Statistics;



/**
 * @author Guruzu
 *
 */
public class Launch_7_1 { 
	
	private static Logger log = LoggerFactory.getLogger( Launch_7_1.class );
	private static SessionFactory sessionFactory;  
	  
	public static Session getSession() {
		if(sessionFactory == null)
		{
			try { 
				sessionFactory = new AnnotationConfiguration().configure("annotation.cfg.xml").buildSessionFactory();
			
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		Session hibernateSession = sessionFactory.openSession();  
		return hibernateSession;  
	}
	
	
	 
	public static void main(String[] args) {
		log.debug("In main----------------------------------------");
		System.out.println("In main sop -------------------------");
		Session session = getSession();
		Statistics stats = sessionFactory.getStatistics();
		stats.setStatisticsEnabled(true);
		Transaction tx = session.beginTransaction();

		Book7_1 book = new Book7_1();
		//book.setIsbn(1l);
		book.setBookName("Book Name ");
		book.setPrice(79l);
		book.setPublishDate(new Date());
		//session.save(book);
		
		Chapter7_1 chapter = new Chapter7_1();
		//chapter.setBookIsbn(new Long(book.getIsbn()).intValue());
		//chapter.setIdx(2l);
		chapter.setNumOfPages(10);
		chapter.setTitle("Recipes1");
		chapter.setBook(book);
		Set chapters = new HashSet<Chapter7_1>();
		chapters.add(chapter);
		book.setChapters(chapters);
		
		//session.save(chapter);
		session.saveOrUpdate(book);
		
		Query query = session.createQuery("from com.hibernaterecipes.annotations.dao.ch7.Chapter7_1");
		Chapter7_1 chap = null;
		List<Chapter7_1> results = query.list();
		for (int i=0; i< results.size(); i++) {
			chap = results.get(i);
			System.out.println("Chapter id - " + chap.getId());
			System.out.println("Chapter name - " + chap.getTitle());
			System.out.println("getBookName - " + chap.getBook().getBookName());
			
			
		}
		
		tx.commit();
		stats.getSessionOpenCount();
		stats.logSummary();
		session.close();
		
	}

}
