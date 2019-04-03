package com.bridgelabz.data_structure;

import java.util.Scanner;

/**
 * @author : Laxman Bhosale
 * @purpose: Program for checking the string is palindrome or not using Deque .
 * @Date   : 04/03/2019
 *
 * */
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String input = sc.next();
		sc.close();
		if (Utility.palindromCheker(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");

	}

}