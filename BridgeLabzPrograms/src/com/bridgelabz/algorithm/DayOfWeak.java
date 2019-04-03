package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose: Program for getting day of week based on entered day ,month and year using the formuls.
* @Date   : 13/02/2019          
*/

public class DayOfWeak {

	public static void main(String[] args) {
		int day = 0, month = 0, year = 0, dayOfWeak = 0;
		System.out.println("************Finding Day of a week using Formula*********************");
		System.out.println("Enter a Day");
		day = Utility.inputNumber();

		System.out.println("Enter a Month");
		month = Utility.inputNumber();

		System.out.println("Enter a Year");
		year = Utility.inputNumber();

		dayOfWeak = Utility.dayOfWeek(day, month, year);
		System.out.println("Day of Weak is:" + dayOfWeak);

	}

}
