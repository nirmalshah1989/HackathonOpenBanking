package com.jcombat.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@RequestMapping("/profiles")
	public Profile[] all() {
		List<Profile> profiles = profileRepository.getAllProfiles();
		return profiles.toArray(new Profile[profiles.size()]);
	}
	
	@RequestMapping("/transactions")
	public String allT() {
		return "welcome";
	}
	
	@RequestMapping("/profiles/{id}")
	public Profile byId(@PathVariable("id") String userId) {
		Profile profile = profileRepository.getProfile(userId);
		return profile;
	}
	
	@RequestMapping("/transactions/{number}")
	public List<Transaction> byNumber(@PathVariable("number") String accountNumber) {
		List<Transaction> transactionList = transactionRepository.getTransactions(accountNumber);
		return transactionList;
	}
}