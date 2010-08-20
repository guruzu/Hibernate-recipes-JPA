package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity (name="AudioDisc3")
@Table (name="AUDIO_DISC_3")
@AttributeOverrides ({
	@AttributeOverride(name="name", column=@Column(name="NAME")),
	@AttributeOverride(name="price", column=@Column(name="PRICE"))
})
public class AudioDisc_3 extends Disc_3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8510682776718466795L;
	private Long discId;
	private Integer noOfSongs;
	private String singer;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="DISC_ID")
	public Long getDiscId() {
		return discId;
	}
	public void setDiscId(Long discId) {
		this.discId = discId;
	}
	@Column (name="NO_OF_SONGS")
	public Integer getNoOfSongs() {
		return noOfSongs;
	}
	public void setNoOfSongs(Integer noOfSongs) {
		this.noOfSongs = noOfSongs;
	}
	@Column (name="SINGER")
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
