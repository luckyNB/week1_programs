package com.dp.observerDPFinal;

import java.util.ArrayList;

public class PostOffice implements Subject {
	
	private String address;
	
	public String getAddress() {
		return address;
	}

private ArrayList<Observer> observers;



 
public PostOffice(String address) {
	// TODO Auto-generated constructor stub
this.address=address;
observers=new ArrayList<Observer>();

}


public void newMail() {
	notifyObserver();
}









	public PostOffice(String address, ArrayList<Observer> observers) {
	super();
	this.address = address;
	this.observers = observers;
}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
 for (int i = 0; i < observers.size(); i++) {
	observers.get(i).update();
}
	}



}
