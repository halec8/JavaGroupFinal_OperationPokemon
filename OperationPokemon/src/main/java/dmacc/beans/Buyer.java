package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

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
public class Buyer {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String relationship;
	
	private String street;
	
	private String city;
	
	private String state;

	
		public Buyer(String name) {
		super();
		this.name = name;
		
		}
		public Buyer(String name, String relationship) {
		super();
		this.name = name;
		this.relationship = relationship;
		}
		public Buyer(int id, String name, String relationship) {

			this.id = id;
			this.name = name;
			this.relationship = relationship;
		}
		
		public Buyer(int id, String name, String relationship, String street) {

			this.id = id;
			this.name = name;
			this.relationship = relationship;
			this.street = street;
		
		}
		
		public Buyer(int id, String name, String relationship, String street, String city) {

			this.id = id;
			this.name = name;
			this.relationship = relationship;
			this.street = street;
			this.city = city;
		
		}
	
		public Buyer(int id, String name, String relationship, String street, String city, String state) {

			this.id = id;
			this.name = name;
			this.relationship = relationship;
			this.street = street;
			this.city = city;
			this.state = state;
		}
}
