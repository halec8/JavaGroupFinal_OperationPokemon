package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */

@Entity
public class Seller {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phoneNumber;



	public Seller() {
	super();
	
	}
	public Seller(String name) {
	super();
	this.name = name;
	
	}
	public Seller(String name, String phoneNumber) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
	}
	public Seller(int id, String name, String phoneNumber) {

		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Seller [id: " + id + ", name: " + name + "phone number: " + "]";
		}
	}
