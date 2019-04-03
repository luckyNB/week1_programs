package com.bridgelabz.algorithm;

/*
* @author :  Laxman Bhosale 
* @purpose:  program for finding entered string is palindrome or not 
* @Date   : 13/02/2019          
*/

public class Palindrome {

	public static void main(String[] args) {
		String str = "";
		str = Utility.inputString();
		str = str.toLowerCase();
		String arr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// System.out.println("Palindrome.main()");
			arr = arr + str.charAt(i);
			// System.out.println("Palindrome.main()");

		}
		System.out.println(arr);
		int flag = 0;

		if (str.equalsIgnoreCase(arr)) {
			flag = 1;

		}

		if (flag == 1) {
			System.out.println("Strings is a palindron");

		} else {
			System.out.println("Strings are not a palindron");

		}

	}
}
