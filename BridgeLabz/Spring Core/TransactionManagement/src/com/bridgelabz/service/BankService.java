package com.bridgelabz.service;

import com.bridgelabz.dao.BankDAO;

public class BankService {
private BankDAO dao;

public void setDao(BankDAO dao) {
	this.dao = dao;
}

public boolean transferMoney(int srcNo,int destNo,int amt) {
	int result1=dao.withdraw(srcNo, amt);
	int result2=dao.deposite(srcNo, amt);
	
	if(result1==0||result2==0) {
		throw new RuntimeException("Money not transfered (Tx  rolled back)");
	}
	else {
		System.out.println("Money Transfered (Tx commited)");
		return true;
	}
	
	
	
}


}
