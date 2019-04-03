package com.dp.observerDPFinal;

public class MailClass {
public static void main(String[] args) {
	MailBox box=new MailBox();
	PostOffice office=new PostOffice("Shivaji Nagar ,Hingoli");
	office.addObserver(box);
	office.newMail();
	office.removeObserver(box);
	MailBox box2=new MailBox();
	office.addObserver(box2);
	office.newMail();
	office.removeObserver(box2);
	office.addObserver(box);
	office.newMail();
}
}
