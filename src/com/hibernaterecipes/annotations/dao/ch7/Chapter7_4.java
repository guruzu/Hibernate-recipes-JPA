/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Guruzu
 *
 */
@Entity (name="chapter74")
@Table	(name="Chapter7_4", schema="BOOKSHOP7")
public class Chapter7_4 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.TABLE)
	@Column (name="id")
	private long id;
	
	@Column (name="title")
	private String title;
	
	@Column (name="NUM_OF_PAGES")
	private int numOfPages;
		
	public long getId() {
		return id;
	}
	public void setId(long index) {
		this.id = index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
}
