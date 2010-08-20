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

/**
 * @author Guruzu
 *
 */
@Entity
@Table (name="PUBLISHER5_2", schema="BOOK5")
public class Publisher5_2 implements Serializable{
	
	@Id 
	@Column (name="PUBLISHER_ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long publisher_id;
	@Column (name="CODE")
	private String code;
	@Column (name="PUBLISHER_NAME")
	private String name;
	@Column (name="ADDRESS")
	private String address;
	
	public Long getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Long publisherId) {
		publisher_id = publisherId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
