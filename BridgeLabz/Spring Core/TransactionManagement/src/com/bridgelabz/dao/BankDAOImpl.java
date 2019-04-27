package com.bridgelabz.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO{
 private JdbcTemplate jt;
 
 private static final String WITHDRAW_QRY="update tx_account set balance=balance-? where accno=?";
 private static final String DEPOSITE_QRY="update tx_account set balance=balance+? where accno=?";
 
 
 
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	@Override
	public int withdraw(int accno, int amt) {
		int cnt=jt.update(WITHDRAW_QRY,amt,accno);
		// TODO Auto-generated method stub
		return cnt;
	}

	@Override
	public int deposite(int accno, int amt) {
		int cnt=jt.update(DEPOSITE_QRY,amt,accno);
		
		
		// TODO Auto-generated method stub
		return cnt;
	}

}
