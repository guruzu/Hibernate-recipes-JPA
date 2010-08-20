/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch7;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Guruzu
 *
 */
@Entity (name="chapter741")
@Table	(name="Chapter7_41", schema="BOOKSHOP7")
public class Chapter7_41 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.TABLE)
	@Column (name="id")
	private long id;

	@ManyToMany (mappedBy="chapters")
	private Set<Book7_41> book = new HashSet<Book7_41>();
	
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
	public Set getBook() {
		return book;
	}
	public void setBook(Set book) {
		this.book = book;
	}
	
	
	
}
