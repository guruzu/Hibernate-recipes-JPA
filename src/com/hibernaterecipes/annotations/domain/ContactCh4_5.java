/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.hibernate.annotations.Parent;



/**
 * @author Guruzu
 *
 */
@Embeddable
public class ContactCh4_5 {
	@Column (name = "WEEKDAY_RECIPIENT")
	private String recipient;
	
	@Embedded
	@ org.hibernate.annotations.Type 
	(type="com.hibernaterecipes.annotations.custommapping.PhoneCompositeUserType")
	@ org.hibernate.annotations.Columns
	(
			columns={@Column (name = "WEEKDAY_AREACODE"),@Column (name = "WEEKDAY_TELEPHONE")}
	)
	private PhoneCh4_5 phone;
	
	@Column (name = "WEEKDAY_ADDRESS")
	private String address;
	
	private OrdersCh4_5 order;
	
	public ContactCh4_5()
	{
		
	}

	/**
	 * @return the recipient
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * @param recipient the recipient to set
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * @return the phone
	 */
	public PhoneCh4_5 getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneCh4_5 phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Parent	
	public OrdersCh4_5 getOrder() {
		return order;
	}

	public void setOrder(OrdersCh4_5 order) {
		this.order = order;
	}
	
	

}
