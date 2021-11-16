package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */

@Embeddable
public class BuyerShippingAddress {
	private String street;
	private String city;
	private String state;

	public BuyerShippingAddress() {
	super();
	}

	public BuyerShippingAddress(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [street: " + street + ", city: " + city + ", state: " + state + "]";
	}
}
