package com.wallet.model;

public class DTHPayment extends DTHCustomer {
	private int amount;
	private int id;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
