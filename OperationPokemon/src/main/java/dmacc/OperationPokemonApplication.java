package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



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

