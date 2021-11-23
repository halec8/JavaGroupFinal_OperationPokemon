package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phoneNumber;

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
}
