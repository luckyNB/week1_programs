package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for Binary Search Integer values.
* @Date   : 13/02/2019          
*/

public class BinarySearch {
	public static void main(String[] args) {

		System.out.println("Enter the Number of Array elements ");

		int no = Utility.inputNumber();// Number of elements that must be in array

		int arr[] = new int[no];
		arr = Utility.inputArray(arr, no);// for getting array element

		System.out.println("Enter the element to be searched");
		int search = Utility.inputNumber();// getting element to be searched

		int data = Utility.binarySearch(arr, no, search);

		if (data >= 0 && data != -1) {
			System.out.println("Element is at locations:" + data);
		}

	}

}
