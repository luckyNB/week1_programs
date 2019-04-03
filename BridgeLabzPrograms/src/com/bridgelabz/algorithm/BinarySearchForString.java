package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for checking two strings are anagram or not.
* @Date   : 13/02/2019          
*/
public class BinarySearchForString {

	public static void main(String[] args) {
		String str[];
		int num = 0;
		System.out.println("Enter the number of elements that should be in String Array:");
		num = Utility.inputNumber();
		str = new String[num];
		str = Utility.inputArrayOfString(str, num);
		System.out.println("Enter the String that you want to search");
		String x = Utility.inputString();

		int result = Utility.binarySearch(str, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);

	}
}
