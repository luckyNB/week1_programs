package com.dp.singlettonAll;

public class EagerInitialization {
	static EagerInitialization eager = new EagerInitialization();
	//private constructor
		private EagerInitialization() {
			System.out.println("EagerInitialization instance created");
		}

		public static EagerInitialization getInstance() {
			return eager; //return object
		}
}
