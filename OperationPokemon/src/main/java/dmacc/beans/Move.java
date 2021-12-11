package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 17, 2021
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Move {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String description;
	private String energyCost;
	
}
