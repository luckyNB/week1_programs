package com.bridgelabz.fuctional;

import java.util.Scanner;
/*
* @author :  Laxman Bhosale 
* @purpose:  Program for getting the consequetly tripplet as zero if tripplet is there
*            then the counter will be incremented
* @Date   : 13/02/2019          
*/
public class SumOfThreeAddToZero {
	
	
	
	static Scanner s = new Scanner(System.in);

	public static void sum0count(int number) {
		int[] arr = new int[number];
		int count = 0;
		System.out.println("enter values");
		// taking integer input for creating array
		for (int i = 0; i < number; i++) {
			arr[i] = Utility.inputInteger();
		}
		// checking for triplets by loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		// output
		System.out.println("total pairs are " + count);

	}

	public static void main(String[] args) {

		System.out.println("enter no of inputs");
		int n = s.nextInt();
		sum0count(n);

	}
}
