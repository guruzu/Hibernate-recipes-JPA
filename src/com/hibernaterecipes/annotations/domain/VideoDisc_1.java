package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("VIDEO")
public class VideoDisc_1 extends Disc_1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3637473456207740684L;
	
	@Column (name="DIRECTOR")
	private String director;
	@Column (name="LANGUAGE")
	private String language;
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "VideoDisc_1 [director=" + director + ", language=" + language
				+ ", getDiscId()=" + getDiscId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	

}
