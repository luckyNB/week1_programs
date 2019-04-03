package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for guessing a number firstly keep number into mind 
 *           and then just enter 0 or 1 if number is greater then enter 1 else 0
* @Date   : 13/02/2019          
*/
public class GuessingNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num = Utility.inputNumber();
		Utility.guess(num);
	}
}