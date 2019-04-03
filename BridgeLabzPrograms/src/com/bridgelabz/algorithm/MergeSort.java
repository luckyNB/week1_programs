package com.bridgelabz.algorithm;


/*
* @author :  Laxman Bhosale 
* @purpose:  Program for Merge Sort for Integers
* @Date   :  13/02/2019          
*/

class MergeSort {

	// Driver method
	public static void main(String args[]) {
		System.out.println("Enter the number of elements of array");
		int num = Utility.inputNumber();
		System.out.println("Enter Array elements");
		int arr[] = new int[num];
		arr = Utility.inputArray(arr, num);

		Utility.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		Utility.printArray(arr);
	}
}
