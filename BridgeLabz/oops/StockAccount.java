package com.bridgelabz.oops;

import java.util.Date;

public class StockAccount {
	public StockAccount() {
		// TODO Auto-generated constructor stub
	}

	private String symbol = null;
	private int price = 0;
	Date date = new Date();

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
