package com.jcombat.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

	@Autowired
	TransactionRepository transactionRepository;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/transactionProfiles")
	public String transactionProfiles() {
		System.out.println("transactionProfiles called");
		return "transactionProfiles";
	}

	@RequestMapping("/transactionDetails")
	public String transactionDetails(@RequestParam("number") String accountNumber, Model model) {
		System.out.println("transactionDetails called");
		model.addAttribute("transactionDetails", transactionRepository.getTransactions(accountNumber));
		return "transactionDetails";
	}
}
