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
import javax.persistence.Table;
@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Disc_4 implements Serializable {
	
	
	private static final long serialVersionUID = 3087285416805917315L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="DISC_ID")
	private Long discId;
	@Column (name="NAME")
	private String name;
	@Column (name="PRICE")
	private Integer price;
	
	
	public Long getDiscId() {
		return discId;
	}
	public void setDiscId(Long discId) {
		this.discId = discId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
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
