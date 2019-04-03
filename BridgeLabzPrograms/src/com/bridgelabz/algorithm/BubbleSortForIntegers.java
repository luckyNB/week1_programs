package com.bridgelabz.algorithm;

import java.util.Scanner;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for Bubble Sort Integer values.
* @Date   : 13/02/2019          
*/

public class BubbleSortForIntegers {

	public static void main(String[] args) {

		System.out.println("********Program for Bubble Sort*********");

		System.out.println("Enter the the no of element should be array of integer numbers");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();

		int[] arr = new int[no];
		int[] arr2 = new int[no];

		arr = Utility.inputArray(arr, no);

		System.out.println("Array elements before sotring");
		Utility.printArray(arr);

		arr2 = Utility.bubbleSort(arr);
		System.out.println("Array elements After sotring");
		Utility.printArray(arr2);

		scanner.close();

	}

}
