package com.dp.proxy;

public class ProxyPatternDemo {
public static void main(String[] args) {
	Image image=new  ProxyImage("test10_mb.jpg");
	image.display();
	System.out.println("");
	//Image image2=new RealImage("realImage.jpg");
//image.display();
}
}
