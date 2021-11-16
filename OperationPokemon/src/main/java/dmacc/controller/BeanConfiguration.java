package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.BuyerShippingAddress;
import dmacc.beans.Seller;

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
		//bean.setName("Cody Hale");
		//bean.setRelationship("seller");
		return bean;
	}
	
	@Bean
	public BuyerShippingAddress buyerShippingAddress() {
		BuyerShippingAddress bean = new BuyerShippingAddress("123 Buyer St", "Indianapolis", "IN");
		return bean;
	}

}
