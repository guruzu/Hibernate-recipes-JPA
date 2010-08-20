package com.hibernaterecipes.annotations.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table	(name="ADDRESS")
public class Address {
	
	private Long id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private Integer zipCode;
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
	 * @return the address1
	 */
	@Column (name="STREET_ADDRESS_1")
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	@Column (name="STREET_ADDRESS_2")
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	@Column (name="CITY")
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	@Column (name="STATE")
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipCode
	 */
	@Column (name="ZIP_CODE")
	public Integer getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
