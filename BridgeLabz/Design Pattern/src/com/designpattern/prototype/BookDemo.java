package com.designpattern.prototype;

public class BookDemo {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bookShop1=new BookShop();
	bookShop1.setShopName("Shiv Book Shop");
	bookShop1.loadData();
	System.out.println(bookShop1);
	BookShop bookShop2=(BookShop)bookShop1.clone();
System.out.println(bookShop2);
}
}
