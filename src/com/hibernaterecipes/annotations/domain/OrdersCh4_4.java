/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hibernaterecipes.annotations.domain.Book;

/**
 * @author Guruzu
 *
 */
@Entity (name="OrderCh4_4")
@Table (name="ORDERS")
public class OrdersCh4_4 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="ID")
	private Long id;
	//private Book book;
	@Column (name="WEEKDAY_RECIPIENT")
	private String weekdayRecipient;
	
	@org.hibernate.annotations.Type
	(type = "com.hibernaterecipes.annotations.custommapping.PhoneUserType")
	@Column (name="WEEKDAY_PHONE")
	private PhoneCh4_4 weekdayPhone;
	
	@Column (name="WEEKDAY_ADDRESS")
	private String weekdayAddress;
	@Column (name="HOLIDAY_RECIPIENT")
	private String holidayRecipient;
	@org.hibernate.annotations.Type
	(type = "com.hibernaterecipes.annotations.custommapping.PhoneUserType")
	@Column (name="HOLIDAY_PHONE")
	private PhoneCh4_4 holidayPhone;
	@Column (name="HOLIDAY_ADDRESS")
	private String holidayAddress;
	
		
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the book
	 */
	/*public Book getBook() {
		return book;
	}*/
	/**
	 * @param book the book to set
	 */
	/*public void setBook(Book book) {
		this.book = book;
	}*/
	/**
	 * @return the weekdayRecipient
	 */
	public String getWeekdayRecipient() {
		return weekdayRecipient;
	}
	/**
	 * @param weekdayRecipient the weekdayRecipient to set
	 */
	public void setWeekdayRecipient(String weekdayRecipient) {
		this.weekdayRecipient = weekdayRecipient;
	}
	/**
	 * @return the weekdayPhone
	 */
	public PhoneCh4_4 getWeekdayPhone() {
		return weekdayPhone;
	}
	/**
	 * @param weekdayPhone the weekdayPhone to set
	 */
	public void setWeekdayPhone(PhoneCh4_4 weekdayPhone) {
		this.weekdayPhone = weekdayPhone;
	}
	/**
	 * @return the weekdayAddress
	 */
	public String getWeekdayAddress() {
		return weekdayAddress;
	}
	/**
	 * @param weekdayAddress the weekdayAddress to set
	 */
	public void setWeekdayAddress(String weekdayAddress) {
		this.weekdayAddress = weekdayAddress;
	}
	/**
	 * @return the holidayRecipient
	 */
	public String getHolidayRecipient() {
		return holidayRecipient;
	}
	/**
	 * @param holidayRecipient the holidayRecipient to set
	 */
	public void setHolidayRecipient(String holidayRecipient) {
		this.holidayRecipient = holidayRecipient;
	}
	/**
	 * @return the holidayPhone
	 */
	public PhoneCh4_4 getHolidayPhone() {
		return holidayPhone;
	}
	/**
	 * @param holidayPhone the holidayPhone to set
	 */
	public void setHolidayPhone(PhoneCh4_4 holidayPhone) {
		this.holidayPhone = holidayPhone;
	}
	/**
	 * @return the holidayAddress
	 */
	public String getHolidayAddress() {
		return holidayAddress;
	}
	/**
	 * @param holidayAddress the holidayAddress to set
	 */
	public void setHolidayAddress(String holidayAddress) {
		this.holidayAddress = holidayAddress;
	}
	
	

}
