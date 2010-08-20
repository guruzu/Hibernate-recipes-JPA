package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISC_TYPE",
		discriminatorType=DiscriminatorType.STRING)
public class Disc_1 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3087285416805917315L;
	
	private Long discId;
	private String name;
	private Integer price;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="DISC_ID")
	public Long getDiscId() {
		return discId;
	}
	public void setDiscId(Long discId) {
		this.discId = discId;
	}
	@Column (name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column (name="PRICE")
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Disc_1 [discId=" + discId + ", name=" + name + ", price="
				+ price + "]";
	}
	
	
}
