package com.bridgelabz.model;

import com.bridgelabz.aspect.Loggabel;

public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	@Loggabel
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}	
}

