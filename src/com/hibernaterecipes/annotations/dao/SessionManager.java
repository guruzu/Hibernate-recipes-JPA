/**
 * 
 */
package com.hibernaterecipes.annotations.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author sree
 *
 */
public class SessionManager {
	
	 private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	        try {
	        	//System.out.println("The session is being initialized..");
	            // Create the SessionFactory from hibernate.cfg.xml
	            return new AnnotationConfiguration().configure("annotation.cfg.xml").buildSessionFactory();
	        }
	        catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	        	ex.printStackTrace();
	            System.err.println("Initial SessionFactory creation failed." +ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static EntityManager getEntityManager() {
	    	EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("book");
	    	EntityManager manager = managerFactory.createEntityManager();
	    	
	    	return manager;
	    }


}
