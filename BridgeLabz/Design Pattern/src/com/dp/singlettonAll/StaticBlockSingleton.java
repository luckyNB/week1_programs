package com.dp.singlettonAll;

public class StaticBlockSingleton {
	private static StaticBlockSingleton staticinstance;
	//private constructor
	private StaticBlockSingleton() {
		System.out.println("Static block initialization");
	}
	static {   //static block with exception handling
		try {
			staticinstance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	public static StaticBlockSingleton getInstance() {
		return staticinstance;
	}
}
