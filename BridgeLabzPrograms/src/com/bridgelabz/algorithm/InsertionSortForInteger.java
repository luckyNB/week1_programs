package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for insertion sort for integers
* @Date   :  13/02/2019          
*/

public class InsertionSortForInteger {
	public static void main(String[] args) {

		System.out.println("********Insertion sort for Integers***********");
		int no = 0;
		// int arr1[]=new int[no];
		System.out.println("Enter the no of elements");
		no = Utility.inputNumber();

		int[] arr = new int[no];
		arr = Utility.inputArray(arr, no);

		System.out.println("Array Elements before sorting");
		Utility.printArray(arr);

		arr = Utility.insertionSort(arr);

		System.out.println("After Sorting Array elements are:");
		Utility.printArray(arr);

	}

}
