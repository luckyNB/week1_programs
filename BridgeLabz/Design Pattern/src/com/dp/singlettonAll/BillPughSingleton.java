package com.dp.singlettonAll;

public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Bill pugh instance");
	}
//prive static inner class
	private static class SingletonInner {
		private static final BillPughSingleton billbughinstance = new BillPughSingleton();
	}
//get instance method
	public static BillPughSingleton getInstance() {
		return SingletonInner.billbughinstance;
	}
}