package com.jcombat.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteTransactionRepositoryING implements TransactionRepository {
	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public RemoteTransactionRepositoryING(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
	}

	@Override
	public List<Transaction> getTransactions(String accountNumber) {
		return restTemplate.getForObject(serviceUrl + "/transactions/{number}",
				List.class, accountNumber);

	}

}
