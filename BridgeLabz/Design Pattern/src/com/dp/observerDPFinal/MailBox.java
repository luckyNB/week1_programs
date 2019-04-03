package com.dp.observerDPFinal;

public class MailBox implements Observer{
	String address;
	@Override
	public void update() {
			System.out.println("New Mail:)");
	}

}
