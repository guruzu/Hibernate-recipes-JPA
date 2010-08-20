package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import org.hibernate.annotations.Parent;

@Embeddable
@Table	(name="ORDERS_CONTACT")
public class Contact_3_3 implements Serializable{
	
	private String recipient;
	private String phone;
	private String address;
	private Orders_3_3 order;
	/**
	 * @return the recipient
	 */
	@Column (name = "RECIPIENT")
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
	@Column (name = "TELEPHONE")
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	@Column (name = "ADDRESS")
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the order
	 */
	@Parent
	public Orders_3_3 getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Orders_3_3 order) {
		this.order = order;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact_3_3 [address=" + address + ", phone=" + phone
				+ ", recipient=" + recipient + "]";
	}
	
	
}
