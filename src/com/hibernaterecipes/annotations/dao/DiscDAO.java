package com.hibernaterecipes.annotations.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernaterecipes.annotations.domain.AudioDisc_1;
import com.hibernaterecipes.annotations.domain.AudioDisc_2;
import com.hibernaterecipes.annotations.domain.AudioDisc_3;
import com.hibernaterecipes.annotations.domain.AudioDisc_4;
import com.hibernaterecipes.annotations.domain.Disc_1;
import com.hibernaterecipes.annotations.domain.Disc_2;
import com.hibernaterecipes.annotations.domain.VideoDisc_1;
import com.hibernaterecipes.annotations.domain.VideoDisc_2;
import com.hibernaterecipes.annotations.domain.VideoDisc_4;

public class DiscDAO {
	
	public List<Disc_1> readAll() {
			
			Session session = SessionManager.getSessionFactory().getCurrentSession();
			
			session.beginTransaction();
			
			List<Disc_1> discList = session.createQuery("from Disc_1").list();
			
			session.getTransaction().commit();
			
			return discList;
		}

	public List<AudioDisc_1> readAllAudioDisc() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<AudioDisc_1> discList = session.createQuery("from AudioDisc_1").list();
		
		session.getTransaction().commit();
		
		return discList;
	}

	public List<VideoDisc_1> readAllVideoDisc() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<VideoDisc_1> discList = session.createQuery("from VideoDisc_1").list();
		
		session.getTransaction().commit();
		
		return discList;
	}

	public List<Disc_2> readAllDisc_2() {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		List<Disc_2> discList = session.createQuery("from Disc_2").list();
		
		session.getTransaction().commit();
		
		return discList;
	}

	public List<AudioDisc_2> readAllAudioDisc_2() {
	
	Session session = SessionManager.getSessionFactory().getCurrentSession();
	
	session.beginTransaction();
	
	List<AudioDisc_2> discList = session.createQuery("from AudioDisc_2").list();
	
	session.getTransaction().commit();
	
	return discList;
	}

	public List<VideoDisc_2> readAllVideoDisc_2() {
	
	Session session = SessionManager.getSessionFactory().getCurrentSession();
	
	session.beginTransaction();
	
	List<VideoDisc_2> discList = session.createQuery("from VideoDisc_2").list();
	
	session.getTransaction().commit();
	
	return discList;
	}

	public void createAudioDisc_3(AudioDisc_3 disc) {
	
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(disc);
		
		session.getTransaction().commit();
	
	}
	
	public void createAudioDisc_4(AudioDisc_4 disc) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(disc);
		
		session.getTransaction().commit();
	
	}
	
	public void createVideoDisc_4(VideoDisc_4 disc) {
		
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.saveOrUpdate(disc);
		
		session.getTransaction().commit();
	
	}
	
	public List<AudioDisc_3> readAllAudioDisc_3() {

		Session session = SessionManager.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		List<AudioDisc_3> discList = session.createQuery("from AudioDisc_3").list();

		session.getTransaction().commit();

		return discList;
		}
}
