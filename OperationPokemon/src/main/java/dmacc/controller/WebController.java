package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import dmacc.beans.Buyer;
import dmacc.beans.Card;
import dmacc.beans.Seller;
import dmacc.repository.BuyerRepository;
import dmacc.repository.CardRepository;
import dmacc.repository.OperationPokemonRepository;


OperationPokemonRepository;

/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * Nov 16, 2021
 */

@Controller
public class WebController {
	@Autowired
	OperationPokemonRepository sellerRepo;
	@Autowired
	BuyerRepository buyerRepo;
	@Autowired
	CardRepository cardRepo;

	//the seller methods of the web controller
	@GetMapping("/viewAllSellers")
	public String viewAllSellers(Model model) {
		if(sellerRepo.findAll().isEmpty()) {
			return addNewSeller(model);
	}
	model.addAttribute("sellers", sellerRepo.findAll());
	return "results";
	}
	
	@GetMapping("/inputSeller")
	public String addNewSeller(Model model) {
		Seller s = new Seller();
		model.addAttribute("newSeller", s);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
    public String showUpdateSeller(@PathVariable("id") long id, Model model) {
        Seller s = sellerRepo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + s.toString());
        model.addAttribute("newSeller", s);
        return "input";
    }
	
	@PostMapping("/update/{id}")
    public String reviseSeller(Seller s, Model model) {
        sellerRepo.save(s);
        return viewAllSellers(model);
    }
	
	@GetMapping("/delete/{id}")
     public String deleteSeller(@PathVariable("id") long id, Model model) {
        Seller s = sellerRepo.findById(id).orElse(null);
        sellerRepo.delete(s);
        return viewAllSellers(model);
	}
	// end of the seller methods
	
	//the card methods of the web controller
	@GetMapping("/viewAllCards")
	public String viewAllCards(Model model) {
		if(cardRepo.findAll().isEmpty()) {
			return addNewCard(model);
	}
	model.addAttribute("cards", cardRepo.findAll());
	return "results";
	}
	@GetMapping("/inputCard")
	public String addNewCard(Model model) {
		Card c = new Card();
		model.addAttribute("newCard", c);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
    public String showUpdateCard(@PathVariable("id") long id, Model model) {
        Card c = cardRepo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + c.toString());
        model.addAttribute("newCard", c);
        return "input";
    }
	
	@PostMapping("/update/{id}")
    public String reviseCard(Card c, Model model) {
        cardRepo.save(c);
        return viewAllCards(model);
    }
	
	@GetMapping("/delete/{id}")
    public String deleteCard(@PathVariable("id") long id, Model model) {
        Card c = cardRepo.findById(id).orElse(null);
        cardRepo.delete(c);
        return viewAllCards(model);
	}
	// end of the card methods
	
	//the buyer methods of the web controller
	@GetMapping("/viewAllBuyers")
	public String viewAllBuyers(Model model) {
		if(buyerRepo.findAll().isEmpty()) {
			return addNewBuyer(model);
		}
		model.addAttribute("buyers", buyerRepo.findAll());
		return "results";
	}
	@GetMapping("/inputBuyer")
	public String addNewBuyer(Model model) {
		Buyer b = new Buyer();
		model.addAttribute("newBuyer", b);
		return "input";
	}
		
	@GetMapping("/edit/{id}")
	public String showUpdateBuyer(@PathVariable("id") long id, Model model) {
		Buyer b = buyerRepo.findById(id).orElse(null);
	    System.out.println("ITEM TO EDIT: " + b.toString());
	    model.addAttribute("newBuyer", b)
        return "input";
	    }
		
	@PostMapping("/update/{id}")
    public String reviseBuyer(Buyer b, Model model) {
		buyerRepo.save(b);
		return viewAllBuyers(model);
    }
	@GetMapping("/delete/{id}")
       public String deleteBuyer(@PathVariable("id") long id, Model model) {
	    Buyer b = buyerRepo.findById(id).orElse(null);
	    buyerRepo.delete(b);
	    return viewAllBuyers(model);
	}
	// end of the buyer methods

}
