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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Guruzu
 *
 */
@Entity (name="chapter")
@Table	(name="Chapter7_1", schema="BOOKSHOP")
public class Chapter7_1 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.TABLE)
	@Column (name="id")
	private long id;

	@ManyToOne
	@JoinColumn (name="book_id")
	private Book7_1 book;
	
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
	public Book7_1 getBook() {
		return book;
	}
	public void setBook(Book7_1 book) {
		this.book = book;
	}
	
	
	
}
