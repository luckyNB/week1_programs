package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSortGenerics {
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
		

			object=Utility.insertionSortForGenerics(object,num);
			
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
