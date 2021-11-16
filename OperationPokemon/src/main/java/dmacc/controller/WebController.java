package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.repository.OperationPokemonRepository;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */

@Controller
public class WebController {
	@Autowired
	OperationPokemonRepository repo;

	@GetMapping("/viewAll")
	public String viewAllSellers(Model model) {
	model.addAttribute("sellers", repo.findAll());
	return "results";
	}

}
