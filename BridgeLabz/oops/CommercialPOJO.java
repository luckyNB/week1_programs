package com.bridgelabz.oops;

public class CommercialPOJO {
	private String companyName;
	private String symbol;
	private String symbolValue;
	private String date;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbolValue() {
		return symbolValue;
	}

	public void setSymbolValue(String symbolValue) {
		this.symbolValue = symbolValue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CommercialPOJO [companyName=" + companyName + ", symbol=" + symbol + ", symbolValue=" + symbolValue
				+ ", date=" + date + "]";
	}

}
