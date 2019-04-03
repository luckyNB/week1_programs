package com.dp.proxy;

public class ProxyImage implements Image {
private RealImage image;
private String fileName;
	
	
	public ProxyImage(String fileName) {
//	super();
	this.fileName = fileName;
}


	public void display() {
		
		if(image==null) {
			image=new RealImage(fileName);	
		}
		image.display();
		// TODO Auto-generated method stub

	}

}
