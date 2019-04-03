package com.bridgelabz.fuctional;

public class StringPermutation {
	
	/*
	* @author :  Laxman Bhosale 
	* @purpose:  Program for making the permutations of the string
	* @Date   : 13/02/2019          
	*/
	public static void main(String[] args) {
		String str = "ABCD";
		//str = Utility.inputString();
		int length = str.length();
		// Permutation permutation = new Permutation();
		Utility.permute(str, 0, length- 1);
		System.out.println("Number of Permutations" + Utility.count);
	}
}