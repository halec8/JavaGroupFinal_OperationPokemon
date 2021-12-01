package dmacc.beans;

import java.util.List;

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
public class Card {
	@Id
	@GeneratedValue
	private long id;
	private double price;
	private String name;
	//private int hp;
	private String pokemonType;
	private boolean isCardJumbo;
	private String cardType;
	private boolean isGX;
	private boolean isEX;
	private boolean isMega;
	//List <Move> moveList;
	private String ability;
}
