package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for getting prime factors of given integer number.
* @Date   :  15/02/2019          
*/
public class PrimeFactors {
	public static void main(String[] args) {

		int num = 0;
		System.out.println("Enter a number");
		num = Utility.inputNumber();
		Utility.calculatePrimeFactors(num);

	}
}
