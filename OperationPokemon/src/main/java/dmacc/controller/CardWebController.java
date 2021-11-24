package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Card;
import dmacc.repository.CardRepository;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 21, 2021
 */


@Controller
	public class CardWebController {
	@Autowired
	CardRepository cardRepo;
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
}
	

