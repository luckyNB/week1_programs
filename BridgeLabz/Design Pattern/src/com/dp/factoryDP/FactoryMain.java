package com.dp.factoryDP;

public class FactoryMain {
public static void main(String[] args) {
	OperatingSystemFactory factory=new OperatingSystemFactory();
			OS obj=factory.getInstance("Laxman");
			obj.spec();
}
}
