package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for calculating windchill using velocity and temperature.
* @Date   :  18/02/2019          
*/
public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter Tempeture in celsius and velocity km/hr respectively");
		double temperature = Double.parseDouble(args[0]);
		double velocity = Double.parseDouble(args[1]);

		double fareiheight = (temperature) * (9 / 5) + 32;// for conveting temperature in fahrenheit
		double miles = velocity * 0.62137;// for converting km's into miles
		double windChill = 35.75 + 0.6215 * fareiheight + (0.4275 - 35.75) * Math.pow(miles, 0.16);// using formula
																									// converting into
																									// windchill
		System.out.println(windChill);

	}
}
