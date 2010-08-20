/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="BOOK",schema="BOOK")
public class Book {

	@Column (name="isbn")
	@Id
	String isbn;
	
	@Column (name="book_Name")
	String bookName;
	
	/*@Column (name="publisher_code")
	String publisherCode;*/
	
	@Column (name="publish_date")
	Date publishDate;
	
	@Column (name="price")
	Long price;
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	/**
	 * @return the price
	 */
	public Long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
}
