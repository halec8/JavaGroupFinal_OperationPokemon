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

}
