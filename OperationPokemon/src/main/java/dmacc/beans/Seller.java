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
	private String relationship;
	@Autowired
	private BuyerShippingAddress buyerShippingAddress;



	public Seller() {
	super();
	
	}
	public Seller(String name) {
	super();
	this.name = name;
	
	}
	public Seller(String name, String relationship) {
	super();
	this.name = name;
	this.relationship = relationship;
	}
	public Seller(int id, String name, String relationship) {

		this.id = id;
		this.name = name;
		this.relationship = relationship;
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
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	/**
	 * @return the buyerShippingAddress
	 */
	public BuyerShippingAddress getBuyerShippingAddress() {
		return buyerShippingAddress;
	}
	/**
	 * @param buyerShippingAddress the buyerShippingAddress to set
	 */
	public void setBuyerShippingAddress(BuyerShippingAddress buyerShippingAddress) {
		this.buyerShippingAddress = buyerShippingAddress;
		}
	
	
	@Override
	public String toString() {
		return "Seller [id: " + id + ", name: " + name + ", relationship: " + relationship + "buyer shipping address:" + buyerShippingAddress+  "]";
		}
	}
