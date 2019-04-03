package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for performing operations on Two Dimensional array 
* @Date   : 13/02/2019          
*/

public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("Two Dimensional array Example");
		System.out.println("Enter the elements of array ");
		int[][] arr = new int[3][3];
		arr = Utility.input2DArray(arr);

		System.out.println("Data got in 2D array");
		Utility.disp2DArray(arr);

	}
}
