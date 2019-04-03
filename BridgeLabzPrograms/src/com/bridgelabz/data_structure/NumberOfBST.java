package com.bridgelabz.data_structure;

import java.util.Scanner;

/**
 * @author   : Laxman Bhosale
 * @purpose  : Program for finding the number of nodes in the Binary Search Tree
   @Date    : 08/03/2019
 *
 * */
/*using the formula for finding nodes:(2n!/(n!*n!))
 * 
 * */

public class NumberOfBST {
	/*static method for calculating factorial of number*/
	public static long factorial(long n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		try {
		
			Scanner scanner = new Scanner(System.in);
			long result1, result2, result3;
			System.out.println("enter number of tests:");
			int numberOfTest = scanner.nextInt();
			int testInput[] = new int[numberOfTest];
			System.out.println("Enter " + numberOfTest + " test values one by one:");
			for (int i = 0; i < numberOfTest; i++) {
				testInput[i] = scanner.nextInt();
			}

			for (int i = 0; i < testInput.length; i++) {
				result1 = factorial(2 * testInput[i]);
				result2 = factorial(testInput[i] + 1);
				result3 = factorial(testInput[i]);

				System.out.println(result1 / (result2 * result3));
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}
/***/
}