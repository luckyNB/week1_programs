package com.bridgelabz.algorithm;
/*
* @author :  Laxman Bhosale 
* @purpose:  Program for Bubble Sort String values.
* @Date   : 13/02/2019          
*/

public class BubbleSortForString {
	public static void main(String[] args) {
		System.out.println("Enter the no of Strings to be entered");
		int num = Utility.inputNumber();
		String[] str1 = new String[num];
		System.out.println("Enter the elements of array of String");
		str1 = Utility.inputStringArray(num);
		String[] str3 = new String[num];
		str3 = Utility.bubbleStringSort(str1, num);
		System.out.println("After Sorting the Strings are as Follows:");
		Utility.printStringAray(str3, num);

	}

}
