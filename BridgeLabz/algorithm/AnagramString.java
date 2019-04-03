package com.bridgelabz.algorithm;

/*@author Laxman Bhosale
 *purpose: program for checking two strings are anagram or not
 * */

public class AnagramString {

	public static void main(String[] args) {

		System.out.println("Are Anagram Strings or Not");

		String str1 = Utility.inputString();

		String str2 = Utility.inputString();
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		boolean b = Utility.areAnagram(str1.toLowerCase(), str2.toLowerCase());

		if (b) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Not Anagram Strings");
		}
	}
}
