package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for calculating distance using the formula of euclidian distance
* where distance is got distance=squareroot(x*x+y*y);
* @Date   : 13/02/2019          
*/
public class Distance {
	public static void main(String[] args) {
		try {
			System.out.println("Enter x and y respectively");
			double xValue = Utility.inputDouble();
			double yValue = Utility.inputDouble();
			Utility.calculateDistace(xValue, yValue);
		} catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
		}

	}

}
