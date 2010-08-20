/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author Guruzu
 *
 */
@Entity 
@Table (name="CUSTOMER",schema="BOOK5")
public class Customer5_2 implements Serializable {

	private static final long serialVersionUID = -3534434932962734600L;
	@Column (name="ID")
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long id;
	
	@Column (name="COUNTRY_CODE")
	private String countryCode;
	
	@Column (name="ID_CARD_NO")
	private String idCardNo;
	
	@Column (name="FIRST_NAME")
	private String firstName;
	
	@Column (name="LAST_NAME")
	private String lastName;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="ADDRESS_ID")
	private Address5_2 address;
	
	@Column (name="EMAIL")
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address5_2 getAddress() {
		return address;
	}
	public void setAddress(Address5_2 address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
