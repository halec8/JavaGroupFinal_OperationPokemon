package dmacc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;
import dmacc.beans.BuyerShippingAddress;
import dmacc.beans.Seller;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.OperationPokemonRepository;

@SpringBootApplication
public class OperationPokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationPokemonApplication.class, args);
		
		}
		
		/*
	@Autowired
		OperationPokemonRepository repo;
		
		public void run(String... args) throws Exception{
			

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Seller s = appContext.getBean("seller", Seller.class);
		
		s.setRelationship("seller");
		repo.save(s);
		
		Seller s2 = new Seller("Andrew", "seller");
		BuyerShippingAddress bsa = new BuyerShippingAddress("125 Buyer St", "New York", "NY");
		s2.setBuyerShippingAddress(bsa);
		repo.save(s);
		
		List<Seller> allMySellers = repo.findAll();
		
		for (Seller sellers : allMySellers) {
			System.out.println(sellers.toString());
		
		}
		((AbstractApplicationContext) appContext).close();
	}
	
	*/
}

