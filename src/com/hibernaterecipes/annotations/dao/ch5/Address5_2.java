/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch5;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Parameter;

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="ADDRESS",schema="BOOK5")
public class Address5_2 implements Serializable
{
	
	private static final long serialVersionUID = -605474766287314591L;
	@Id 
	@Column (name="ADDRESS_ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="DOOR_PLATE")
	private String doorplate;
	
	/*@OneToOne (mappedBy="address")
	private Customer5_2 customer;*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoorplate() {
		return doorplate;
	}
	public void setDoorplate(String doorplate) {
		this.doorplate = doorplate;
	}
	/*public Customer5_2 getCustomer() {
		return customer;
	}
	public void setCustomer(Customer5_2 customer) {
		this.customer = customer;
	}*/
	
		
	
}
