/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.AccessType;

/**
 * @author Guruzu
 *
 */
@Entity (name="bkch2")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table	(name="BOOK")
public class BookCh2 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.TABLE)
	@Column (name="ISBN")
	private long isbn;
	
	@Version
	@Column (name="version")
	private Integer version;
	
	@Column (name="book_Name")
	private String bookName;
	
	/*@Column (name="publisher_code")
	String publisherCode;*/
	
	@Column (name="publish_date")
	private Date publishDate;
	
	@Column (name="price")
	private Long price;

	/**
	 * @return the isbn
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(long isbn) {
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
	
	@Override
	public String toString() {
		return String
				.format(
						"Book [\t isbn=%s, \n\t bookName=%s, \n\t price=%s, \n\t publishDate=%s,\n\t version=%s,]",
						isbn, bookName, price, publishDate,version);
	}
	
	

	
}
