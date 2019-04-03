package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSortGenerics {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a no of elements:");
		int num=Utility.inputNumber();
		
		Object object[]=new Object[num];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<num;i++) {
			System.out.println("Enter element::");
			object[i]=scanner.nextLine();
			
		}
		System.out.println("Enter 1. for String Bubble Sorting");
		System.out.println("Enter 2. for Integer Bubble Sorting");
		

			object=Utility.bubbleSortForGenerics(object,num);
			
	System.out.println("Sorted Array::");
	for (int i = 0; i < object.length; i++) {
		System.out.println(object[i]);
	}
		for(int i=0;i<num;i++) {
		
			System.out.println(object[i].hashCode());
			
		}
		scanner.close();
	}

}
