package dmacc.beans;

import javax.persistence.Entity;

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
	
	private long id;
	private String name;
	private String relationship;
	@Autowired
	BuyerShippingAddress buyerShippingAddress;

	
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
}
