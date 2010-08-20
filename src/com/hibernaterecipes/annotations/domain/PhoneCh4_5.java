/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Guruzu
 *
 */
@Embeddable
public class PhoneCh4_5 {
	
	@Column (name = "WEEKDAY_AREACODE")
	private String areaCode;
	@Column (name = "WEEKDAY_TELEPHONE")
	private String telNo;

	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * @return the telNo
	 */
	public String getTelNo() {
		return telNo;
	}
	/**
	 * @param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((telNo == null) ? 0 : telNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneCh4_5 other = (PhoneCh4_5) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (telNo == null) {
			if (other.telNo != null)
				return false;
		} else if (!telNo.equals(other.telNo))
			return false;
		return true;
	}
	
	public String convertToCompleteTelNum()
	{
		return getAreaCode()+"-"+getTelNo();
	}
	public PhoneCh4_5(String areaCode, String telNo) {
		super();
		this.areaCode = areaCode;
		this.telNo = telNo;
	}
	public PhoneCh4_5() {
		super();
		
	}
	
	
	
}
