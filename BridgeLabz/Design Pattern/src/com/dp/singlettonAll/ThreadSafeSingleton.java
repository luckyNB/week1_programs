package com.dp.singlettonAll;


public class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadsafeinstance;

	private ThreadSafeSingleton() {
		System.out.println("Thread Safe instance created ");
	}
//synchornized method
	public static synchronized ThreadSafeSingleton getInstance() {
		if (threadsafeinstance == null) {
			threadsafeinstance = new ThreadSafeSingleton();
		}
		return threadsafeinstance; //return object
	}
}