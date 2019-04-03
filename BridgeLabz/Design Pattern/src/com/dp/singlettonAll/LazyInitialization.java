package com.dp.singlettonAll;

public class LazyInitialization {
	static LazyInitialization lazy; // lazy
 //private constructor
	private LazyInitialization() {
		System.out.println("LazyInitialization Instatnce created");
	}

	public static LazyInitialization getInstance() {
		if (lazy == null) {  //if object is not previously created then only create & return
			lazy = new LazyInitialization();
		}
		return lazy;
	}
}