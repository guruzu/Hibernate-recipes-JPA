/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="BOOK5_2", schema="BOOK5")
public class Book_5_2 implements Serializable{
	@Id 
	@Column (name="BOOK_ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long book_id;
	@Column (name="isbn")
	private String isbn;
	@Column (name="BOOK_NAME")
	private String name;
	@ManyToOne
	@Cascade (value=CascadeType.SAVE_UPDATE)
	@JoinTable (schema="BOOK5",name="BOOK_PUBLISHER",
			joinColumns=@JoinColumn(name="BOOK_ID"),
			inverseJoinColumns=@JoinColumn(name="PUBLISHER_ID"))
	private Publisher5_2 publisher;
	
	@Column (name="price")
	private Integer price;
	
	
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long bookId) {
		book_id = bookId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher5_2 getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher5_2 publisher) {
		this.publisher = publisher;
	}
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
