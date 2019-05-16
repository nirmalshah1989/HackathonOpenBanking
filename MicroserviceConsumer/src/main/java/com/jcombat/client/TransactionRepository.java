package com.jcombat.client;

import java.util.List;

public interface TransactionRepository {

	List<Transaction> getTransactions(String accountNumber);
}
