package com.hibernaterecipes.annotations.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import org.hibernate.annotations.Parent;

@Embeddable
public class Contact {
	
	private String recipient;
	private String phone;
	private String address;
	private Orders order;
	/**
	 * @return the recipient
	 */
	@Column (name = "WEEKDAY_RECIPIENT")
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
	@Column (name = "WEEKDAY_PHONE")
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
	@Column (name = "WEEKDAY_ADDRESS")
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
	public Orders getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Orders order) {
		this.order = order;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [address=" + address + ", phone=" + phone
				+ ", recipient=" + recipient + "]";
	}
	
	
	
}
