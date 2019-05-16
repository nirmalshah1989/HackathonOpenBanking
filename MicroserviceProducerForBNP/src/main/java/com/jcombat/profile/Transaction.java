package com.jcombat.profile;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date date;
	private double amount;
	private String type;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", amount=" + amount + ", type=" + type + "]";
	}

	public Transaction(Date date, double amount, String type) {
		super();
		this.date = date;
		this.amount = amount;
		this.type = type;
	}

	public Transaction() {
		super();
	}

}
