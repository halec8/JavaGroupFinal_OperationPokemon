package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Seller;
import dmacc.repository.OperationPokemonRepository;

/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * Nov 16, 2021
 */

@Controller
public class SellerWebController {
	@Autowired
	OperationPokemonRepository sellerRepo;


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


}
