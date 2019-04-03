package com.dp.singlettonAll;

public class SingleTonDesignPatternMainMethod {


	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		StaticBlockSingleton staticinstance = StaticBlockSingleton.getInstance(); // object for StaticBlockSingleton
																					// class
		EagerInitialization eager = EagerInitialization.getInstance(); // object for EagerInitialization class
		System.out.println("Eager Initialization Hash Code::"+eager.hashCode());
		LazyInitialization lazy = LazyInitialization.getInstance(); // object for LazyInitialization class
	System.out.println("Lazy 1 :::"+lazy.hashCode());	
		LazyInitialization lazy2 = LazyInitialization.getInstance();// object for LazyInitialization class
		// create 2 threads
		System.out.println("Lazy 2 :::"+lazy2.hashCode());	

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();// object for
									System.out.println("Thread Safe Singleton1::"+threadsafeinstance.hashCode());														// ThreadSafeSingleton class
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();// object for
				System.out.println("Thread Safe Singleton2::"+threadsafeinstance.hashCode());														// ThreadSafeSingleton class
																// ThreadSafeSingleton class
			}
		});
		t1.start();
		t2.start();
		BillPughSingleton billpugh = BillPughSingleton.getInstance();// object for BillPughSingleton class

		EnumSingletone enumsingletone = EnumSingletone.INSTANCE;
		enumsingletone.i = 2; // set value for i
		enumsingletone.display();
		SerializedSingleton serializable = SerializedSingleton.getInstance();
		serializable.serialVersionUID = 5; // set derisl version id
		System.out.println("Value of version ID = " + serializable.serialVersionUID);
	}
}
