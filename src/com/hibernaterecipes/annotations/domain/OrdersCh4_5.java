/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Parent;




/**
 * @author Guruzu
 *
 */
@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table	(name="BOOK_ORDERS_2")
public class OrdersCh4_5 {
	
	private Long id;
	private ContactCh4_5 weekdayContact;
	private ContactCh4_5 holidayContact;
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="ID")
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
	 * @return the weekdayContact
	 */
	@Embedded
	@AttributeOverrides ({@AttributeOverride(name="recipient",column=@Column(name="WEEKDAY_RECIPIENT")),
		@AttributeOverride(name="phone.areaCode",column=@Column(name="WEEKDAY_AREACODE")),
		@AttributeOverride(name="phone.telNo",column=@Column(name="WEEKDAY_TELEPHONE")),
		@AttributeOverride(name="address",column=@Column(name="ADDRESS"))}) 
	public ContactCh4_5 getWeekdayContact() {
		return weekdayContact;
	}
	/**
	 * @param weekdayContact the weekdayContact to set
	 */
	public void setWeekdayContact(ContactCh4_5 weekdayContact) {
		this.weekdayContact = weekdayContact;
	}
	/**
	 * @return the holidayContact
	 */
	@Embedded
	@AttributeOverrides ({@AttributeOverride(name="recipient",column=@Column(name="HOLIDAY_RECIPIENT")),
		@AttributeOverride(name="phone.areaCode",column=@Column(name="HOLIDAY_AREACODE")),
		@AttributeOverride(name="phone.telNo",column=@Column(name="HOLIDAY_TELEPHONE")),
		@AttributeOverride(name="address",column=@Column(name="HOLIDAY_ADDRESS"))})
	
	public ContactCh4_5 getHolidayContact() {
		return holidayContact;
	}
	/**
	 * @param holidayContact the holidayContact to set
	 */
	public void setHolidayContact(ContactCh4_5 holidayContact) {
		this.holidayContact = holidayContact;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders [holidayContact=" + holidayContact + ", id=" + id
				+ ", weekdayContact=" + weekdayContact + "]";
	}
	
	

}
