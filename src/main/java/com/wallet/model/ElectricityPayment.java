package com.wallet.model;
public class ElectricityPayment extends ElectricityConsumer{
	private int amount;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		
}

