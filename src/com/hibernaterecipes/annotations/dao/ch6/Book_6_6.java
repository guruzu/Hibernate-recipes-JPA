/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch6;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Sort;
import org.hibernate.annotations.SortType;

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="BOOK6_1", schema="BOOK6")
public class Book_6_6 implements Serializable{
	@Id 
	@Column (name="BOOK_ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long book_id;
	@Column (name="isbn")
	private String isbn;
	@Column (name="BOOK_NAME")
	private String name;
	@Column (name="price")
	private Integer price;
	@CollectionOfElements (targetElement=java.lang.String.class)
	@JoinTable(
			name="Book61_Chapter",
			schema="BOOK6",
			joinColumns=@JoinColumn(name="BOOK_ID")
	)
	@Column(name="chapter_name")
	@Sort (type=SortType.NATURAL)
	private Set chapters = new TreeSet();
	
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Set getChapters() {
		return chapters;
	}
	public void setChapters(Set chapters) {
		this.chapters = chapters;
	}
	
	
}
