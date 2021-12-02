package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dmacc.beans.Buyer;
import dmacc.repository.BuyerRepository;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Nov 30, 2021
 */
@Controller
@RequestMapping("buyerController")
public class BuyerController {
	@Autowired
	BuyerRepository buyerRepo;
	//the buyer methods of the web controller
	@GetMapping("/viewAllBuyers")
	public String viewAllBuyers(Model model) {
		if(buyerRepo.findAll().isEmpty()) {
			return addNewBuyer(model);
		}
		model.addAttribute("buyers", buyerRepo.findAll());
		return "buyerresults";
		}
	@GetMapping("/inputBuyer")
	public String addNewBuyer(Model model) {
		Buyer b = new Buyer();
		model.addAttribute("newBuyer", b);
		return "inputbuyer";
	}
			
	@GetMapping("/edit/{id}")
	public String showUpdateBuyer(@PathVariable("id") long id, Model model) {
		Buyer b = buyerRepo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + b.toString());
		model.addAttribute("newBuyer", b);
	    return "inputbuyer";
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
	//end of the buyer methods	
}
