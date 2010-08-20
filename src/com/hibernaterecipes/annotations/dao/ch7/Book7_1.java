/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch7;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.AccessType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Guruzu
 *
 */
@NamedQueries({
	@NamedQuery(
	name="Book.by.isbn",
	query="from Book where isbn = ?"
	)
})
@Entity (name="bkch71")
@Table	(name="BOOK7_1", schema="BOOKSHOP")
public class Book7_1 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.TABLE)
	@Column (name="BOOK_ID")
	private long book_id;
	
	@Column (name="ISBN")
	private String isbn;
	
	@Column (name="book_Name")
	private String bookName;
	
	/*@Column (name="publisher_code")
	String publisherCode;*/
	
	@Column (name="publish_date")
	private Date publishDate;
	
	@Column (name="price")
	private Long price;
	
	@OneToMany(targetEntity=Chapter7_1.class,mappedBy="book")
	@JoinColumn(name="BOOK_ID")
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE_ORPHAN})
	Set chapters;

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
	
	@Override
	public String toString() {
		return String
				.format(
						"Book [\t isbn=%s, \n\t bookName=%s, \n\t price=%s, \n\t publishDate=%s]",
						isbn, bookName, price, publishDate);
	}

	/**
	 * @return the chapters
	 */
	public Set getChapters() {
		return chapters;
	}

	/**
	 * @param chapters the chapters to set
	 */
	public void setChapters(Set chapters) {
		this.chapters = chapters;
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long bookId) {
		book_id = bookId;
	}

	
}
