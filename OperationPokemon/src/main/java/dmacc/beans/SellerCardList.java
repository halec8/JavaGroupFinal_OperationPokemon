package dmacc.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 18, 2021
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerCardList {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Seller seller;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<Card> cardList;
}
