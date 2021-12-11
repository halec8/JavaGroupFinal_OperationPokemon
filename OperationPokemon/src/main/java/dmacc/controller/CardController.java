package dmacc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dmacc.beans.Card;
import dmacc.beans.Seller;
import dmacc.beans.SellerCardList;
import dmacc.repository.CardRepository;
import dmacc.repository.SellerCardListRepository;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 21, 2021
 */


@Controller
@RequestMapping("/cardController")
public class CardController {
	@Autowired
	CardRepository cardRepo;
	@Autowired
	SellerCardListRepository SCLRepo;
	@GetMapping("viewAllCards")
	public String viewAllCards(Model model) {
		if(cardRepo.findAll().isEmpty()) {
			return addNewCard(model);
	}
	model.addAttribute("cards", cardRepo.findAll());
	return "cardresults"; 
	}
	@GetMapping("inputCard")
	public String addNewCard(Model model) {
		Card c = new Card();
		model.addAttribute("newCard", c);
		return "inputcard";
	}
	
	@GetMapping("/edit/{id}")
    public String showUpdateCard(@PathVariable("id") long id, Model model) {
        Card c = cardRepo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + c.toString());
        model.addAttribute("newCard", c);
        return "inputcard";
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
	@GetMapping("inputsellerlist")
	public String inputSellerList (Model model) {
		SellerCardList SCL = new SellerCardList();
		model.addAttribute("newSCL", SCL);
		Seller seller = new Seller();
		model.addAttribute("newSeller", seller);
		List<Card> cardList = cardRepo.findAll();
		if(cardRepo.findAll().isEmpty()) {
			return addNewCard(model);
		}
		model.addAttribute("allCardsToAdd", cardList);
		return "inputlist";
	}
	@PostMapping("inputlist")
	public String addSellerList (@ModelAttribute Seller seller, @ModelAttribute SellerCardList SCL, Model model) {
		SCL.setSeller(seller);
		SCLRepo.save(SCL);
		return viewAllCardLists(model);
	}
	/**
	 * @param model
	 * @return
	 */
	@GetMapping("viewcardlists")
	public String viewAllCardLists(Model model) {
		// TODO Auto-generated method stub
		List<SellerCardList> SCLList = SCLRepo.findAll();
		if(SCLRepo.findAll().isEmpty()) {
			return inputSellerList(model);
		}
		model.addAttribute("SCLList", SCLList);
		return "viewcardlists";
	}
}
	

