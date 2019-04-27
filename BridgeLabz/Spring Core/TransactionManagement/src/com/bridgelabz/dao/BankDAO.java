package com.bridgelabz.dao;

public interface BankDAO {

	public int withdraw(int accno,int amt);
	public int deposite(int accno,int amt);
}
