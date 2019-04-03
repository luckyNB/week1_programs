package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for insertion sort for strings
* @Date   :  13/02/2019          
*/

public class InsertionSortForString {
	public static void main(String[] args) {
		System.out.println("********Insertion sort for Strings***********");
		int no = 0;
		String str[] = new String[no];
		System.out.println("Enter the no of elements");
		no = Utility.inputNumber();

		String[] str1 = new String[no];
		str1 = Utility.inputStringArray(no);

		System.out.println("Array Elements before sorting");
		Utility.printStringAray(str1, no);

		str = Utility.insertionStringSort(str1, no);

		System.out.println("After Sorting Array elements are:");
		Utility.printStringAray(str, no);

	}

}
