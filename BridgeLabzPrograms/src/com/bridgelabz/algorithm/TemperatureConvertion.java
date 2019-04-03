package com.bridgelabz.algorithm;


/*
* @author :  Laxman Bhosale 
* @purpose:  Program for temperature conversion fahrenheit to cesius and vice versa
 *           in this program using the formula convertion is done
* @Date   :  13/02/2019          
*/
public class TemperatureConvertion {
	public static void main(String[] args) {
		System.out.println("Enter 1. To convert Celsius to Farenheight");
		System.out.println("Enter 2. To convert  Fareinheightto Celsius");
		int choice = Utility.inputNumber();

		double temp = Utility.inputDouble();
		switch (choice) {
		case 1:
			System.out.println("********** Temperature Convertion Celsius to Farenheight************");

			double converted = Utility.celsiusToFarenheight(temp);
			System.out.println("Converted Temperature:" + converted);
			break;

		case 2:
			System.out.println("********** Temperature Convertion  Farenheight to Celsius************");

			double converted2 = Utility.farenheightToCelsius(temp);
			System.out.println("Converted Temperature:" + converted2);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
