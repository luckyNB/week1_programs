package com.bridgelabz.algorithm;

import java.util.Arrays;
/*
* @author :  Laxman Bhosale 
* @purpose:  Program for finding out the elapsed time or execution for
*            bubble sort ,insertion sort and binary search.
* @Date   : 13/02/2019          
*/
public class ElapsedTimeForSearchingSorting {
	public static void main(String[] args) {
		double binarysearch = 0, bubbleSort = 0, insertionSort = 0;
		System.out.println("******Program for calculating Elapsed time*******");
		int[] arr = { 12, 13, 32, 43, 65, 43, 32, 56, 34, 212, 55, 32, 21, 65, 65, 21, 54, 87, 54, 423, 33 };
		binarysearch = Utility.binarySearchForElapsedTime(arr, arr.length, 65);
		bubbleSort = Utility.bubbleSortForElapsedTime(arr);
		insertionSort = Utility.insertionSortForElapsedTime(arr);
		double arr2[] = { binarysearch, bubbleSort, insertionSort };
		Arrays.sort(arr2);
		System.out.println("Elaped Time in Descending Order");
		for (int i = 2; i >= 0; i--) {
			System.out.println(" " + arr2[i]);
		}

	}

}
