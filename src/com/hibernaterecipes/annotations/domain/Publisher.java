/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Guruzu
 *
 */
public class Publisher {
	
	private String code;
	private String name;
	private String address;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	

}
