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
	
	private String street;
	
	private String city;
	
	private String state;

}
