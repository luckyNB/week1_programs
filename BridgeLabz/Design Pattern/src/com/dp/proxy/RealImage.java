package com.dp.proxy;

public class RealImage implements Image {
	private String file;

	public RealImage(String file) {

		this.file = file;
		loadFromDisk(file);	
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + file);
	}

	public void loadFromDisk(String file) {
		System.out.println("Loading :" + file);
	}

}
