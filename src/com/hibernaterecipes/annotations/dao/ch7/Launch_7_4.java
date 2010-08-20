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
public class Launch_7_4 { 
	
	private static Logger log = LoggerFactory.getLogger( Launch_7_4.class );
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
		Transaction tx = session.beginTransaction();

		Book7_4 book = new Book7_4();
		//book.setIsbn(1l);
		book.setBookName("Book Name ");
		book.setPrice(79l);
		book.setPublishDate(new Date());
		session.save(book);
		
		Chapter7_4 chapter = new Chapter7_4();
		//chapter.setBookIsbn(new Long(book.getIsbn()).intValue());
		//chapter.setIdx(2l);
		chapter.setNumOfPages(10);
		chapter.setTitle("Recipes1");
		//chapter.setBook(book);
		Chapter7_4 chapter1 = new Chapter7_4();
		//chapter.setBookIsbn(new Long(book.getIsbn()).intValue());
		//chapter.setIdx(2l);
		chapter1.setNumOfPages(10);
		chapter1.setTitle("Recipes2");
		//chapter1.setBook(book);
		Set chapters = new HashSet<Chapter7_4>();
		chapters.add(chapter);
		chapters.add(chapter1);
		book.setChapters(chapters);
		
		//session.save(chapter);
		//session.save(chapter1);
		session.saveOrUpdate(book);
		
		/*Query query = session.createQuery("from com.hibernaterecipes.annotations.dao.ch7.Chapter7_1");
		Chapter7_3 chap = null;
		List<Chapter7_3> results = query.list();
		for (int i=0; i< results.size(); i++) {
			chap = results.get(i);
			System.out.println("Chapter id - " + chap.getId());
			System.out.println("Chapter name - " + chap.getTitle());
			System.out.println("getBookName - " + chap.getBook().getBookName());
			
			
		}*/
		
		tx.commit();
		session.close();
		
	}

}
