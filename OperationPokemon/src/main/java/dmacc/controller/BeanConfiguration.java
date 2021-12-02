package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Buyer;
import dmacc.beans.Card;
import dmacc.beans.Move;
import dmacc.beans.Seller;
import dmacc.beans.SellerCardList;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Seller seller() {
		Seller bean = new Seller();
		
		return bean;
	}
	@Bean
	public Buyer buyer() {
		Buyer bean = new Buyer ();
		return bean;
	}
	
	@Bean
	public Card card() {
		Card bean = new Card();
		return bean;
	}
	
	@Bean
	public SellerCardList sellerCardList() {
		SellerCardList bean = new SellerCardList();
		return bean;
	}
}
