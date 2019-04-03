package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for getting confirmation that enterred year is leap or not.
* @Date   :  13/02/2019          
*/
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("********Checking YEAR Leap or not*********");
		int year = Utility.getYear();
		boolean check = Utility.checkYear(year);
		if (check) {
			System.out.println("Year is Leap");
		} else {
			System.out.println("Not a leap year");
		}
	}

}
