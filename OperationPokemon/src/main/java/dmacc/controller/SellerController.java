package dmacc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dmacc.beans.Card;
import dmacc.beans.Seller;
import dmacc.beans.SellerCardList;
import dmacc.repository.CardRepository;
import dmacc.repository.OperationPokemonRepository;
import dmacc.repository.SellerCardListRepository;


/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * Nov 16, 2021
 */

@Controller
@RequestMapping("sellerController")
public class SellerController {
	@Autowired
	OperationPokemonRepository sellerRepo;
	@Autowired
	SellerCardListRepository SCLRepo;
	@Autowired
	CardRepository cardRepo;
	@GetMapping("/")
	public String index (Model model) {
		return "index";
	}
	//the seller methods of the web controller
	@GetMapping("/viewAllSellers")
	public String viewAllSellers(Model model) {
		if(sellerRepo.findAll().isEmpty()) {
			return addNewSeller(model);
	}
	model.addAttribute("sellers", sellerRepo.findAll());
	return "sellerresults";
	}
	
	@GetMapping("/inputSeller")
	public String addNewSeller(Model model) {
		Seller s = new Seller();
		model.addAttribute("newSeller", s);
		return "inputseller";
	}
	
	@GetMapping("/edit/{id}")
    public String showUpdateSeller(@PathVariable("id") long id, Model model) {
        Seller s = sellerRepo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + s.toString());
        model.addAttribute("newSeller", s);
        return "inputseller";
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
	@GetMapping("/inputsellerlist")
	public String inputSellerList (Model model) {
		List<Seller> sellerList = sellerRepo.findAll();
		model.addAttribute("sellerList", sellerList);
		List<Card> cardList = cardRepo.findAll();
		model.addAttribute("allCardsToAdd", cardList);
		return "inputlist";
	}
	@PostMapping("/inputsellerlist")
	public String addSellerList (Model model) {
		SellerCardList SCL = new SellerCardList();
		SCLRepo.save(SCL);
		return viewAllCardLists(model);
	}
	/**
	 * @param model
	 * @return
	 */
	@GetMapping("/viewcardlists")
	private String viewAllCardLists(Model model) {
		// TODO Auto-generated method stub
		List<SellerCardList> SCLList = SCLRepo.findAll();
		model.addAttribute("SCLList", SCLList);
		return "viewcardlists";
	}

	// end of the seller methods
}

