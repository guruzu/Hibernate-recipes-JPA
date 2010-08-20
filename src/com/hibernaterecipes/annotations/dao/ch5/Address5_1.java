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
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="ADDRESS",schema="BOOK5")
public class Address5_1 implements Serializable
{
	
	private static final long serialVersionUID = -605474766287314591L;
	@Id 
	@Column (name="ADDRESS_ID")
	private Long id;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="DOOR_PLATE")
	private String doorplate;
	
	
	
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
	
		
	
}
