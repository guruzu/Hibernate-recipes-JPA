/**
 * 
 */
package com.hibernaterecipes.annotations.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Target;



/**
 * @author Guruzu
 *
 */
@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table	(name="ORDERS")
public class Orders_3_3 implements Serializable{
	
	private Long id;
	private Set<Contact_3_3> contacts;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="ID")
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the contacts
	 */
	@CollectionOfElements (targetElement=Contact_3_3.class,fetch=FetchType.EAGER)
	@JoinTable (name = "ORDERS_CONTACT" , 
			joinColumns = @JoinColumn(name="ORDER_ID"))
	public Set<Contact_3_3> getContacts() {
		return contacts;
	}
	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(Set<Contact_3_3> contacts) {
		this.contacts = contacts;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders_3_3 [contacts=" + contacts + ", id=" + id + "]";
	}
	
	
	

}
