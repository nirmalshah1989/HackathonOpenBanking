package com.jcombat.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ing.util.INGUtil;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {
	Map<String, List<Transaction>> transactionMap = new HashMap<String, List<Transaction>>();

	public TransactionRepositoryImpl() {
		List<Transaction> transactionList = null;
		
		for (int i = 0; i < 20; i++) {
			transactionList = new ArrayList<Transaction>();
			Transaction transaction = new Transaction(INGUtil.getRandomDate(),
					INGUtil.getRandomDoubleBetweenRange(1, 200), INGUtil.getRandomType());
			transactionList.add(transaction);
		}
		transactionMap.put("BE27123456781234", transactionList);
		
		for (int i = 0; i < 20; i++) {
			transactionList = new ArrayList<Transaction>();
			Transaction transaction = new Transaction(INGUtil.getRandomDate(),
					INGUtil.getRandomDoubleBetweenRange(1, 200), INGUtil.getRandomType());
			transactionList.add(transaction);
		}
		transactionMap.put("BE27123456789012", transactionList);
		
		for (int i = 0; i < 20; i++) {
			transactionList = new ArrayList<Transaction>();
			Transaction transaction = new Transaction(INGUtil.getRandomDate(),
					INGUtil.getRandomDoubleBetweenRange(1, 200), INGUtil.getRandomType());
			transactionList.add(transaction);
		}
		transactionMap.put("BE27876543218765", transactionList);
	}

	@Override
	public List<Transaction> getTransactions(String accountNumber) {
		List<Transaction> transactionList = new ArrayList<Transaction>();

		for (int i = 0; i < 20; i++) {
			Transaction transaction = new Transaction(INGUtil.getRandomDate(),
					INGUtil.getRandomDoubleBetweenRange(1, 200), INGUtil.getRandomType());

			transactionList.add(transaction);
		}

		transactionMap.put(accountNumber, transactionList);
		return transactionList;

	}

}
