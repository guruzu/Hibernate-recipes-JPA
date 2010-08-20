package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="AUDIO_DISC_2")
@PrimaryKeyJoinColumn (name="DISC_ID")
public class AudioDisc_2 extends Disc_2 implements Serializable {

	private static final long serialVersionUID = 8510682776718466795L;
	
	@Column (name="NO_OF_SONGS")
	private Integer noOfSongs;
	@Column (name="SINGER")
	private String singer;
	
	
	
	public Integer getNoOfSongs() {
		return noOfSongs;
	}
	public void setNoOfSongs(Integer noOfSongs) {
		this.noOfSongs = noOfSongs;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "AudioDisc_1 [noOfSongs=" + noOfSongs + ", singer=" + singer
				+ ", getDiscId()=" + getDiscId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	
}
