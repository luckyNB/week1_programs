package com.bridgelabz.beans;

import java.util.Arrays;

public class Person {
	
	private String adharNo;
	private String name;
	private  int age;
	private String address;
	private String[] mobileNo;
	public Person(String adharNo, String name, int age, String address, String[] mobileNo) {
		super();
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + ", address=" + address + ", mobileNo="
				+ Arrays.toString(mobileNo) + "]";
	}
	
	

}
