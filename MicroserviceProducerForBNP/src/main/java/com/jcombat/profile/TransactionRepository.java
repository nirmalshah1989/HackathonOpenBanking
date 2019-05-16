package com.jcombat.profile;

import java.util.List;

public interface TransactionRepository {

	List<Transaction> getTransactions(String accountNumber);
}
